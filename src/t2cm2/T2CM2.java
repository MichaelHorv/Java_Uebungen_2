package t2cm2;

import java.util.HashMap;

public class T2CM2 {
    public static void main(String[] args) {
        DVD dvd1 = new DVD("Sully", 2012);
        DVD dvd2 = new DVD("Kevin allein Zuhause", 1996);
        DVD dvd3 = new DVD("Kevin allein in New York", 1998);
        DVD dvd4 = new DVD("Ich einfach unverbesserlich", 2023);
        DVD dvd5 = new DVD("2012", 2012);

        HashMap<DVD, Integer> hmDVDs = new HashMap<>();
        hmDVDs.put(dvd1, 5);
        hmDVDs.put(dvd2, 2);
        hmDVDs.put(dvd3, 2);
        hmDVDs.put(dvd4, 3);
        hmDVDs.put(dvd5, 4);
        System.out.println("Hash Map");
        hmDVDs.forEach((k,v) -> System.out.println(k + " Bewertung: " + v));

        hmDVDs.put(dvd4, 2);
        System.out.println("\nNach neuer Bewertung");
        hmDVDs.forEach((k,v) -> System.out.println(k + " Bewertung: " + v));

        System.out.println("\nNach neuer Bewertung");
        hmDVDs.put(new DVD("Sully", 2012),1);
        hmDVDs.forEach((k,v) -> System.out.println(k + " Bewertung: " + v));
    }
}
