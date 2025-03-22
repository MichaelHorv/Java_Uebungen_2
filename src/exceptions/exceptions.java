package exceptions;

import java.util.ArrayList;

public class exceptions {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("VW");
        cars.add("Honda");
        cars.add("Ford");

        System.out.println(cars.indexOf("Ford"));
        try {
            System.out.println(cars.get(6));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Fehler beim Laden");
        } finally {
            System.out.println("Wiederhergestellt");
        }
        //LAMBDA
        cars.forEach( (n) -> { System.out.println(n); } );


    }
}