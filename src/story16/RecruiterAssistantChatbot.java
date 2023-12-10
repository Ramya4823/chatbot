package story16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume an InterviewFeedbackCollector class for gathering feedback from interviewers
    static class InterviewFeedbackCollector {
        private Map<String, Map<String, String>> candidateFeedbackMap = new HashMap<>();

        public void collectFeedback(String candidateName, String interviewer, String feedback) {
            // Simulate collecting feedback and updating the candidate profile
            Map<String, String> candidateProfile = candidateFeedbackMap.getOrDefault(candidateName, new HashMap<>());
            candidateProfile.put(interviewer, feedback);
            candidateFeedbackMap.put(candidateName, candidateProfile);
            System.out.println("Feedback from " + interviewer + " for " + candidateName + " collected successfully.");
        }

        public Map<String, String> getCandidateProfile(String candidateName) {
            // Get the compiled feedback for a candidate
            return candidateFeedbackMap.getOrDefault(candidateName, new HashMap<>());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        // Assume a list of interviewers
        String[] interviewers = {"Interviewer1", "Interviewer2", "Interviewer3"};

        // Assume an InterviewFeedbackCollector instance for collecting feedback
        InterviewFeedbackCollector feedbackCollector = new InterviewFeedbackCollector();

        do {
            System.out.println("Enter the name of the candidate:");
            String candidateName = scanner.nextLine();

            for (String interviewer : interviewers) {
                System.out.println("Enter feedback from " + interviewer + " for " + candidateName + ":");
                String feedback = scanner.nextLine();

                // Collect feedback for the candidate
                feedbackCollector.collectFeedback(candidateName, interviewer, feedback);
            }

            // Get the compiled feedback for the candidate
            Map<String, String> candidateProfile = feedbackCollector.getCandidateProfile(candidateName);
            System.out.println("Compiled Feedback for " + candidateName + ": " + candidateProfile);

            System.out.println("Do you want to collect feedback for another candidate? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
