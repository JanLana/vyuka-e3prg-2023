package cz.gyarab.prg3e.s2;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratorKlice {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey key = keyGenerator.generateKey();

        byte[] k = key.getEncoded();

        Path jmenoSouboru = Paths.get("mujklic.dat");
        Files.write(jmenoSouboru, k);

        System.out.println(Arrays.toString(k));
    }
}
