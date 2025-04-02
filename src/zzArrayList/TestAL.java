package zzArrayList;

import java.util.ArrayList;

public class TestAL {
    public static void main(String[] args) {

        Fahrzeuge bmw = new Fahrzeuge("BMW", "M3 Coupe", 343, 1850);
        Fahrzeuge audi = new Fahrzeuge("AUDI", "A8", 380, 2180);
        Fahrzeuge vw = new Fahrzeuge("VW", "Golf 8 R", 300, 1720);

        ArrayList<Fahrzeuge> cars = new ArrayList<>();

        cars.add(bmw);
        cars.add(audi);
        cars.add(vw);

        for (Fahrzeuge fahrzeuge : cars) {
            if (fahrzeuge.getMarke().equals("BMW")) {
                System.out.println("BMW ist da");
                System.out.println(fahrzeuge.toString());
            } else if (fahrzeuge.getMarke().equals("AUDI")) {
                System.out.println("AUDI ist da");
                System.out.println(fahrzeuge.toString());
            } else if (fahrzeuge.getMarke().equals("VW")) {
                System.out.println("VW ist da");
                System.out.println(fahrzeuge.toString());
            } else {
                System.out.println("Fehler");
            }
        }


        ArrayList<String> namen = new ArrayList<>();
        //namen.add("John");
        namen.add("Michael");
        namen.add("Dave");
        namen.add("Jane");
        namen.add("Bob");

        if (namen.contains("John")) {
            System.out.println("John ist in der Liste");
        } else {
            System.out.println("John ist nicht in der Liste");
        }
        System.out.println(namen.get(0));
        System.out.println(namen.get(1));
        System.out.println(namen.get(2));
        System.out.println(namen.get(3));
        namen.clear();
        if (namen.isEmpty()){
            System.out.println("Leere ArrayList");
        }

    }
}
