package story8;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume an ApplicantTrackingSystemConnector class for linking with the ATS
    static class ApplicantTrackingSystemConnector {
        public void linkWithATS(String candidateName, String resumePath) {
            // Simulate linking with the ATS by sending candidate details and resume
            System.out.println("Linking with ATS...");
            System.out.println("Candidate: " + candidateName);
            System.out.println("Resume: " + resumePath);
            // Actual integration with the ATS API would go here
            System.out.println("Candidate profile and application linked with the ATS successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        do {
            System.out.println("Enter the name of the candidate:");
            String candidateName = scanner.nextLine();

            System.out.println("Enter the path to the candidate's resume file:");
            String resumePath = scanner.nextLine();

            // Assume an ApplicantTrackingSystemConnector instance to link with the ATS
            ApplicantTrackingSystemConnector atsConnector = new ApplicantTrackingSystemConnector();
            atsConnector.linkWithATS(candidateName, resumePath);

            System.out.println("Do you want to link with the ATS for another candidate? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
