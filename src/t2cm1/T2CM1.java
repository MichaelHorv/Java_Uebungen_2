package t2cm1;

import java.util.HashMap;

public class T2CM1 {
    public static void main(String[] args) {
        Buch b1 = new Buch("ISBN 123-25333-22","Buchtitel1","Autor1","Verlag1",2021,1);
        Buch b2 = new Buch("ISBN 123-25333-23","Buchtitel2","Autor2","Verlag2",2018,2);
        Buch b3 = new Buch("ISBN 123-25333-24","Buchtitel3","Autor3","Verlag3",2013,1);
        Buch b4 = new Buch("ISBN 123-25333-25","Buchtitel4","Autor4","Verlag4",2007,1);
        Buch b5 = new Buch("ISBN 123-25333-26","Buchtitel5","Autor5","Verlag5",2023,4);

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
