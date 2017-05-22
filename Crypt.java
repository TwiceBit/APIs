
public class Crypt {

	public static String Crypt(String text, String passwd) {
		String txt = text;
		String cash;
		String pw = passwd + passwd + passwd + passwd + passwd + passwd + passwd + passwd + passwd + passwd + passwd
				+ passwd + passwd + passwd + passwd + passwd + passwd + passwd + passwd + passwd + passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd;
		char[] c = text.toCharArray();
		char[] p = pw.toCharArray();
		char[] tx = new char[c.length];

		for (int i = 0; i < c.length; i++) {
			int t = ((int) c[i]);
			int g = ((int) p[i]);
			int n = t + g;
			tx[i] = (char) n;

		}

		return String.valueOf(tx);
	}

	public static String DeCrypt(String text, String passwd) {
		String txt = text;
		String cash;
		String pw = passwd + passwd + passwd + passwd + passwd + passwd + passwd + passwd + passwd + passwd + passwd
				+ passwd + passwd + passwd + passwd + passwd + passwd + passwd + passwd + passwd + passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd+ passwd;
		char[] c = text.toCharArray();
		char[] p = pw.toCharArray();
		char[] tx = new char[c.length];

		for (int i = 0; i < c.length; i++) {
			int t = ((int) c[i]);
			int g = ((int) p[i]);
			int n = t - g;
			tx[i] = (char) n;

		}

		return String.valueOf(tx);
	}

}

