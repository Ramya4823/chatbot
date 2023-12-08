package story2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a JobApplicationService class that interacts with a job application database or API
    static class JobApplicationService {
        // This is a simple in-memory list for demonstration purposes
        private static final List<JobApplication> jobApplications = new ArrayList<>();

        static {
            // Populate some sample job applications
            jobApplications.add(new JobApplication("John Doe", "Software Engineer", "Java, Python", "3 years experience"));
            jobApplications.add(new JobApplication("Jane Smith", "Marketing Specialist", "Marketing, Social Media", "2 years experience"));
            jobApplications.add(new JobApplication("Bob Johnson", "Data Analyst", "SQL, Excel", "4 years experience"));
        }

        public List<JobApplication> findQualifiedApplicants(String requiredSkills) {
            List<JobApplication> qualifiedApplicants = new ArrayList<>();
            for (JobApplication application : jobApplications) {
                if (application.matchesSkills(requiredSkills)) {
                    qualifiedApplicants.add(application);
                }
            }
            return qualifiedApplicants;
        }
    }

    static class JobApplication {
        private final String applicantName;
        private final String desiredPosition;
        private final String skills;
        private final String experience;

        public JobApplication(String applicantName, String desiredPosition, String skills, String experience) {
            this.applicantName = applicantName;
            this.desiredPosition = desiredPosition;
            this.skills = skills;
            this.experience = experience;
        }

        public boolean matchesSkills(String requiredSkills) {
            // Simple logic for demonstration purposes (case-insensitive check)
            return skills.toLowerCase().contains(requiredSkills.toLowerCase());
        }

        @Override
        public String toString() {
            return "JobApplication{" +
                    "applicantName='" + applicantName + '\'' +
                    ", desiredPosition='" + desiredPosition + '\'' +
                    ", skills='" + skills + '\'' +
                    ", experience='" + experience + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        do {
            System.out.println("Enter the required skills to find qualified applicants:");
            String requiredSkills = scanner.nextLine();

            // Assume a JobApplicationService instance to fetch job applications
            JobApplicationService jobApplicationService = new JobApplicationService();
            List<JobApplication> qualifiedApplicants = jobApplicationService.findQualifiedApplicants(requiredSkills);

            if (!qualifiedApplicants.isEmpty()) {
                System.out.println("Found qualified applicants:");
                for (JobApplication application : qualifiedApplicants) {
                    System.out.println(application);
                }
            } else {
                System.out.println("No qualified applicants found for the given skills.");
            }

            System.out.println("Do you want to search again? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
