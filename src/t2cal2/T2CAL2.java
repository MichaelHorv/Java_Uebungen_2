package t2cal2;

import java.util.ArrayList;
import java.util.Comparator;

public class T2CAL2 {
    public static void main(String[] args) {

        ArrayList<Buch> albuch = new ArrayList<>();

        albuch.add(new Buch("KL 123","Titel 1","Autor 1",2020,"Verlag1"));
        albuch.add(new Buch("AF 564","Titel 2","Autor 2",2021,"Verlag2"));
        albuch.add(new Buch("KB 987","Titel 3","Autor 3",2022,"Verlag3"));
        albuch.add(new Buch("RF 782","Titel 4","Autor 4",2020,"Verlag4"));
        albuch.add(new Buch("DD 437","Titel 5","Autor 5",2021,"Verlag5"));
        albuch.add(new Buch("IT 123","Titel 6","Autor 6",2020,"Verlag6"));

        albuch.sort(Comparator.comparingInt(Buch::getErscheinungsjahr).reversed().thenComparing(Buch::getInventarNummer));
        albuch.forEach(System.out::println);
    }
}
