package cz.gyarab.prg3e.s2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MujMedian {
    public static void main(String[] args) throws FileNotFoundException {
        var file = new File("vstup.txt");
        var input = new Scanner(file);
        var arr = new ArrayList<Integer>();

        while (input.hasNext()) {
            arr.add(input.nextInt());
        }

        // setrid

        System.out.println(arr.get(0));
    }
}
