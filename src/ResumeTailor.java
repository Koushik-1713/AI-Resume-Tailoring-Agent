import java.nio.file.Files;
import java.nio.file.Paths;

public class ResumeTailor {

    public static void tailorResume(String jobTitle) {
        try {
            // Read resume
            String resumeText = new String(
                    Files.readAllBytes(Paths.get("data/candidate_resume.txt"))
            );

            // Call AI
            String aiResume = AIService.generateResume(jobTitle, resumeText);

            // Print result
            System.out.println("\nTailored Resume for: " + jobTitle);
            System.out.println("=====================================");
            System.out.println(aiResume);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}