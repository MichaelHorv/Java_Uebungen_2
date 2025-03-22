package t2cal5;
import java.util.ArrayList;
import java.util.Comparator;

public class T2CAL5 {
    public static void main(String[] args) {

        ArrayList<Wolkenkratzer> wolkenkratzer = new ArrayList<>();
        wolkenkratzer.add(new Wolkenkratzer("Millenium Tower","Wien",202,50));
        wolkenkratzer.add(new Wolkenkratzer("IZD Tower","Wien",130,37));
        wolkenkratzer.add(new Wolkenkratzer("DC Tower","Wien",250,60));
        wolkenkratzer.add(new Wolkenkratzer("Sears Tower","Chicago",527,110));
        wolkenkratzer.add(new Wolkenkratzer("Empire State Building","New York",448,102));
        wolkenkratzer.add(new Wolkenkratzer("One World Trade Center","New York",541,94));
        wolkenkratzer.add(new Wolkenkratzer("Burj Khalifa","Dubai",828,163));
        wolkenkratzer.add(new Wolkenkratzer("Petronas Towers","Kuala Lumpur", 452,88));
        wolkenkratzer.add(new Wolkenkratzer("Taipei 101","Taipeh",508,101));
        wolkenkratzer.add(new Wolkenkratzer("Shanghai Tower","Shanghai",632,128));
        wolkenkratzer.add(new Wolkenkratzer("Jin Mao Tower","Shanghai",421,88));
        wolkenkratzer.add(new Wolkenkratzer("Shanghai World Financial Center","Shanghai",492,101));

        wolkenkratzer.sort(Comparator.comparing(Wolkenkratzer::getOrt).reversed().thenComparingInt(Wolkenkratzer::getHoehe).reversed());
        wolkenkratzer.forEach(System.out::println);

    }
}
