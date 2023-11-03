package cz.gyarab.prg3e.s1;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.kerberos.EncryptionKey;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Sifruj {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, IOException {
        String vstup = "ahoj svete!";

        byte[] k = Files.readAllBytes(Paths.get("klic.dat"));
        SecretKey key = new SecretKeySpec(k, "AES");

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] out = cipher.doFinal(vstup.getBytes());

        System.out.println(Arrays.toString(out));
    }
}
