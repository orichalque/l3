import java.security.*;

public class SHA512 extends Hashor {
	
	public String crypt(String s) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			md.update(s.getBytes());
			byte[] output = md.digest();
			return (bytesToHex(output));
		 } catch (Exception e) {
			System.out.println("Erreur SHA512");
		 }
		 return("");
	}
}
