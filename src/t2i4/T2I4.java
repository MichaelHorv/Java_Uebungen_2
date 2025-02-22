package t2i4;

import java.util.Scanner;

public class T2I4 {
    public static void main(String[] args) {

        Flugzeug os12 = new Flugzeug("os12", 122, 40);

        Scanner in = new Scanner(System.in);
        System.out.println("Anzahl an Passagiere eingeben: ");
        int p = in.nextInt();

        //Passagiere Aufnehmen
        if (os12.buchenPassagier(p)) {
            System.out.println(p + " Passagier(e) gebucht.");
        } else {
            System.out.println(p + " Passagier(e) konnten nicht gebucht werden.");
        }

        //Fracht Aufnehmen
        System.out.println("Anzahl an Fracht in Tonnen eingeben: ");
        int f = in.nextInt();

        if (os12.buchenFracht(f)) {
            System.out.println(f + " Tonne(n) Fracht gebucht.");
        } else {
            System.out.println(f + " Tonne(n) Fracht konnten nicht gebucht werden.");
        }
        //Passagiere stornieren
        System.out.println("Anzahl an zu stornierenden Passagieren eingeben: ");
        int pm = in.nextInt();
        if (os12.stornierenPassagier(pm)) {
            System.out.println(pm + " Passagier(e) storniert.");
        } else {
            System.out.println(pm + " Passagier(e) konnten nicht storniert werden.");
        }

        //Fracht stornieren
        System.out.println("Anzahl an zu stornierender Fracht eingeben: ");
        int fm = in.nextInt();
        in.close();
        if (os12.stornierenFracht(fm)) {
            System.out.println(fm + " Tonne(n) Fracht storniert.");
        } else {
            System.out.println(fm + " Tonne(n) Fracht konnten nicht storniert werden.");
        }

        os12.drucken();
    }
}