package t2i3;

public class Wuerfel implements IRaumfigur {
    private int seitenlaenge;


    public Wuerfel(int a) {
        this.seitenlaenge = a;
    }

    @Override
    public double berechneVolumen() {
        return (seitenlaenge * seitenlaenge * seitenlaenge);
    }
}
