package story19;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a CompensationAdvisor class for providing resources and tips on compensation
    static class CompensationAdvisor {
        public void provideCompensationInformation() {
            System.out.println("Here are some resources and tips for negotiating job offers and understanding compensation packages:");

            // Simulate providing information on negotiating job offers
            System.out.println("1. Research: Research industry-standard salaries for your role and experience.");
            System.out.println("2. Know Your Worth: Understand your skills, qualifications, and the value you bring to the company.");
            System.out.println("3. Benefits: Consider not only the base salary but also other benefits such as health insurance, retirement plans, and bonuses.");
            System.out.println("4. Negotiate respectfully: Approach negotiations with a positive and respectful attitude.");
            System.out.println("5. Be Prepared: Have a clear understanding of your desired salary range and be prepared to justify it.");

            // Additional resources and tips can be added based on the user's needs
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        do {
            System.out.println("As a job seeker, how can I assist you with negotiating job offers and understanding compensation packages?");
            System.out.println("1. Provide resources and tips on negotiating job offers.");
            System.out.println("2. Provide information on industry-standard compensation packages.");
            System.out.println("3. Exit");

            int userChoice = Integer.parseInt(scanner.nextLine());

            // Assume a CompensationAdvisor instance for providing compensation information
            CompensationAdvisor compensationAdvisor = new CompensationAdvisor();

            switch (userChoice) {
                case 1:
                    // Provide resources and tips on negotiating job offers
                    compensationAdvisor.provideCompensationInformation();
                    break;
                case 2:
                    // Provide information on industry-standard compensation packages (replace with actual information)
                    System.out.println("Industry-standard compensation packages vary by role and location. It's important to research specific to your field.");
                    break;
                case 3:
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

