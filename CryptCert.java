import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CryptCert {

	public static void main(String[] args) {

		CreateCert("/root/Schreibtisch/test/cert");

		GetKey("/root/Schreibtisch/test/cert");
	}

	public static void CreateCert(String url) {
		File f = new File(url);

		if (!f.exists()) {
			try {

				PrintWriter w = new PrintWriter(f);
				char[] c = new char[2048];
				for (int i = 0; i < c.length; i++) {
					int ma = (int) (Math.random() * 30 + 65);
					c[i] = (char) ma;

				}
				w.write(String.valueOf(c));

				w.flush();
				w.close();

				
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	public static String GetKey(String file) {
		try {
			File f = new File(file);
			if (f.exists()) {
				Scanner src = new Scanner(f);
				String txt = "";
				while (src.hasNextLine()) {

					txt = txt + src.nextLine();
				}

				return txt;

			}
		} catch (Exception e) {

		}
		return null;

	}
}

