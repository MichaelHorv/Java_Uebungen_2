package t2i3;

public class Kugel implements IRaumfigur {
    private int radius;

    public Kugel(int radius) {
        this.radius = radius;
    }

    @Override
    public double berechneVolumen() {
        return ((double) 4 / 3) * Math.pow(radius, 3) * Math.PI;
    }
}
