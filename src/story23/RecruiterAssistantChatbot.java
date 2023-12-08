package story23;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a CareerDevelopmentAdvisor class for providing information about career development
    static class CareerDevelopmentAdvisor {
        private Map<String, String> careerDevelopmentInfo = new HashMap<>();

        public CareerDevelopmentAdvisor() {
            // Simulate information about career development opportunities (replace with actual information)
            careerDevelopmentInfo.put("TrainingPrograms", "We offer various training programs to enhance your skills.");
            careerDevelopmentInfo.put("Mentorship", "Our mentorship program connects you with experienced professionals.");
            careerDevelopmentInfo.put("PromotionOpportunities", "We have a clear promotion path based on performance.");
            // Add more information based on your company's career development opportunities
        }

        public void provideCareerDevelopmentInfo() {
            // Simulate providing information about career development opportunities
            System.out.println("Here are some career development opportunities within our company:");
            for (Map.Entry<String, String> entry : careerDevelopmentInfo.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        // Assume a CareerDevelopmentAdvisor instance for providing career development information
        CareerDevelopmentAdvisor careerDevelopmentAdvisor = new CareerDevelopmentAdvisor();

        do {
            System.out.println("As a job seeker, how can I assist you with career development?");
            System.out.println("1. Provide information about career development opportunities within the company.");
            System.out.println("2. Exit");

            int userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 1:
                    // Provide information about career development opportunities
                    careerDevelopmentAdvisor.provideCareerDevelopmentInfo();
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
