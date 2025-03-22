package t2cal5;

public class Wolkenkratzer {
    private String name;
    private String ort;
    private int hoehe;
    private int anzahlStockwerk;

    public Wolkenkratzer(String name, String ort, int hoehe, int anzahlStockwerk) {
        super();
        this.name = name;
        this.ort = ort;
        this.hoehe = hoehe;
        this.anzahlStockwerk = anzahlStockwerk;
    }

    public String getOrt() {
        return ort;
    }

    public int getHoehe() {
        return hoehe;
    }

    @Override
    public String toString() {
        return "Wolkenkratzer{" +
                "name='" + name + '\'' +
                ", ort='" + ort + '\'' +
                ", hoehe=" + hoehe +
                ", anzahlStockwerk=" + anzahlStockwerk +
                '}';
    }
}