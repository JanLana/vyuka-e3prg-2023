package cz.gyarab.prg3e.s1;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.security.cert.Certificate;

public class Certifikaty {
    public static void main(String[] args) throws IOException {
        URL destinationURL = new URL("https://www.google.com");
        HttpsURLConnection conn = (HttpsURLConnection) destinationURL.openConnection();
        conn.connect();
        Certificate[] certs = conn.getServerCertificates();
        System.out.println("delka seznamu:" + certs.length);
        System.out.println(certs[2]);
//
//        for(Certificate c : certs) {
//            System.out.println(c);
//        }
    }
}
