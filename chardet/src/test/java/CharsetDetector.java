import org.mozilla.intl.chardet.nsDetector;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * <pre>
 *     author : liao lin tao
 *     time   : 2021/3/11 18:43
 *     desc   :
 * </pre>
 */

public class CharsetDetector {

    private static final String NO_MATCH = "nomatch";
    private static final String CHARSET_ASCII = "ascii";
    private boolean found = false;
    private String foundCharset;

    public CharsetDetector() {
    }

    public String detectCharset(String path) throws IOException {
        return detectCharset(new File(path));
    }

    public String detectCharset(File file) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            return detectCharset(inputStream);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return NO_MATCH;
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /**
     * Tries to guess the charset of a given file using Mozilla's automatic
     * charset detection algorithm
     *
     * @param inStream InputStream from the file to be detected
     * @return detected charset name (e.g. "UTF-8") or "nomatch" if no known
     * charset can be guessed
     */
    public String detectCharset(InputStream inStream) throws IOException {

        if (inStream == null) {
            return NO_MATCH;
        }

        nsDetector detector = new nsDetector();

        detector.Init(charset -> {
            CharsetDetector.this.found = true;
            CharsetDetector.this.foundCharset = charset;
            System.out.println("notify found charset = " + foundCharset);
        });

        BufferedInputStream bis = null;
        try {
            bis = new BufferedInputStream(inStream);
            return detectCharsetImpl(detector, bis);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return NO_MATCH;
        } finally {
            bis.close();
        }
    }

    private String detectCharsetImpl(nsDetector detector, BufferedInputStream bis) throws IOException {
        byte[] buf = new byte[1024];
        int len;
        boolean done = false;
        boolean isAscii = true;
        while ((len = bis.read(buf, 0, buf.length)) != -1) {

            // Check if the stream is only ascii.
            if (isAscii) {
                isAscii = detector.isAscii(buf, len);
            }

            // DoIt if non-ascii and not done yet.
            if (!isAscii && !done) {
                done = detector.DoIt(buf, len, false);
            }

            if (found) {
                // TODO: 2021/3/12 fast found, or Scan files completely?
                System.out.println("found charset = " + foundCharset);
                break;
            }
        }
        detector.DataEnd();

        if (isAscii) {
            found = true;
            return CHARSET_ASCII;
        }

        if (!found) {
            String[] prob = detector.getProbableCharsets();
            foundCharset = prob[0];
        }
        found = false;
        return foundCharset;
    }

}
