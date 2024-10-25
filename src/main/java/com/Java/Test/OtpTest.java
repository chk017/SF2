package com.Java.Test;

//import com.github.agustinvinao.pyotp.TOTP;
import de.taimos.totp.TOTP;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;

//public class OtpTest {

public class OtpTest {


    public static String getTOTPCode(String secretKey) {
        Base32 base32 = new Base32();
        byte[] bytes = base32.decode(secretKey);
        String hexKey = Hex.encodeHexString(bytes);
        return TOTP.getOTP(hexKey);
    }

    public static void main(String args[]) {
    
    
    
    String secretKey = "KOMP3UOBGXAB6RY6"; //      matest
    
    

    String code = getTOTPCode(secretKey);
    System.out.println("code : " + code);
    }
}