package cz.gyarab.prg3e.s2;

import org.apache.commons.lang3.RandomStringUtils;

public class MujHash {
    static int spocitejHash(String msg) {
        long x = 0;
        for(char ch: msg.toCharArray()) {
            x += (int)ch;
        }
        return (int)((x * (x+3)) % 1013);
    }


    private static void vypis(String msg) {
        System.out.println(msg + " = " + spocitejHash(msg));
    }

    public static void main(String[] args) {
        vypis("Programovani 3");
        vypis("qqq");
        vypis("Vý");

        for(long i = 0;; i++) {
            String msg = RandomStringUtils.randomAlphabetic(2);
            if (spocitejHash(msg) == 456) {
                System.out.println(msg);
                break;
            }
            if (i % 1000000 == 0) {
                System.out.print(".");
            }

        }

        System.out.println((int)'q');
        /*
        for (char ch = 'a'; ch <= 'z'; ch++) {
            String msg = "";
            for (int i = 0; ; i++) {
                if (spocitejHash(msg) == 456) {
                    System.out.println(ch + " : " + i);
                    break;
                }
                msg += ch;
            }
        }

         */
    }

}
