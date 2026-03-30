import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader {

    public static String readResume(String filePath) {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (Exception e) {
            e.printStackTrace();
            return "Error reading resume file";
        }
    }
}