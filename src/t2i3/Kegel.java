package t2i3;

public class Kegel implements IRaumfigur {
    private int radius;
    private int hoehe;

    public Kegel(int radius, int hoehe) {
        this.radius = radius;
        this.hoehe = hoehe;
    }

    @Override
    public double berechneVolumen() {
        return ((double) 1 / 3) * Math.PI * Math.pow(radius, 2) * hoehe;
    }
}
