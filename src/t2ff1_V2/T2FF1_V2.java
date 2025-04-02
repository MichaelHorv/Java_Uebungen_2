package t2ff1_V2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class T2FF1_V2 {
    public static void main(String[] args) {
        Path p = Path.of(".\\resources\\t2FF1_V2.txt");
        try {
            BufferedWriter bw = Files.newBufferedWriter(p);
            for (int i = 1; i <= 5; i++) {
                bw.write(Integer.toString(i));
                bw.newLine();
            }
            bw.close();

            BufferedReader br = Files.newBufferedReader(p);
            String zeile;
            int summe = 0;
            int produkt = 1;
            while ((zeile = br.readLine()) != null) {
                int zahl = Integer.parseInt(zeile);
                summe += zahl;
                produkt *= zahl;
            }
            br.close();
            System.out.println("Summe: " + summe);
            System.out.println("Produkt: " + produkt);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
