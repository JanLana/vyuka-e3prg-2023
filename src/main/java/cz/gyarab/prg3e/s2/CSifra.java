package cz.gyarab.prg3e.s2;

import java.util.Scanner;

public class CSifra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int v = (int)ch;
            int w = v + n;

            if (w > (int)'z') {
                w = w - 'z' + 'a' - 1;
            }
            if (w < (int)'a') {
                w = w - 'a' + 'z' + 1;
            }
            char ch2 = (char)w;

            //System.out.println(v + " -> " + w + " => " + ch + " -> " + ch2);
            System.out.print(ch2);
        }
    }
}
