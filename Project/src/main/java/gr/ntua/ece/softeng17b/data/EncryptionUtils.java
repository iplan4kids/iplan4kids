package gr.ntua.ece.softeng17b.data;
import org.springframework.security.crypto.bcrypt.*;

public class EncryptionUtils {

    public EncryptionUtils() {

    }

    public String encryptPass(String pass){
        return BCrypt.hashpw(pass, BCrypt.gensalt());
    }

    public boolean encryptMatch(String pass, String enc_pass){
        if (BCrypt.checkpw(pass, enc_pass))
            return true;
        else
            return false;
    }


}
