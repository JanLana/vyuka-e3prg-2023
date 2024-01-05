package cz.gyarab.prg3e.s1;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.*;
import java.util.Base64;

public class Klicnik {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        KeyPairGenerator keyGenerator = KeyPairGenerator.getInstance("RSA");
        keyGenerator.initialize(512);
        KeyPair key = keyGenerator.generateKeyPair();

        String privatni = Base64.getEncoder().encodeToString(key.getPrivate().getEncoded());
        String verejny = Base64.getEncoder().encodeToString(key.getPublic().getEncoded());

        System.out.println("Privatni klic: " + privatni);
        System.out.println("Verejny klic: " + verejny);
/*


        Files.write(Paths.get("klicPrivate.dat"), key.getPrivate().getEncoded());

        PublicKey privateKey = key.getPublic();
        Path fn = Paths.get("klicPublic.dat");
        byte[] buf = privateKey.getEncoded();
        Files.write(fn, buf);

        String encodedString = Base64.getEncoder().encodeToString(buf);
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        System.out.println(encodedString);

 */
    }
}
