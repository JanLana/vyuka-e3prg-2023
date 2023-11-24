package cz.gyarab.prg3e.s1;

import com.google.common.primitives.Bytes;

import javax.crypto.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class SifrovadloProHloupe {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, IOException {

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey key = keyGenerator.generateKey();

        String message = "Nazdar programatore!";
        byte[] messageInBytes = message.getBytes();

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] zasifrovanaZprava = cipher.doFinal(messageInBytes);

        MojeZprava m = new MojeZprava(key, zasifrovanaZprava);



        byte[] klic = key.getEncoded();
        System.out.println(Arrays.toString(klic));



        byte[] out = Bytes.concat(klic, zasifrovanaZprava);
        String outStr = Base64.getEncoder().encodeToString(out);

        Files.writeString(Paths.get("zprava.txt"), outStr);
    }
}
