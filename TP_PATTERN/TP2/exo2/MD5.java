import java.security.*;

public class MD5 extends Hashor {
	
	public String crypt(String s) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(s.getBytes());
			byte[] output = md.digest();
			return (bytesToHex(output));
		 } catch (Exception e) {
			System.out.println("Erreur MD5");
		 }
		 return("");
	}
}
