package t2i3;

public class T2I3 {
    public static void main(String[] args) {
        Wuerfel w = new Wuerfel(5);
        Kugel ku = new Kugel(5);
        Kegel ke = new Kegel(5, 3);


        System.out.format("Volumen %s = %.2f\n", w.getClass().getSimpleName(), w.berechneVolumen());
        System.out.format("Volumen %s = %.2f\n", ku.getClass().getSimpleName(), ku.berechneVolumen());
        System.out.format("Volumen %s = %.2f\n", ke.getClass().getSimpleName(), ke.berechneVolumen());
    }
}
