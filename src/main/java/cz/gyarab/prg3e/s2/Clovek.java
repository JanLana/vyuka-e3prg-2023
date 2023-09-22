package cz.gyarab.prg3e.s2;

public class Clovek {
    String jmeno;
    String prijmeni;
    int rokNarozeni;

    public Clovek(String jmeno, String prijmeni, int rokNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rokNarozeni = rokNarozeni;
    }

    @Override
    public String toString() {
        return  jmeno + ' ' + prijmeni + '[' + rokNarozeni + ']';
    }
}
