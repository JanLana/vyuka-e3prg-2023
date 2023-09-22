package cz.gyarab.prg3e.s2;

import java.util.Arrays;

public class TrideniLidi {
    public static void main(String[] args) {
        Clovek[] arr = {
                new Clovek("Tomas", "Masaryk", 1850),
            new Clovek("Jan", "Komensky", 1550),
                new Clovek("Q", "Q", 3000),
                new Clovek("K", "K", 1920),
                new Clovek("Jan", "Lana", 1974)
        };

        System.out.println(Arrays.toString(arr));



        System.out.println(Arrays.toString(arr));


        /*
        arr = new Clovek[10];

        arr[0] = new Clovek("Tomas", "Masarik", 1850);
        arr[1] = new Clovek("Jan", "Komensky", 1550);
        */
    }
}
