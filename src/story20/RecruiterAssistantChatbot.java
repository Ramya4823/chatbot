package story20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume an OnboardingMaterialSender class for sending onboarding materials
    static class OnboardingMaterialSender {
        private Map<String, String> newHireMaterials = new HashMap<>();

        public void sendOnboardingMaterials(String newHireName) {
            // Simulate sending onboarding materials
            generateOnboardingMaterials(newHireName);

            // Provide a confirmation message
            System.out.println("Onboarding materials sent to " + newHireName + ".");
        }

        private void generateOnboardingMaterials(String newHireName) {
            // Simulate generating onboarding materials (replace with actual document generation logic)
            String welcomeMessage = "Welcome to the company, " + newHireName + "!";
            String forms = "Please find attached the necessary forms for onboarding.";
            String policies = "Review the company policies document for a better understanding of our guidelines.";

            // Store the generated materials
            newHireMaterials.put(newHireName, welcomeMessage + "\n\n" + forms + "\n\n" + policies);
        }

        public String getOnboardingMaterials(String newHireName) {
            // Get the onboarding materials for a new hire
            return newHireMaterials.getOrDefault(newHireName, "No onboarding materials available");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        // Assume a list of new hires
        // Assume an OnboardingMaterialSender instance for sending onboarding materials
        OnboardingMaterialSender materialSender = new OnboardingMaterialSender();

        do {
            System.out.println("Enter the name of the new hire:");
            String newHireName = scanner.nextLine();

            // Send onboarding materials to the new hire
            materialSender.sendOnboardingMaterials(newHireName);

            // Get the onboarding materials for confirmation
            String onboardingMaterials = materialSender.getOnboardingMaterials(newHireName);
            System.out.println("Onboarding Materials for " + newHireName + ":\n" + onboardingMaterials);

            System.out.println("Do you want to send onboarding materials to another new hire? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}

