package cz.gyarab.prg3e.s2;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.*;
import java.util.Arrays;

public class GeneratorKlice {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        KeyPairGenerator keyGenerator = KeyPairGenerator.getInstance("RSA");
        keyGenerator.initialize(512);
        KeyPair keyPair = keyGenerator.generateKeyPair();

        Path fn = Paths.get("mujklicPublic.dat");
        PublicKey   publicKey = keyPair.getPublic();
        byte[] buf = publicKey.getEncoded();
        Files.write(fn, buf);

        System.out.println(publicKey);

        Files.write(Paths.get("mujklicPrivate.data"), keyPair.getPrivate().getEncoded());


    }
}
