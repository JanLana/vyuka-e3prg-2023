package cz.gyarab.prg3e.s1;

import java.util.Scanner;

public class CaesarovaSifra {
    public static void main(String[] args) {
        char[] abeceda = {
                'a',
                'b',
                'c',
        };

        Scanner sc = new Scanner(System.in);

        int posunuti = sc.nextInt();
        String vstup = sc.next();
        char[] arr = new char[vstup.length()];

        for(int i = 0; i < vstup.length(); i++) {
            arr[i] = vstup.charAt(i);
        }

        for(char ch: arr) {
            int i = (int)ch;
            int j = i + posunuti;

            if (j > 'z') {
                j -= 26;
            }
            if (j < 'a') {
                j += 26;
            }
            char ch2 = (char)j;

            //System.out.println(i + " : " + j + " - " + ch + " : " + ch2);
            System.out.print(ch2);
        }
        System.out.println();
    }
}
