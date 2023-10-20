package cz.gyarab.prg3e.s1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Normalizer;


public class FAnalyza {
    public static void main(String[] args) throws IOException {
        String vstup = Files.readString(Paths.get("complet.txt"));

        vstup = Normalizer.normalize(vstup, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

        int cetnost[] = new int[41];

        for (Character ch: vstup.toCharArray())  {
            char malePismeno = Character.toLowerCase(ch);
            System.out.println(malePismeno + " " + (int)malePismeno);

            cetnost[(int)malePismeno - (int)'a']++;
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " : " + cetnost[(int)ch-(int)'a']);
        }

    }
}
