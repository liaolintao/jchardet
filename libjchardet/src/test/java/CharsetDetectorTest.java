import org.mozilla.intl.CharsetDetector;

/**
 * <pre>
 *     author : liao lin tao
 *     time   : 2021/3/18 10:20
 *     desc   :
 * </pre>
 */
public class CharsetDetectorTest {

    public static void main(String[] args) {
        detectCharset("D:\\书\\raw\\txt\\part0152.txt");
        detectCharset("D:\\书\\raw\\txt\\[精校]斗罗大陆.txt");
        detectCharset("D:\\书\\raw\\txt\\三剑客_utf_-16_le[1].txt");
        detectCharset("D:\\书\\raw\\txt\\三剑客_utf_-16_be[1].txt");
    }

    private static void detectCharset(String filePath) {
        try {
            System.out.println("--- start detect ---");
            String detectCharset = new CharsetDetector().detectCharset(filePath);
            System.out.println(CharsetDetectorTest.class.getCanonicalName() + ", " + filePath + " = " + detectCharset);
            System.out.println("--- end detect ---");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
