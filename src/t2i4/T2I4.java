package t2i4;

import java.util.Scanner;

public class T2I4 {
    public static void main(String[] args) {

        Flugzeug os12 = new Flugzeug("os12", 122, 40);

        Scanner in = new Scanner(System.in);
        System.out.println("Anzahl an Passagiere eingeben: ");
        int p = in.nextInt();
        if (os12.buchenPassagier(p)) {
            System.out.println(p + " Passagiere gebucht.");
        } else {
            System.out.println(p + " Passagiere konnten nicht gebucht werden.");
        }

        System.out.println("Anzahl an Fracht in Tonnen eingeben: ");
        int f = in.nextInt();

        if (os12.buchenFracht(f)) {
            System.out.println(f + " Tonnen Fracht gebucht.");
        } else {
            System.out.println(f + " Tonnen Fracht konnten nicht gebucht werden.");
        }

        System.out.println("Anzahl an Passagiere eingeben: ");
        int pm = in.nextInt();
        if (os12.stornierenPassagier(pm)) {
            System.out.println(pm + " Passagiere storniert.");
        } else {
            System.out.println(pm + " Passagiere konnten nicht storniert werden.");
        }

        System.out.println("Anzahl an Fracht in Tonnen eingeben: ");
        int fm = in.nextInt();
        in.close();
        if (os12.stornierenFracht(fm)) {
            System.out.println(fm + " Tonnen Fracht storniert.");
        } else {
            System.out.println(fm + " Tonnen Fracht konnten nicht storniert werden.");
        }

    }
}