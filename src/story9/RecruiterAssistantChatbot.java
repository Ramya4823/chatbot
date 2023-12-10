package story9;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    static class ApplicationDeadlineReminder {
        public void remindAboutDeadlines() {
            // Simulated logic for reminding job applicants
            System.out.println("Reminding job applicants to complete necessary paperwork and about approaching deadlines for job applications.");
            System.out.println("Please ensure you have submitted all required documents and meet the application deadlines.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        ApplicationDeadlineReminder deadlineReminder = new ApplicationDeadlineReminder();

        do {
            System.out.println("Choose a service:");
            System.out.println("1. Receive reminders about necessary paperwork and application deadlines.");
            System.out.println("0. Exit");

            int userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 9:
                    deadlineReminder.remindAboutDeadlines();
                    break;
                case 10:
                    System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

            System.out.println("\nDo you want assistance with anything else? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
