package story10;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a JobDescriptionGenerator class for creating job descriptions
    static class JobDescriptionGenerator {
        public String generateJobDescription(String jobTitle, String skillsRequired, String company) {
            // Simulate generating a job description
            StringBuilder jobDescription = new StringBuilder();
            jobDescription.append("Job Title: ").append(jobTitle).append("\n");
            jobDescription.append("Skills Required: ").append(skillsRequired).append("\n");
            jobDescription.append("Company: ").append(company).append("\n\n");
            jobDescription.append("Responsibilities:\n");
            jobDescription.append("- List of responsibilities goes here\n\n");
            jobDescription.append("Qualifications:\n");
            jobDescription.append("- List of qualifications goes here\n\n");
            jobDescription.append("How to Apply:\n");
            jobDescription.append("Please submit your resume and cover letter through our website.\n");

            return jobDescription.toString();
        }

        // Assume a JobPostingService class for posting job descriptions on various platforms
        public void postJobDescription(String jobDescription, String platform) {
            // Simulate posting the job description on a specific platform
            System.out.println("Posting job description on " + platform + ":\n" + jobDescription);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        do {
            System.out.println("Enter the job title:");
            String jobTitle = scanner.nextLine();

            System.out.println("Enter the required skills (comma-separated):");
            String skillsRequired = scanner.nextLine();

            System.out.println("Enter the company name:");
            String company = scanner.nextLine();

            // Assume a JobDescriptionGenerator instance to generate the job description
            JobDescriptionGenerator descriptionGenerator = new JobDescriptionGenerator();
            String jobDescription = descriptionGenerator.generateJobDescription(jobTitle, skillsRequired, company);

            System.out.println("Job Description:\n" + jobDescription);

            // Assume a JobPostingService instance to post the job description on various platforms
            System.out.println("Enter the platform to post the job description:");
            String platform = scanner.nextLine();
            descriptionGenerator.postJobDescription(jobDescription, platform);

            System.out.println("Do you want to create and post another job description? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}

