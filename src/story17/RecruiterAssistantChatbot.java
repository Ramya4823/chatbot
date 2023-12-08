package story17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume an InterviewOutcomeNotifier class for notifying applicants of interview outcomes
    static class InterviewOutcomeNotifier {
        private Map<String, String> interviewOutcomes = new HashMap<>();
        private Map<String, String> interviewFeedback = new HashMap<>();

        public void notifyInterviewOutcome(String candidateName, String outcome, String feedback) {
            // Simulate notifying the applicant of the interview outcome
            interviewOutcomes.put(candidateName, outcome);
            interviewFeedback.put(candidateName, feedback);
            System.out.println("Interview outcome notification sent to " + candidateName);
        }

        public String getInterviewOutcome(String candidateName) {
            // Get the outcome of the interview for the candidate
            return interviewOutcomes.getOrDefault(candidateName, "No outcome available");
        }

        public String getInterviewFeedback(String candidateName) {
            // Get the feedback for the candidate
            return interviewFeedback.getOrDefault(candidateName, "No feedback available");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        // Assume a list of job applicants
        String[] jobApplicants = {"Applicant1", "Applicant2", "Applicant3"};

        // Assume an InterviewOutcomeNotifier instance for notifying applicants
        InterviewOutcomeNotifier outcomeNotifier = new InterviewOutcomeNotifier();

        do {
            System.out.println("Enter your name as a job applicant:");
            String applicantName = scanner.nextLine();

            // Assume a simplified interview process with a binary outcome (e.g., "Accepted" or "Rejected")
            System.out.println("Enter the outcome of the interview for " + applicantName + " (Accepted/Rejected):");
            String outcome = scanner.nextLine();

            System.out.println("Enter constructive feedback for " + applicantName + " (if applicable):");
            String feedback = scanner.nextLine();

            // Notify the applicant of the interview outcome
            outcomeNotifier.notifyInterviewOutcome(applicantName, outcome, feedback);

            // Get the outcome and feedback for the applicant
            String interviewOutcome = outcomeNotifier.getInterviewOutcome(applicantName);
            String interviewFeedback = outcomeNotifier.getInterviewFeedback(applicantName);

            System.out.println("Interview Outcome for " + applicantName + ": " + interviewOutcome);
            System.out.println("Interview Feedback: " + interviewFeedback);

            System.out.println("Do you want to notify another applicant? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}

