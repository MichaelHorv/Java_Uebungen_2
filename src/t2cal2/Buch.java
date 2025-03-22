package t2cal2;

public class Buch {
    private String inventarNummer;
    private String titel;
    private String autor;
    private int erscheinungsjahr;
    private String verlag;

    public Buch(String inventarNummer, String titel, String autor, int erscheinungsjahr, String verlag) {
        this.inventarNummer = inventarNummer;
        this.titel = titel;
        this.autor = autor;
        this.erscheinungsjahr = erscheinungsjahr;
        this.verlag = verlag;
    }

    public String getInventarNummer() {
        return inventarNummer;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "inventarNummer='" + inventarNummer + '\'' +
                ", titel='" + titel + '\'' +
                ", autor='" + autor + '\'' +
                ", erscheinungsjahr=" + erscheinungsjahr +
                ", verlag='" + verlag + '\'' +
                '}';
    }
}
