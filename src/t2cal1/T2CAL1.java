package t2cal1;
import java.util.ArrayList;
import java.util.Comparator;

public class T2CAL1 {
    public static void main(String[] args) {

        ArrayList<Mitarbeiter> alMitarbeiter = new ArrayList<>();

        Mitarbeiter m1 = new Mitarbeiter("AB 471","Siegfried","Adresse 1",2020);

        alMitarbeiter.add(m1);
        alMitarbeiter.add(new Mitarbeiter("DE 987","Brunhilde","Adresse 2",2023));
        alMitarbeiter.add(new Mitarbeiter("AQ 123","Hagen","Adresse 3",1995));
        alMitarbeiter.add(new Mitarbeiter("LK 876","Gunter","Adresse 4",2021));
        alMitarbeiter.add(new Mitarbeiter("OP 999","Gernot","Adresse 5",2008));
        alMitarbeiter.add(new Mitarbeiter("UJ 814","Giselher","Adresse 6",2012));

        System.out.println("Nach Personalnummer sortiert");
        alMitarbeiter.sort(new PersonalnummerSort());
        alMitarbeiter.forEach(System.out::println);

        System.out.println("\nNach Name sortiert");
        alMitarbeiter.sort(new Comparator<Mitarbeiter>() {
            @Override
            public int compare(Mitarbeiter o1, Mitarbeiter o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        alMitarbeiter.forEach(System.out::println);

        System.out.println("\nAbsteigend nach Eintrittsjahr sortiert");
        alMitarbeiter.sort((a, b) -> b.getEintrittsjahr() - a.getEintrittsjahr());
        alMitarbeiter.forEach(System.out::println);

        System.out.println("\nAnsteigend nach Eintrittsjahr sortiert");
        alMitarbeiter.sort((a,b) -> a.getEintrittsjahr() - b.getEintrittsjahr());
        alMitarbeiter.forEach(System.out::println);

        System.out.println("\nAbsteigend nach Eintrittsjahr sortiert");
        alMitarbeiter.sort(Comparator.comparingInt(Mitarbeiter::getEintrittsjahr).reversed());
        alMitarbeiter.forEach(System.out::println);
    }
}
