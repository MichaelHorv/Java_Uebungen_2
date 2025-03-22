package t2cm3;

public class Kursteilnehmer {
    private String name;
    private String adresse;

    public Kursteilnehmer(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Kursteilnehmer{" +
                "name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }
}
