package story14;

import java.text.SimpleDateFormat;
import java.util.*;

public class RecruiterAssistantChatbot {

    // Assume an InterviewScheduler class for arranging and planning interviews
    static class InterviewScheduler {
        private Map<String, Set<Date>> interviewerAvailabilityMap = new HashMap<>();

        public void scheduleInterview(String candidateName, List<String> interviewers, Date suggestedDate) {
            System.out.println("Scheduling interview for " + candidateName + " with interviewers: " + interviewers);

            // Check interviewer availability
            boolean allInterviewersAvailable = checkInterviewerAvailability(interviewers, suggestedDate);

            if (allInterviewersAvailable) {
                // Update interviewer schedules
                updateInterviewerSchedules(interviewers, suggestedDate);

                // Simulate confirming the interview
                SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, MMM dd, yyyy HH:mm");
                System.out.println("Interview scheduled for " + candidateName + " on " + dateFormat.format(suggestedDate));
            } else {
                System.out.println("Interviewers are not available at the suggested date and time. Please try another time.");
            }
        }

        private boolean checkInterviewerAvailability(List<String> interviewers, Date suggestedDate) {
            // Check if all interviewers are available at the suggested date and time
            for (String interviewer : interviewers) {
                Set<Date> availability = interviewerAvailabilityMap.getOrDefault(interviewer, new HashSet<>());
                if (availability.contains(suggestedDate)) {
                    return false; // Interviewer is not available
                }
            }
            return true; // All interviewers are available
        }

        private void updateInterviewerSchedules(List<String> interviewers, Date scheduledDate) {
            // Update interviewer availability after scheduling the interview
            for (String interviewer : interviewers) {
                Set<Date> availability = interviewerAvailabilityMap.getOrDefault(interviewer, new HashSet<>());
                availability.add(scheduledDate);
                interviewerAvailabilityMap.put(interviewer, availability);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        // Assume a list of available interviewers
        List<String> availableInterviewers = Arrays.asList("Interviewer1", "Interviewer2", "Interviewer3");

        // Assume an InterviewScheduler instance for scheduling interviews
        InterviewScheduler interviewScheduler = new InterviewScheduler();

        do {
            System.out.println("Enter the name of the candidate:");
            String candidateName = scanner.nextLine();

            System.out.println("Suggested interview date and time (format: yyyy-MM-dd HH:mm):");
            String suggestedDateStr = scanner.nextLine();

            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                Date suggestedDate = dateFormat.parse(suggestedDateStr);

                // Schedule the interview
                interviewScheduler.scheduleInterview(candidateName, availableInterviewers, suggestedDate);

            } catch (Exception e) {
                System.out.println("Invalid date format. Please use the format yyyy-MM-dd HH:mm.");
            }

            System.out.println("Do you want to schedule another interview? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
