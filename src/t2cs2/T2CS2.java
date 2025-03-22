package t2cs2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class T2CS2 {
    public static void main(String[] args) {

        Kuh k1 = new Kuh("Mausi",2,15.5);
        Kuh k2 = new Kuh("Milka",3,15.5);
        Kuh k3 = new Kuh("Klara",7,16.2);
        Kuh k4 = new Kuh("Sahra",1,14);
        Kuh k5 = new Kuh("Frieda",13,32);
        Kuh k6 = new Kuh("Holga",18,41);


        HashSet<Kuh> kuhSet = new HashSet<>();
        kuhSet.add(k1);
        kuhSet.add(k2);
        kuhSet.add(k3);
        kuhSet.add(k4);
        kuhSet.add(k5);
        kuhSet.add(k6);
        kuhSet.forEach(System.out::println);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        TreeSet<Kuh> tsKuh = new TreeSet<>(Comparator.comparingDouble(Kuh::getMilchertrag).reversed().thenComparing(Kuh::getName).thenComparingInt(Kuh::getAlter));
        tsKuh.addAll(kuhSet);
        tsKuh.forEach(System.out::println);
    }
}
