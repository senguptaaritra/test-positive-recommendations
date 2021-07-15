import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

public class App 
{
	public static void good() throws NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
	}

	public static void bad() throws NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
	}
	
	public static void badTwo() throws NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher cipher = Cipher.getInstance("blah");
	}

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {
		System.out.println("Welcome to this little App!");
		good();
		bad();
		badTwo();
		System.exit(0);
	}
}
