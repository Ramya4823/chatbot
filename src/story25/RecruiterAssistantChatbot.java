package story25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a ProfessionalDevelopmentAdvisor class for recommending opportunities and certifications
    static class ProfessionalDevelopmentAdvisor {
        private List<String> relevantOpportunities = new ArrayList<>();
        private List<String> relevantCertifications = new ArrayList<>();

        public ProfessionalDevelopmentAdvisor() {
            // Simulate relevant professional development opportunities (replace with actual data)
            relevantOpportunities.add("Attend industry conferences for networking.");
            relevantOpportunities.add("Enroll in online courses for skill enhancement.");
            relevantOpportunities.add("Join professional associations for career growth.");

            // Simulate relevant certifications (replace with actual data)
            relevantCertifications.add("Certified Professional in [Your Field]");
            relevantCertifications.add("Project Management Professional (PMP)");
            relevantCertifications.add("Google Analytics Certification");
            // Add more relevant opportunities and certifications
        }

        public void provideProfessionalDevelopmentInfo() {
            // Simulate providing information about professional development opportunities and certifications
            System.out.println("Relevant Professional Development Opportunities:");
            for (String opportunity : relevantOpportunities) {
                System.out.println("- " + opportunity);
            }

            System.out.println("\nRelevant Certifications:");
            for (String certification : relevantCertifications) {
                System.out.println("- " + certification);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        // Assume a ProfessionalDevelopmentAdvisor instance for recommending opportunities and certifications
        ProfessionalDevelopmentAdvisor developmentAdvisor = new ProfessionalDevelopmentAdvisor();

        do {
            System.out.println("As a job applicant, how can I assist you with professional development?");
            System.out.println("1. Notify me of relevant professional development opportunities and certifications.");
            System.out.println("2. Exit");

            int userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 1:
                    // Provide information about professional development opportunities and certifications
                    developmentAdvisor.provideProfessionalDevelopmentInfo();
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
