package cz.gyarab.prg3e.s1;

import java.util.HashSet;
import java.util.Scanner;

public class MojeHashTable {
    public int mujHash(String str) {
        int out = 0;
        for(char ch: str.toCharArray())
            out += (int)ch;
        return out % 13;
    }


    // ahoj
    // svete
    // jak
    // ahoj
    //    -> ahoj uz jsi zadaval
    public static void main(String[] args) {
        String mojeTabulka[] = new String[13];


        Scanner sc = new Scanner(System.in);

        while(true) {

            String vstup = sc.next();
        }
    }
}
