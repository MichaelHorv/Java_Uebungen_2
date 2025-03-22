package t2cm1;

public class Buch {
    private String isbn;
    private String titel;
    private String autor;
    private String verlag;
    private int erscheinungsjahr;
    private int auflage;

    public Buch(String isbn, String titel, String autor, String verlag, int erscheinungsjahr, int auflage) {
        this.isbn = isbn;
        this.titel = titel;
        this.autor = autor;
        this.verlag = verlag;
        this.erscheinungsjahr = erscheinungsjahr;
        this.auflage = auflage;
    }

    @Override
    public String toString() {
        return "Buch{" +
                ", titel='" + titel + '\'' +
                ", autor='" + autor + '\'' +
                ", verlag='" + verlag + '\'' +
                ", erscheinungsjahr=" + erscheinungsjahr +
                ", auflage=" + auflage +
                '}';
    }

    public String getIsbn() {
        return isbn;
    }
}
