package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdSecurityService {
	
	public String encode(String text) {		
		Encoder encoder = Base64.getEncoder();
		String encodeToString = encoder.encodeToString(text.getBytes());
		return encodeToString;
		System.out.print("vm controller");
	}
}
