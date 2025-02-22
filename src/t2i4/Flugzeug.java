package t2i4;

public class Flugzeug implements IFracht, IPassagier {
    private String Flugnummer;
    private int maxPassagiere;
    private int gebuchtePassagiere;
    private int maxFracht;
    private int gebuchteFracht;

    public Flugzeug(String Flugnummer, int maxPassagiere, int maxFracht) {
        this.Flugnummer = Flugnummer;
        this.maxPassagiere = maxPassagiere;
        this.maxFracht = maxFracht;
    }

    @Override
    public boolean buchenFracht(int n) {
        if (n + gebuchteFracht <= maxFracht) {
            gebuchteFracht += n;
            return true;
        };
        return false;
    }

    @Override
    public boolean stornierenFracht(int n) {
            if (n > gebuchteFracht) {
                return false;
            }
            gebuchteFracht -= n;
            return true;
    }

    @Override
    public boolean buchenPassagier(int n) {
        if (n + gebuchtePassagiere <= maxPassagiere) {
            gebuchtePassagiere += n;
            return true;
        };
        return false;
    }

    @Override
    public boolean stornierenPassagier(int n) {
        if (n > gebuchtePassagiere) {
            return false;
        }
        gebuchtePassagiere -= n;
        return true;
    }

    public void drucken(){
        System.out.println("Gebuchte Passagiere: " + gebuchtePassagiere);
        System.out.println("Gebuchte Fracht: " + gebuchteFracht);
    }
}
