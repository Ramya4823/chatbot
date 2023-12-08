package story7;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume an IndustryInsightsProvider class for offering insights about industry trends and compensation
    static class IndustryInsightsProvider {
        public void provideIndustryInsights(String profession) {
            System.out.println("Industry insights for " + profession + ":");
            
            // Simulate providing insights about industry trends
            System.out.println("- Emerging technologies and skills in demand");
            System.out.println("- Current market dynamics and challenges");

            // Simulate providing insights about compensation expectations
            System.out.println("\nCompensation expectations for " + profession + ":");
            System.out.println("- Median salary range: $X,XXX - $Y,XXX");
            System.out.println("- Factors affecting compensation, such as experience and location");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        do {
            System.out.println("Enter the name of the profession for industry insights:");
            String profession = scanner.nextLine();

            // Assume an IndustryInsightsProvider instance to offer insights
            IndustryInsightsProvider insightsProvider = new IndustryInsightsProvider();
            insightsProvider.provideIndustryInsights(profession);

            System.out.println("Do you want insights for another profession? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
