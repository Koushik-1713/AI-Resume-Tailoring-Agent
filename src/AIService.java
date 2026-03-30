import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class AIService {

    public static String callOllama(String prompt) {
        try {
            System.out.println("Sending request to Ollama...");
            URL url = new URL("http://localhost:11434/api/generate");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            conn.setConnectTimeout(120000); // 2 minutes
            conn.setReadTimeout(120000);

            // 🔥 ESCAPE PROBLEM CHARACTERS
            String safePrompt = prompt
                    .replace("\\", "\\\\")
                    .replace("\"", "\\\"")
                    .replace("\n", "\\n")
                    .replace("\r", "")
                    .replace("\t", " ");

            String jsonInput = "{"
                    + "\"model\":\"llama3:8b\","
                    + "\"prompt\":\"" + safePrompt + "\","
                    + "\"stream\":false"
                    + "}";

            // Send request
            OutputStream os = conn.getOutputStream();
            os.write(jsonInput.getBytes("utf-8"));
            os.close();

            System.out.println("Waiting for response...");

            int responseCode = conn.getResponseCode();

            BufferedReader br;

            // 🔥 Handle error response also
            if (responseCode >= 400) {
                br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            } else {
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            }

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                response.append(line);
            }

            br.close();

            System.out.println("Response received!");

            String fullJson = response.toString();

            // 🔥 Debug print (VERY IMPORTANT)
            System.out.println("\nRAW RESPONSE:\n" + fullJson);

            // Extract only response text
            int start = fullJson.indexOf("\"response\":\"") + 12;
            int end = fullJson.indexOf("\",\"done\"");

            if (start > 11 && end > start) {
                return fullJson.substring(start, end).replace("\\n", "\n");
            }

            return "Error parsing response";

        } catch (Exception e) {
            e.printStackTrace();
            return "Error calling Ollama";
        }
    }
}
