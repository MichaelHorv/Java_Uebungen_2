package t2ff1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class T2FF1 {
    public static void main(String[] args) {
        Path p = Path.of(".\\resources\\t2FF1.txt");
        List<String> lZahlen = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            lZahlen.add(Integer.toString(i));
        }

        try {
            Files.write(p, lZahlen); //In das File schreiben
            List<String> lZeilen = Files.readAllLines(p); //Aus dem File lesen
            int summe = 0;
            int produkt = 1;
            for(String eineZeile : lZeilen){
                int zahl = Integer.parseInt(eineZeile);
                summe += zahl;
                produkt *= zahl;
            }
            System.out.println("Summe= " + summe);
            System.out.println("Produkt= " + produkt);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
