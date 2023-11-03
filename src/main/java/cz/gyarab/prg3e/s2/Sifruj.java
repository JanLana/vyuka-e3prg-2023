package cz.gyarab.prg3e.s2;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Sifruj {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, IOException {
        String str = "ahoj studenti";

        Path jmenoSouboru = Paths.get("mujklic.dat");
        byte[] k = Files.readAllBytes(jmenoSouboru);

        SecretKey key = new SecretKeySpec(k, "AES");

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] out = cipher.doFinal(str.getBytes());

        System.out.println(Arrays.toString(out));
    }
}
