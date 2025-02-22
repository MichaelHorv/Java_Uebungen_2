package staticschulung;

public class Testklasse {
    public static void main(String[] args) {

        Auto auto = new Auto("Auto");
        System.out.println("Anzahl angelegter Autos: " + Auto.getTestneu());
        Auto auto2 = new Auto("Auto2");
        Auto auto3 = new Auto("Auto3");
        Auto auto4 = new Auto("Auto4");
        System.out.println("Anzahl angelegter Autos: " + Auto.getTestneu());
    }
}
