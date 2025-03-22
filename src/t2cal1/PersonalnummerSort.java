package t2cal1;

import java.util.Comparator;

public class PersonalnummerSort implements Comparator<Mitarbeiter> {
    @Override
    public int compare(Mitarbeiter o1, Mitarbeiter o2) {
        //System.out.println("o1: " + o1 + " o2: " + o2);
        return o1.getPersonalnummer().compareTo(o2.getPersonalnummer());
    }
}
