package story6;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a CandidateInquiryResponder class for responding to candidate inquiries
    static class CandidateInquiryResponder {
        public void respondToInquiries(String inquiryType, String companyName) {
            switch (inquiryType.toLowerCase()) {
                case "advantages":
                    provideCompanyAdvantages(companyName);
                    break;
                case "application process":
                    provideApplicationProcessDetails(companyName);
                    break;
                case "culture":
                    provideCompanyCultureDetails(companyName);
                    break;
                default:
                    System.out.println("I'm sorry, I couldn't understand that inquiry.");
            }
        }

        private void provideCompanyAdvantages(String companyName) {
            // Simulate providing advantages of the company
            System.out.println("Advantages of working at " + companyName + ":");
            System.out.println("- Competitive salary and benefits");
            System.out.println("- Opportunities for professional development");
            System.out.println("- Inclusive and collaborative work environment");
        }

        private void provideApplicationProcessDetails(String companyName) {
            // Simulate providing details about the application process
            System.out.println("Application process for " + companyName + ":");
            System.out.println("- Visit our official website or job portal");
            System.out.println("- Explore available job openings");
            System.out.println("- Follow the application instructions provided");
            System.out.println("- Submit your resume and cover letter as required");
        }

        private void provideCompanyCultureDetails(String companyName) {
            // Simulate providing details about the company's culture
            System.out.println("Culture at " + companyName + ":");
            System.out.println("- Emphasis on teamwork and innovation");
            System.out.println("- Commitment to diversity and inclusion");
            System.out.println("- Employee well-being and work-life balance");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        do {
            System.out.println("Enter the type of inquiry (advantages, application process, culture):");
            String inquiryType = scanner.nextLine();

            System.out.println("Enter the name of the company:");
            String companyName = scanner.nextLine();

            // Assume a CandidateInquiryResponder instance to respond to candidate inquiries
            CandidateInquiryResponder inquiryResponder = new CandidateInquiryResponder();
            inquiryResponder.respondToInquiries(inquiryType, companyName);

            System.out.println("Do you have another inquiry? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
