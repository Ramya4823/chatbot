package story27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a DiversityInclusionAdvisor class for providing information on diversity and inclusion initiatives
    static class DiversityInclusionAdvisor {
        private Map<String, String> diversityInitiatives = new HashMap<>();

        public DiversityInclusionAdvisor() {
            // Simulate diversity initiatives (replace with actual data)
            diversityInitiatives.put("Employee Resource Groups", "We have ERGs to support diverse communities.");
            diversityInitiatives.put("Inclusive Hiring Practices", "We follow inclusive hiring practices.");
            diversityInitiatives.put("Training Programs", "We provide diversity and inclusion training programs.");
            // Add more diversity initiatives
        }

        public void provideDiversityInitiativesInfo() {
            // Simulate providing information on diversity and inclusion initiatives
            System.out.println("Here are some of our Diversity and Inclusion Initiatives:");
            for (Map.Entry<String, String> entry : diversityInitiatives.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        // Assume a DiversityInclusionAdvisor instance for providing information on diversity and inclusion initiatives
        DiversityInclusionAdvisor diversityAdvisor = new DiversityInclusionAdvisor();

        do {
            System.out.println("As a job seeker, how can I assist you with assessing cultural fit?");
            System.out.println("1. Provide information on the company's diversity and inclusion initiatives.");
            System.out.println("2. Exit");

            int userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 1:
                    // Provide information on diversity and inclusion initiatives
                    diversityAdvisor.provideDiversityInitiativesInfo();
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
