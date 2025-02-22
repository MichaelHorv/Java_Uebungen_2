package staticschulung;

public class Auto {
    private String name;
    private static int testneu;

    public Auto(String name) {
        this.name = name;
        testneu++;
    }

    public static int getTestneu(){
        return testneu;
    }
}
