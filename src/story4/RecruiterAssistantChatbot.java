package story4;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a PhoneInterviewer class for conducting phone interviews
    static class PhoneInterviewer {
        public void conductPhoneInterview(String candidateName) {
            System.out.println("Phone interview with candidate: " + candidateName);
            System.out.println("Please answer the following open-ended questions:");

            // Ask open-ended questions
            askQuestion("Can you tell me about your experience and how it aligns with the requirements of the job?");
            askQuestion("What motivated you to apply for this position at our company?");
            // Add more questions as needed

            System.out.println("Thank you for your responses. We will contact you with further information.");
        }

        private void askQuestion(String question) {
            System.out.println(question);
            // Simulate recording or processing the candidate's response
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        do {
            System.out.println("Enter the name of the candidate for the phone interview:");
            String candidateName = scanner.nextLine();

            // Assume a PhoneInterviewer instance to conduct the phone interview
            PhoneInterviewer phoneInterviewer = new PhoneInterviewer();
            phoneInterviewer.conductPhoneInterview(candidateName);

            System.out.println("Do you want to conduct another phone interview? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
