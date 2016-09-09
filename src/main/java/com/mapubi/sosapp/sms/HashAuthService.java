package com.mapubi.sosapp.sms;

//import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* Service to get the hashed key to send in request: Base64.
* @author dassi
*
*/

@Service
@Transactional
public class HashAuthService {

	public String hashAuthHeader() {
		byte[] encodedAuth = Base64.encodeBase64(SMSConstant.authorisationHeader.getBytes());
		String base64Creds = new String(encodedAuth); //----> just if you
		return base64Creds;
	}
}
