package zzArrayList;

public class Fahrzeuge {
    private String marke;
    private String bezeichnung;
    private int leistung;
    private int gewicht;

    public Fahrzeuge(String marke, String bezeichnung, int leistung, int gewicht) {
        this.marke = marke;
        this.bezeichnung = bezeichnung;
        this.leistung = leistung;
        this.gewicht = gewicht;
    }


    @Override
    public String toString() {
        return "Fahrzeuge{" +
                "marke='" + marke + '\'' +
                ", bezeichnung='" + bezeichnung + '\'' +
                ", leistung=" + leistung +
                ", gewicht=" + gewicht +
                '}';
    }

    public String getMarke() {
        return marke;
    }
}
