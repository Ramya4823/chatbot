package story15;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume an InterviewProcedureProvider class for providing information about the interview procedure
    static class InterviewProcedureProvider {
        public void provideInterviewProcedure(String companyName) {
            System.out.println("Interview procedure information for " + companyName + ":");

            // Simulate providing information about the interview procedure
            System.out.println("1. Application Review: Your application will be reviewed by our recruiting team.");
            System.out.println("2. Initial Screening: A recruiter may conduct a brief phone screening to discuss your background.");
            System.out.println("3. Technical Assessment: Depending on the role, you may be required to complete a technical assessment.");
            System.out.println("4. On-Site Interview: Selected candidates will be invited for an on-site interview with the team.");
            System.out.println("5. Final Interview: A final interview with key decision-makers in the company.");
            System.out.println("6. Reference Check: We may contact your references to learn more about your work experience.");
            System.out.println("7. Job Offer: Successful candidates will receive a job offer.");

            // Additional information or specific details can be added based on the company's interview process
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        do {
            System.out.println("Enter the name of the company:");
            String companyName = scanner.nextLine();

            // Assume an InterviewProcedureProvider instance to provide interview procedure information
            InterviewProcedureProvider procedureProvider = new InterviewProcedureProvider();
            procedureProvider.provideInterviewProcedure(companyName);

            System.out.println("Do you want information about the interview procedure of another company? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
