package story3;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a CoverLetterAdvisor class for providing advice on cover letter customization
    static class CoverLetterAdvisor {
        public String provideCustomizedAdvice(String jobTitle, String company, String userSkills) {
            // Generate customized advice based on job title, company, and user's skills
            String advice = "Dear Applicant,\n\n" +
                    "I recommend customizing your cover letter for the position of " + jobTitle + " at " +
                    company + ". Highlight your skills in " + userSkills + " and showcase how they align with " +
                    "the company's values and requirements.\n\n" +
                    "Best regards,\nRecruiter Assistant Chatbot";
            return advice;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        do {
            System.out.println("Enter the job title you are applying for:");
            String jobTitle = scanner.nextLine();

            System.out.println("Enter the company you are applying to:");
            String company = scanner.nextLine();

            System.out.println("Enter your skills relevant to the job (comma-separated):");
            String userSkills = scanner.nextLine();

            // Assume a CoverLetterAdvisor instance to provide customized advice
            CoverLetterAdvisor coverLetterAdvisor = new CoverLetterAdvisor();
            String advice = coverLetterAdvisor.provideCustomizedAdvice(jobTitle, company, userSkills);

            System.out.println("Here is your customized advice for your cover letter:\n");
            System.out.println(advice);

            System.out.println("Do you want more advice? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
