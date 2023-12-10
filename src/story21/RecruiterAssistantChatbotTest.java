package story21;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;




import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class RecruiterAssistantChatbotTest {

    @Test
    void testGuideOnboarding() {
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create an instance of OnboardingGuide
        RecruiterAssistantChatbot.OnboardingGuide onboardingGuide = new RecruiterAssistantChatbot.OnboardingGuide();

        // Call the guideOnboarding method
        onboardingGuide.guideOnboarding("Applicant1");

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the expected messages are present in the console output
        assertTrue(consoleOutput.contains("Company Procedures:"));
        assertTrue(consoleOutput.contains("Welcome to our company! We are excited to have you on board."));
        assertTrue(consoleOutput.contains("Please complete the necessary forms provided in your onboarding materials."));
        assertTrue(consoleOutput.contains("Attend the orientation session to get an overview of our company culture and policies."));
        assertTrue(consoleOutput.contains("Expectations:"));
        assertTrue(consoleOutput.contains("Professionalism: Maintain a high level of professionalism in all interactions."));
        assertTrue(consoleOutput.contains("Teamwork: Collaborate with team members to achieve common goals."));
        assertTrue(consoleOutput.contains("Communication: Communicate effectively and keep your team informed of your progress."));
        assertTrue(consoleOutput.contains("Onboarding guidance completed for Applicant1."));

        // Reset System.out to the original PrintStream
        System.setOut(System.out);
    }

    // Add more test methods as needed
}
