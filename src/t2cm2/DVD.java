package t2cm2;

import java.util.Objects;

public class DVD {
    private String titel;
    private int erscheinungsjahr;

    public DVD(String titel, int erscheinungsjahr) {
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    @Override
    public String toString() {
        return "DVD{" + "titel='" + titel + '\'' + ", erscheinungsjahr=" + erscheinungsjahr + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DVD dvd = (DVD) o;
        return erscheinungsjahr == dvd.erscheinungsjahr && Objects.equals(titel, dvd.titel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, erscheinungsjahr);
    }
}
