package t2i2;

public class Rechteck implements IGeometrischeFigur {
    private int seiteA;
    private int seiteB;

    public Rechteck(int seiteA, int seiteB) {
        super();
        this.seiteA = seiteA;
        this.seiteB = seiteB;
    }


    @Override
    public double berechneUmfang() {
        return 2 * (seiteA + seiteB);
    }

    @Override
    public double berechneFlaeche() {
        return seiteA * seiteB;
    }
}
