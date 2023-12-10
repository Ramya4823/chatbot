package story21;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume an OnboardingGuide class for guiding job applicants through the onboarding process
    static class OnboardingGuide {
        private void provideCompanyProcedures() {
            // Simulate providing company procedures
            System.out.println("Company Procedures:");
            System.out.println("Welcome to our company! We are excited to have you on board.");
            System.out.println("Please complete the necessary forms provided in your onboarding materials.");
            System.out.println("Attend the orientation session to get an overview of our company culture and policies.");
            System.out.println();
        }

        private void provideExpectations() {
            // Simulate providing expectations
            System.out.println("Expectations:");
            System.out.println("Professionalism: Maintain a high level of professionalism in all interactions.");
            System.out.println("Teamwork: Collaborate with team members to achieve common goals.");
            System.out.println("Communication: Communicate effectively and keep your team informed of your progress.");
            System.out.println();
        }

        public void guideOnboarding(String applicantName) {
            // Simulate guiding the job applicant through the onboarding process
            provideCompanyProcedures();
            provideExpectations();

            // Provide a completion message
            System.out.println("Onboarding guidance completed for " + applicantName + ".");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        // Assume an OnboardingGuide instance for guiding applicants through onboarding
        OnboardingGuide onboardingGuide = new OnboardingGuide();

        do {
            System.out.println("Enter your name as a job applicant:");
            String applicantName = scanner.nextLine();

            // Guide the job applicant through the onboarding process
            onboardingGuide.guideOnboarding(applicantName);

            System.out.println("Do you have any more questions about the onboarding process? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
