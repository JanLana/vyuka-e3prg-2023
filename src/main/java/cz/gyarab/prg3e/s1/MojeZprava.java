package cz.gyarab.prg3e.s1;

import javax.crypto.SecretKey;
import java.io.Serializable;

public class MojeZprava implements Serializable {
    SecretKey key;
    byte[] zprava;

    public MojeZprava(SecretKey key, byte[] zprava) {
        this.key = key;
        this.zprava = zprava;
    }
}
