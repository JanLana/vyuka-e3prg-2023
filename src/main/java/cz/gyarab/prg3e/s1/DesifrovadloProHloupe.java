package cz.gyarab.prg3e.s1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;

public class DesifrovadloProHloupe {
    public static void main(String[] args) throws IOException {
        String vstup = Files.readString(Paths.get("zprava.txt"));
        byte[] bytes = Base64.getDecoder().decode(vstup);
        byte[] klicBytes = Arrays.copyOfRange(bytes, 0, 16);
        System.out.println(Arrays.toString(klicBytes));

        byte[] zpravaBytes = Arrays.copyOfRange(bytes, 16, bytes.length);

    }
}
