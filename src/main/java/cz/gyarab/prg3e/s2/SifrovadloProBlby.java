package cz.gyarab.prg3e.s2;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class SifrovadloProBlby {


    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, IOException {
        String message = "ahoj programatore";

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey key = keyGenerator.generateKey();
        byte[] klicJakoPosloupnostBajtu = key.getEncoded();
        String klicJakoString = Base64.getEncoder().encodeToString(klicJakoPosloupnostBajtu);

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] zpravaJakoPosloupnostBajtu = cipher.doFinal(message.getBytes());

        String zpravaJakoString = Base64.getEncoder().encodeToString(zpravaJakoPosloupnostBajtu);

        Files.writeString(Paths.get("zprava2.txt"),
                klicJakoString + "\n" + zpravaJakoString);
    }
}
