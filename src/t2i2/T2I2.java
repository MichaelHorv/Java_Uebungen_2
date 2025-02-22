package t2i2;

public class T2I2 {
    public static void main(String[] args) {
        Rechteck r1 = new Rechteck(3, 4);
        RechtwinkeligesDreieck d1 = new RechtwinkeligesDreieck(3, 4);
        System.out.println("Rechteck Fläche " + r1.berechneFlaeche());
        System.out.println("Rechteck Umfang: " + r1.berechneUmfang());

        System.out.println("Rechtwinkeliges Dreieck Fläche " + d1.berechneFlaeche());
        System.out.println("Rechtwinkeliges Dreieck Umfang: " + d1.berechneUmfang());

    }
}
