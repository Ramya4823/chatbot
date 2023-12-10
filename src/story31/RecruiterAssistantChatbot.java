package story31;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a LifeManagementAdvisor class for providing tips on personal and professional life management
    static class LifeManagementAdvisor {
        public void provideLifeManagementTips() {
            // Simulate providing tips on managing personal and professional lives as a job seeker
            System.out.println("Here are some tips on managing your personal and professional lives as a job seeker:");
            System.out.println("1. Set clear goals for your job search and prioritize tasks.");
            System.out.println("2. Establish a daily routine to stay organized and maintain work-life balance.");
            System.out.println("3. Network actively to expand your professional connections.");
            System.out.println("4. Take breaks to avoid burnout and maintain mental well-being.");
            System.out.println("5. Enhance your skills through continuous learning and professional development.");
            // Add more personalized tips based on your specific recommendations
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        // Assume a LifeManagementAdvisor instance for providing life management tips
        LifeManagementAdvisor managementAdvisor = new LifeManagementAdvisor();

        do {
            System.out.println("As a job seeker, how can I assist you with managing your personal and professional lives?");
            System.out.println("1. Provide tips on managing personal and professional lives.");
            System.out.println("2. Exit");

            int userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 1:
                    // Provide tips on managing personal and professional lives
                    managementAdvisor.provideLifeManagementTips();
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
