package story30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a FeedbackGatherer class for gathering and analyzing feedback
    static class FeedbackGatherer {
        private Map<String, String> candidateFeedback = new HashMap<>();

        public void gatherCandidateFeedback(String candidateEmail, String feedback) {
            // Simulate gathering feedback from a rejected candidate
            candidateFeedback.put(candidateEmail, feedback);
            System.out.println("Feedback received from " + candidateEmail + ": " + feedback);
        }

        public void analyzeFeedback() {
            // Simulate analyzing feedback to identify areas for improvement
            System.out.println("\nAnalyzing Candidate Feedback:");

            if (candidateFeedback.isEmpty()) {
                System.out.println("No feedback available.");
            } else {
                for (Map.Entry<String, String> entry : candidateFeedback.entrySet()) {
                    System.out.println("Candidate " + entry.getKey() + " provided feedback: " + entry.getValue());
                }

                // Add analysis logic based on the feedback received
                System.out.println("\nAreas for Improvement Identified:");
                System.out.println("1. Improve communication during the interview process.");
                System.out.println("2. Streamline the application status notification process.");
                // Add more identified areas for improvement
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        // Assume a FeedbackGatherer instance for gathering and analyzing feedback
        FeedbackGatherer feedbackGatherer = new FeedbackGatherer();

        do {
            System.out.println("As a recruiter, how can I assist you with feedback analysis?");
            System.out.println("1. Gather and analyze feedback from rejected candidates.");
            System.out.println("2. Exit");

            int userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 1:
                    // Simulate gathering feedback from a rejected candidate
                    System.out.println("Enter the email of the rejected candidate:");
                    String candidateEmail = scanner.nextLine();

                    System.out.println("Enter the feedback provided by the candidate:");
                    String feedback = scanner.nextLine();

                    // Gather and analyze feedback
                    feedbackGatherer.gatherCandidateFeedback(candidateEmail, feedback);
                    feedbackGatherer.analyzeFeedback();
                    break;
                case 2:
                    System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

            System.out.println("Do you want assistance with anything else? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}

