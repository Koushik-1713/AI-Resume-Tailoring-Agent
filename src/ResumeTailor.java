public class ResumeTailor {

    public static void tailorResume(String jobTitle) {
        try {
            String resume = JsonReader.readResume("data/Candidate_resume.txt");

            resume = resume.replaceAll("\\s+", " ");
            resume = resume.substring(0, Math.min(resume.length(), 600));
            String prompt = "Rewrite this resume for Backend Software Engineer. Focus on Java and backend. Keep it short:\n"
                    + resume;
            String result = AIService.callOllama(prompt);

            System.out.println("\n=== TAILORED RESUME ===\n");
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}