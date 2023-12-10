package story13;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a ResumeEvaluator class for evaluating resumes
    static class ResumeEvaluator {
        public void evaluateResume(String applicantName, String resumeText) {
            // Simulate evaluating the resume
            System.out.println("Evaluating resume for " + applicantName + "...");

            // Assume a simple evaluation logic for demonstration purposes
            boolean hasContactInformation = containsContactInformation(resumeText);
            boolean hasRelevantSkills = containsRelevantSkills(resumeText);

            // Provide recommendations based on the evaluation
            if (!hasContactInformation) {
                System.out.println("Recommendation: Ensure your resume includes up-to-date contact information.");
            }

            if (!hasRelevantSkills) {
                System.out.println("Recommendation: Highlight relevant skills to match the job requirements.");
            }

            // Additional evaluation criteria and recommendations can be added

            System.out.println("Resume evaluation completed.");
        }

        private boolean containsContactInformation(String resumeText) {
            // Simulate checking for contact information in the resume
            return resumeText.contains("Contact Information");
        }

        private boolean containsRelevantSkills(String resumeText) {
            // Simulate checking for relevant skills in the resume
            return resumeText.contains("Relevant Skills");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        do {
            System.out.println("Enter your name:");
            String applicantName = scanner.nextLine();

            System.out.println("Paste your resume text below:");
            String resumeText = scanner.nextLine();

            // Assume a ResumeEvaluator instance to evaluate the resume
            ResumeEvaluator resumeEvaluator = new ResumeEvaluator();
            resumeEvaluator.evaluateResume(applicantName, resumeText);

            System.out.println("Do you want to evaluate another resume? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
