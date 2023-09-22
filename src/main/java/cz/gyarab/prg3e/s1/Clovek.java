package cz.gyarab.prg3e.s1;

public class Clovek {
    private String jmeno;
    private String prijmeni;
    private int rokNarozeni;

    public Clovek(String jmeno, String prijmeni, int rokNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rokNarozeni = rokNarozeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getRokNarozeni() {
        return rokNarozeni;
    }

    @Override
    public String toString() {
        return  jmeno + ' ' + prijmeni + " (" + rokNarozeni + ')';
    }
}
