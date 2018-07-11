
public class Crypt {

	public static String Crypt(String text, String passwd) {
		String txt = text;
		String pw = passwd;
		char[] c = text.toCharArray();
		char[] p = pw.toCharArray();
		char[] tx = new char[c.length];

		
		int l = 0;
		for (int i = 0; i < c.length; i++) {
			int t = ((int) c[i]);
			int g = ((int) p[l]);
			int n = t + g;
			tx[i] = (char) n;
			if(l != p.length - 1) l++;
			else l = 0;
				
			

		}

		return String.valueOf(tx);
	}

	public static String DeCrypt(String text, String passwd) {
		String txt = text;
		String pw = passwd;
		char[] c = text.toCharArray();
		char[] p = pw.toCharArray();
		char[] tx = new char[c.length];

		int l = 0;
		for (int i = 0; i < c.length; i++) {
			int t = ((int) c[i]);
			int g = ((int) p[l]);
			int n = t - g;
			tx[i] = (char) n;
			if(l != p.length - 1) l++;
			else l = 0;

		}

		return String.valueOf(tx);
	}

}

