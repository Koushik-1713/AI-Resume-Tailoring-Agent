import org.json.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader {

    public static void getJobById(int targetId) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("data/option2_jobs.json")));
            JSONObject obj = new JSONObject(content);
            JSONArray jobs = obj.getJSONArray("jobs");

            for (int i = 0; i < jobs.length(); i++) {
                JSONObject job = jobs.getJSONObject(i);

                if (job.getInt("id") == targetId) {
                    String title = job.getString("title");
                    System.out.println("Matched Job:");
                    System.out.println("ID: " + job.getInt("id"));
                    System.out.println("Title: " + job.getString("title"));
                    System.out.println("Company: " + job.getString("company"));
                    System.out.println("-------------------");
                    ResumeTailor.tailorResume(title);
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
