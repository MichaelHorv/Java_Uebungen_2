package t2cs1;

import java.util.HashSet;

public class T2CS1 {
    public static void main(String[] args) {

        HashSet<Person> hsP = new HashSet<Person>();

        hsP.add(new Person("Hans", "Peter"));
        hsP.add(new Person("Peter", "Schumi"));
        hsP.add(new Person("Franz", "Klammer"));
        hsP.add(new Person("Hermann", "Mayer"));
        hsP.add(new Person("Benjamin", "Reichl"));
        Person h1 = new Person("Max", "Mensch");
        Person h2 = new Person("Franziska", "Busch");

        hsP.add(h1);
        hsP.add(h2);
        //hsP.forEach(System.out::println);

        if (hsP.add(h2) == false) {
            System.out.println("Kein weitere Frau Busch.");
        }

        hsP.add(new Person("Benjamin", "Reichl"));
        hsP.forEach(System.out::println);

    }
}
