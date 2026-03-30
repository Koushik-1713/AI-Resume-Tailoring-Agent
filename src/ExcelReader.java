import java.io.BufferedReader;
import java.io.FileReader;

public class ExcelReader {

    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return content.toString();
    }
}