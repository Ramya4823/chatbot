package story29;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a PortfolioPreparationAssistant class for assisting in preparing a portfolio
    static class PortfolioPreparationAssistant {
        public void providePortfolioPreparationTips() {
            // Simulate providing tips for preparing a portfolio or samples of work
            System.out.println("Here are some tips for preparing your portfolio or samples of work:");
            System.out.println("1. Include a variety of projects that showcase your skills.");
            System.out.println("2. Provide context for each project, explaining your role and contributions.");
            System.out.println("3. Tailor your portfolio to align with the requirements of the job.");
            System.out.println("4. Highlight key achievements and results.");
            // Add more tips based on your specific recommendations
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        // Assume a PortfolioPreparationAssistant instance for providing tips
        PortfolioPreparationAssistant preparationAssistant = new PortfolioPreparationAssistant();

        do {
            System.out.println("As a job applicant, how can I assist you with preparing a portfolio?");
            System.out.println("1. Provide tips for preparing a portfolio or samples of work.");
            System.out.println("2. Exit");

            int userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 1:
                    // Provide tips for preparing a portfolio
                    preparationAssistant.providePortfolioPreparationTips();
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
