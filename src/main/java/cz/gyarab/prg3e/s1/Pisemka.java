package cz.gyarab.prg3e.s1;

import com.google.common.base.Splitter;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.util.Base64;

public class Pisemka {

    public static void main(String[] args) throws IllegalBlockSizeException, BadPaddingException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException {

    String message1 = "Nic neposiluje autoritu tolik jako ticho.\nAutor: Leonardo Da Vinci";
    String message2 = "Představte si to ticho, kdyby lidé říkali jen to, co vědí.\nAutor: Karel Čapek";

    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
    keyPairGenerator.initialize(1024);
    KeyPair keyPair = keyPairGenerator.generateKeyPair();

    PublicKey publicKey = keyPair.getPublic();
    PrivateKey privateKey = keyPair.getPrivate();

    Cipher cipher = Cipher.getInstance("RSA");
    cipher.init(Cipher.PUBLIC_KEY, publicKey);

    byte[]  m1 = cipher.doFinal(message1.getBytes());
    byte[]  m2 = cipher.doFinal(message2.getBytes());

    String str1 = Base64.getEncoder().encodeToString(m1);
    String str2 = Base64.getEncoder().encodeToString(m2);

    String key = Base64.getEncoder().encodeToString(privateKey.getEncoded());

        System.out.println("Klic");

        printit(key);

        System.out.println("m1");

        printit(str1);

        System.out.println("m2");

        printit(str2);


    }

    private static void printit(String key) {
        String out = "";
        for (String l: Splitter.fixedLength(80).split(key))
            out += l+"\\n";
        System.out.println(out);
    }

}

