package t2i4;

import java.util.ArrayList;
import java.util.Scanner;

public class T2I4 {
    public static void main(String[] args) {

        Flugzeug os1722 = new Flugzeug("os1722", 122, 40);
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Mustang");
        cars.add("Corvette");
        cars.add("M240i");
        System.out.println(cars.getFirst());
        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));


        //Passagiere buchen
        if (os1722.buchenPassagier(120)) {
            System.out.println("120 Passagiere gebucht.");
        } else {
            System.out.println("120 Passagiere konnten nicht gebucht werden.");
        }

        //Fracht buchen
        if (os1722.buchenFracht(28)) {
            System.out.println("28 Tonnen Fracht gebucht.");
        } else {
            System.out.println("28 Tonnen Fracht konnten nicht gebucht werden.");
        }

        //Passagiere stornieren
        if (os1722.stornierenPassagier(120)) {
            System.out.println("110 Passagiere storniert.");
        } else {
            System.out.println("110 Passagiere konnten nicht storniert werden.");
        }

        //Fracht stornieren
        if (os1722.stornierenFracht(28)) {
            System.out.println("10 Tonnen Fracht storniert.");
        } else {
            System.out.println("10 Tonnen Fracht konnten nicht storniert werden.");
        }

        //Passagiere buchen (ungültig)
        if (os1722.buchenPassagier(123)) {
            System.out.println("123 Passagiere gebucht.");
        } else {
            System.out.println("123 Passagiere konnten nicht gebucht werden.");
        }

        //Fracht buchen (ungültig)
        if (os1722.buchenFracht(41)) {
            System.out.println("41 Tonnen Fracht gebucht.");
        } else {
            System.out.println("41 Tonnen Fracht konnten nicht gebucht werden.");
        }

        //Passagiere stornieren (ungültig)
        if (os1722.stornierenPassagier(20)) {
            System.out.println("20 Passagiere storniert.");
        } else {
            System.out.println("20 Passagiere konnten nicht storniert werden.");
        }

        //Fracht stornieren (ungültig)
        if (os1722.stornierenFracht(20)) {
            System.out.println("20 Tonnen Fracht storniert.");
        } else {
            System.out.println("20 Tonnen Fracht konnten nicht storniert werden.");
        }
    }
}