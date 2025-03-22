package t2ff8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class T2FF8 {
    public static void main(String[] args) {

        Path p = Path.of(".\\resources\\t2FF8.txt");
        List<String> lDoubleNumbers = new ArrayList<>();
        lDoubleNumbers.add(Double.toString(287.233));
        lDoubleNumbers.add(Double.toString(44.1));
        lDoubleNumbers.add(Double.toString(-82.32));
        lDoubleNumbers.add(Double.toString(654.41));
        lDoubleNumbers.add(Double.toString(-544.67));
        lDoubleNumbers.add(Double.toString(277.64));


        /* Random-Mode
        for (int i = 0; i < Math.random() * 1000; i++) {
            if (Math.random() < 0.5) {
                lDoubleNumbers.add(Double.toString(Math.random() * -1000));
            } else {
                lDoubleNumbers.add(Double.toString(Math.random() * 1000));
            }
        }
         */

        try {
            Files.write(p, lDoubleNumbers);
            List<String> lZeilen = Files.readAllLines(p);
            double minimum = Double.MAX_VALUE;
            double maximum = Double.MIN_VALUE;
            int zeahler = 0;
            double summeDurchschnitt = 0;

            //Minimum errechnen
            for (String eineZeile : lZeilen) {
                double zahl = Double.parseDouble(eineZeile);
                if (zahl < minimum) {
                    minimum = zahl;
                }
                //Maximum errechnen
                if (zahl > maximum) {
                    maximum = zahl;
                }
                //Summe und Zähler für Durchschnittsberechnung
                summeDurchschnitt += zahl;
                zeahler++;
            }
            System.out.println("Minimum = " + minimum);
            System.out.println("Maximum = " + maximum);
            System.out.println("Durchschnitt = " + summeDurchschnitt / zeahler);
        } catch (IOException e) {
            new RuntimeException(e);
        }
    }
}
