package t2cm1;

import java.util.HashMap;

public class T2CM1 {
    public static void main(String[] args) {
        Buch b1 = new Buch("AT25-22","Buchtitel1","Autor1","Verlag1",2021,1);
        Buch b2 = new Buch("AT25-23","Buchtitel2","Autor1","Verlag1",2021,2);
        Buch b3 = new Buch("AT25-24","Buchtitel3","Autor1","Verlag1",2021,2);
        Buch b4 = new Buch("AT25-25","Buchtitel4","Autor1","Verlag1",2021,2);
        Buch b5 = new Buch("AT25-26","Buchtitel5","Autor1","Verlag1",2021,2);

        HashMap<String, Buch> mapBuch = new HashMap<>();
        mapBuch.put(b1.getIsbn(), b1);
        mapBuch.put(b2.getIsbn(), b2);
        mapBuch.put(b3.getIsbn(), b3);
        mapBuch.put(b4.getIsbn(), b4);
        mapBuch.put(b5.getIsbn(), b5);
        System.out.println("Bücher:");
        mapBuch.forEach((k,v) -> System.out.println(k + " - " + v));

    }
}
