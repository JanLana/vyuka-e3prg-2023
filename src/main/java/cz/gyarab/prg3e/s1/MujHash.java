package cz.gyarab.prg3e.s1;

import org.apache.commons.lang3.RandomStringUtils;

public class MujHash {
    static int myHash(String msg) {
        long sum = 0;

        for(char ch : msg.toCharArray()) {
            sum += (int)ch;
        }
        return (int)((sum * (sum+3)) % 1013);
    }

    private static void vytiskni(String msg) {
        System.out.println(msg + " = " + myHash(msg));
    }

    public static void main(String[] args) {
        String msg = "Ahoj programatori";
        String msg3 = "!!!!!!2W";

        vytiskni(msg);
        vytiskni(msg3);
        vytiskni("32G;S\"(96*");

        return;
/*
        vytiskni(msg);
        for(int i = 0; ; i++) {
            String msg2 = RandomStringUtils.randomAlphabetic(10);
            if (myHash(msg2) == 940) {
                vytiskni(msg2);
                i = 0;
            } else if (i%1000000 == 0) {
                System.out.print(".");
            }
        }
        */

    }

}
