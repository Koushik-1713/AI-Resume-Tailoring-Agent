import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.setProperty("org.apache.logging.log4j.simplelog.StatusLogger.level", "OFF");
         System.out.println("Merging Excel + JSON...");

        List<Integer> ids = ExcelReader.getJobIds();

        for (int id : ids) {
            JsonReader.getJobById(id);
        }
    }
}