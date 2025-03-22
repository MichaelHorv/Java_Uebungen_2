package t2cm3;

import java.util.*;

public class T2CM3 {
    public static void main(String[] args) {
        Kursteilnehmer k1 = new Kursteilnehmer("Max", "Adresse 1");
        Kursteilnehmer k2 = new Kursteilnehmer("Markus", "Adresse 2");
        Kursteilnehmer k3 = new Kursteilnehmer("Stefan", "Adresse 3");
        Kursteilnehmer k4 = new Kursteilnehmer("Brunhilde", "Adresse 4");
        Kursteilnehmer k5 = new Kursteilnehmer("Florian", "Adresse 5");
        Kursteilnehmer k6 = new Kursteilnehmer("Roman", "Adresse 6");
        Kursteilnehmer k7 = new Kursteilnehmer("Tomislav", "Adresse 7");


        List<Kursteilnehmer> java = List.of(k1, k2, k3);
        List<Kursteilnehmer> csharp = List.of(k2, k4, k5);
        List<Kursteilnehmer> python = List.of(k2, k5, k6, k7);

        HashMap<String, List<Kursteilnehmer>> hmKurse = new HashMap<>();

        hmKurse.put("Java", java);
        hmKurse.put("C#", csharp);
        hmKurse.put("Python", python);
        System.out.println("\n\n\n");
        hmKurse.forEach((k, v) -> {
            System.out.println("Kurs: " + k + " " + v);
        });


        //In einer erweiterten For-Schleife
        System.out.println("\n\n\n");
        for(String eineSprache : hmKurse.keySet()) {
            System.out.println(eineSprache);
            hmKurse.get(eineSprache).forEach(System.out::println);
        }


        //TreeMap
        System.out.println("\n\n\n");
        TreeMap<Kursteilnehmer, ArrayList<String>> tmKurse = new TreeMap<>(Comparator.comparing(Kursteilnehmer::getName).thenComparing(Kursteilnehmer::getAdresse));
        for(String eineSprache : hmKurse.keySet()) {
            for(Kursteilnehmer einkursteilnehmer : hmKurse.get(eineSprache)) {
                tmKurse.putIfAbsent(einkursteilnehmer, new ArrayList<>());
                tmKurse.get(einkursteilnehmer).add(eineSprache);
            }
        }

        for(Kursteilnehmer einkursteilnehmer : tmKurse.keySet()) {
            System.out.println(einkursteilnehmer);
            tmKurse.get(einkursteilnehmer).forEach(System.out::println);
        }

    }
}
