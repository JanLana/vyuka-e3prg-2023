package cz.gyarab.prg3e.s1;

import java.util.Arrays;

public class MojeTrideni {
    private void prohod(Clovek[] pole, int x, int y) {
        Clovek clovek = pole[x];
        pole[x] = pole[y];
        pole[y] = clovek;
    }

    private boolean jeVetsi(Clovek a, Clovek b) {
        if (a.getRokNarozeni() > b.getRokNarozeni())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Clovek[] arr = {
                new Clovek("Jan", "Komensky", 1592),
                new Clovek("Q", "Q", 3500),
                new Clovek("Jara", "Cimrman", 1800),
                new Clovek("Praotec", "Cech", 621),
                new Clovek("Z", "Z", 1985),
        };

        System.out.println(Arrays.toString(arr));


        /*
        arr = new Clovek[10];
        arr[0] = new Clovek("Jan", "Komensky", 1592);
        arr[1] = new Clovek("Jara", "Cimrman", 1800);
        ...

         */
    }
}
