package story5;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume an ApplicationAssistant class for providing application guidance
    static class ApplicationAssistant {
        public void provideApplicationGuidance(String company, String jobTitle) {
            System.out.println("To apply for the position of " + jobTitle + " at " + company + ":");
            System.out.println("1. Update your resume to highlight relevant skills and experience.");
            System.out.println("2. Prepare any pertinent papers, such as a cover letter or portfolio.");

            // Additional steps can be added based on specific application requirements

            System.out.println("3. Visit the company's official website or job portal.");
            System.out.println("4. Locate the 'Careers' or 'Job Opportunities' section.");
            System.out.println("5. Find the specific job opening for " + jobTitle + ".");
            System.out.println("6. Follow the application instructions provided by the company.");
            System.out.println("7. Attach your resume and any pertinent papers as required.");
            System.out.println("8. Complete the application form, if applicable.");
            System.out.println("9. Double-check all information before submitting.");
            System.out.println("10. Submit your application.");

            System.out.println("You have successfully applied for the position. Good luck!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        do {
            System.out.println("Enter the name of the company you want to apply to:");
            String company = scanner.nextLine();

            System.out.println("Enter the job title you are applying for:");
            String jobTitle = scanner.nextLine();

            // Assume an ApplicationAssistant instance to provide application guidance
            ApplicationAssistant applicationAssistant = new ApplicationAssistant();
            applicationAssistant.provideApplicationGuidance(company, jobTitle);

            System.out.println("Do you want to apply to another job? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
