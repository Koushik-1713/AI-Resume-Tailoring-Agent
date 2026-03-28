import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class AIService {

    public static String generateResume(String jobTitle, String resumeText) {
        try {

            URL url = new URL("http://localhost:11434/api/generate");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String prompt = "Rewrite the following resume for the role: " + jobTitle + ".\n"
                    + "Return ONLY a professional resume.\n"
                    + "Do NOT include explanations.\n"
                    + "Use clear sections: SUMMARY, SKILLS, PROJECTS, EDUCATION, ACHIEVEMENTS.\n"
                    + "Use bullet points.\n\n"
                    + "Resume:\n" + resumeText;

            String safePrompt = prompt
                    .replace("\\", "\\\\")
                    .replace("\"", "\\\"")
                    .replace("\r", "")
                    .replace("\n", "\\n")
                    .replace("\t", " ")
                    .replaceAll("[^\\x20-\\x7E]", "");

            String jsonInput = String.format(
                    "{\"model\":\"llama3\",\"prompt\":\"%s\",\"stream\":false}",
                    safePrompt
            );

            System.out.println("===== FINAL JSON =====");
            System.out.println(jsonInput);
            System.out.println("======================");

            OutputStream os = conn.getOutputStream();
            os.write(jsonInput.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            os.flush();

            int responseCode = conn.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            BufferedReader br;
            if (responseCode >= 400) {
                br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            } else {
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            }

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = br.readLine()) != null) {
                response.append(line);
            }

            String fullResponse = response.toString();

// Extract only AI text
            String aiText = fullResponse
                    .replaceAll(".*\"response\":\"", "")
                    .replaceAll("\".*", "")
                    .replace("\\n", "\n");

            return aiText
                    .replace("*", "")
                    .replace("  ", " ")
                    .trim();

        } catch (Exception e) {
            return "AI Error: " + e.getMessage();
        }
    }
}
