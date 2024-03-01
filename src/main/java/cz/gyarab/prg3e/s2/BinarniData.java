package cz.gyarab.prg3e.s2;

import com.google.common.io.Files;

import java.nio.file.Paths;
import java.util.Scanner;

public class BinarniData {
    public static void main(String[] args) {
        byte[] vstup = new byte[10];

        for (int i = 0; i < 100; i++) {
            vstup[i] = (byte)(i*2);
        }

        //Files.write(Paths.get("vystup.data"), vstup);
    }
}
