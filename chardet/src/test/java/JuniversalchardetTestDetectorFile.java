import org.mozilla.universalchardet.UniversalDetector;

import java.io.IOException;

public class JuniversalchardetTestDetectorFile {

	public static void main (String[] args) throws java.io.IOException {
		detectCharset("D:\\书\\raw\\txt\\part0152.txt");
		detectCharset("D:\\书\\raw\\txt\\[精校]斗罗大陆.txt");
		detectCharset("D:\\书\\raw\\txt\\三剑客_utf_-16_le[1].txt");
		detectCharset("D:\\书\\raw\\txt\\part0152-UTF-16le.txt");
		detectCharset("D:\\书\\raw\\txt\\三剑客_utf_-16_be[1].txt");
	}

	private static void detectCharset(String path) throws IOException {
		java.io.File file = new java.io.File(path);
		String encoding = UniversalDetector.detectCharset(file);
		if (encoding != null) {
			System.out.println(path + ", Detected encoding = " + encoding);
		} else {
			System.out.println(path + ", No encoding detected.");
		}
	}
}