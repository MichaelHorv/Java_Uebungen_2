package t2cal1;

public class Mitarbeiter {
    private String personalnummer;
    private String name;
    private String adresse;
    private int eintrittsjahr;

    public Mitarbeiter(String personalnummer, String name, String adresse, int eintrittsjahr) {
        this.personalnummer = personalnummer;
        this.name = name;
        this.adresse = adresse;
        this.eintrittsjahr = eintrittsjahr;
    }

    public String getPersonalnummer() {
        return personalnummer;
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getEintrittsjahr() {
        return eintrittsjahr;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "Personalnummer='" + personalnummer + '\'' +
                ", Name='" + name + '\'' +
                ", Adresse='" + adresse + '\'' +
                ", Eintrittsjahr=" + eintrittsjahr +
                '}';
    }
}


