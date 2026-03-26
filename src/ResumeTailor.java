import java.nio.file.Files;
import java.nio.file.Paths;

public class ResumeTailor {

    public static void tailorResume(String jobTitle) {
        try {
            String resume = new String(Files.readAllBytes(Paths.get("data", "candidate_resume.txt")));

            System.out.println("Tailored Resume for: " + jobTitle);
            System.out.println("================================");

            System.out.println(resume);
            System.out.println("\n[Customized for " + jobTitle + "]");

            System.out.println("================================\n");

        } catch (Exception e) {
            System.out.println("Error reading resume: " + e.getMessage());
        }
    }
}