package t2i2;

public class RechtwinkeligesDreieck implements IGeometrischeFigur{
    private int seiteA;
    private int seiteB;
    private double seiteC;

    public RechtwinkeligesDreieck(int s1, int s2) {
        super();
        this.seiteA = s1;
        this.seiteB = s2;
        seiteC = Math.sqrt(seiteA*seiteA + seiteB*seiteB);
    }

    @Override
    public double berechneUmfang() {
        return seiteA + seiteB + seiteC;
    }

    @Override
    public double berechneFlaeche() {
        return seiteA * seiteB / 2d;
    }
}
