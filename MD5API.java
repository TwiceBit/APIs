import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5API {

	public static String MD5(String text){
		String hash = null;
		try {
			MessageDigest msgd = MessageDigest.getInstance("MD5");
			msgd.reset();
			msgd.update(text.getBytes());
			BigInteger bint = new BigInteger(1, msgd.digest());
			hash = bint.toString(16);
			while(hash.length() < 32){
				hash = 0 + hash;
			}
		} catch (NoSuchAlgorithmException e) {;
		}
		return hash;
	}
	
}
