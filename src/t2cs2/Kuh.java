package t2cs2;

import java.util.Objects;

public class Kuh {
    private String name;
    private int alter;
    private double milchertrag;

    public Kuh(String name, int alter, double milchertrag) {
        this.name = name;
        this.alter = alter;
        this.milchertrag = milchertrag;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public double getMilchertrag() {
        return milchertrag;
    }

    @Override
    public String toString() {
        return "Kuh{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", milchertrag=" + milchertrag +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Kuh kuh = (Kuh) o;
        return getAlter() == kuh.getAlter() && getMilchertrag() == kuh.getMilchertrag() && Objects.equals(getName(), kuh.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAlter(), getMilchertrag());
    }


}
