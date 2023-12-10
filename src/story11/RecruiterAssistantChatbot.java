package story11;

import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a LinkedInProfileAdvisor class for providing advice on LinkedIn profiles
    static class LinkedInProfileAdvisor {
        public void provideProfileAdvice(String userName) {
            // Simulate providing advice to improve the LinkedIn profile
            System.out.println("Advice for improving your LinkedIn profile, " + userName + ":");
            System.out.println("1. Profile Picture: Use a professional and clear profile picture.");
            System.out.println("2. Headline: Craft a compelling headline that showcases your skills and interests.");
            System.out.println("3. Summary: Write a concise and engaging summary highlighting your career goals and achievements.");
            System.out.println("4. Experience: Provide detailed descriptions of your work experience, emphasizing accomplishments.");
            System.out.println("5. Skills: List relevant skills to attract recruiters and employers.");
            System.out.println("6. Recommendations: Request and provide recommendations from colleagues and supervisors.");
            System.out.println("7. Connections: Connect with professionals in your industry to expand your network.");

            System.out.println("\nRemember to regularly update your profile and engage with your network!");

            // Additional personalized advice can be added based on the user's specific profile
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        do {
            System.out.println("Enter your LinkedIn username:");
            String userName = scanner.nextLine();

            // Assume a LinkedInProfileAdvisor instance to provide profile advice
            LinkedInProfileAdvisor profileAdvisor = new LinkedInProfileAdvisor();
            profileAdvisor.provideProfileAdvice(userName);

            System.out.println("Do you want more advice? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}

