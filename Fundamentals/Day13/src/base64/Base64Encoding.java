package base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Encoding {

	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getEncoder();
		String normalString = "username:password";
		String encodedString = encoder.encodeToString(normalString.getBytes(StandardCharsets.UTF_8));
		System.out.println(encodedString);
		
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] decodeByteArray = decoder.decode(encodedString);
		
		System.out.println(new String(decodeByteArray));
	}

}
