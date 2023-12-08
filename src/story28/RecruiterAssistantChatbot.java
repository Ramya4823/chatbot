package story28;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a RecruitmentUpdateSender class for sending automated updates to candidates
    static class RecruitmentUpdateSender {
        private Map<String, String> candidateEmails = new HashMap<>();

        public RecruitmentUpdateSender() {
            // Simulate candidate emails and their associated status (replace with actual data)
            candidateEmails.put("candidate1@example.com", "Application Received");
            candidateEmails.put("candidate2@example.com", "Interview Scheduled");
            candidateEmails.put("candidate3@example.com", "In-Depth Interview");
            // Add more candidate emails and statuses
        }

        public void sendAutomatedUpdates(String candidateEmail, String updateMessage) {
            // Simulate sending an automated update to a candidate
            System.out.println("Sending update to " + candidateEmail + ": " + updateMessage);
        }

        public void updateCandidateStatus(String candidateEmail, String newStatus) {
            // Simulate updating the status of a candidate
            candidateEmails.put(candidateEmail, newStatus);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        // Assume a RecruitmentUpdateSender instance for sending automated updates to candidates
        RecruitmentUpdateSender updateSender = new RecruitmentUpdateSender();

        do {
            System.out.println("As a recruiter, how can I assist you with recruitment updates?");
            System.out.println("1. Send automated updates to candidates about changes or delays.");
            System.out.println("2. Exit");

            int userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 1:
                    // Simulate selecting a candidate and sending an automated update
                    System.out.println("Enter the email of the candidate to update:");
                    String candidateEmail = scanner.nextLine();

                    if (updateSender.candidateEmails.containsKey(candidateEmail)) {
                        System.out.println("Enter the update message:");
                        String updateMessage = scanner.nextLine();

                        // Send an automated update to the candidate
                        updateSender.sendAutomatedUpdates(candidateEmail, updateMessage);

                        // Simulate updating the candidate's status
                        updateSender.updateCandidateStatus(candidateEmail, "Update Sent");
                    } else {
                        System.out.println("Candidate with email " + candidateEmail + " not found.");
                    }
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
