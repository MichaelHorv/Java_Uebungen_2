package t2ff2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class T2FF2 {
    public static void main(String[] args) {
        traversieren(Path.of("C:\\Users\\Michael\\Desktop\\FH"));
    }

    private static void traversieren(Path p){
        System.out.println(p);
        try {
            DirectoryStream<Path> dsp = Files.newDirectoryStream(p);
            for( Path einPath : dsp){
                if (Files.isDirectory(einPath)){
                    traversieren(einPath);
                    break;
                }
            }
            dsp.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
