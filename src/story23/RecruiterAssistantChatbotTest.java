package story23;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.jupiter.api.Assertions.assertTrue;

class RecruiterAssistantChatbotTest {

    @Test
    void testProvideCareerDevelopmentInfo() {
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create an instance of CareerDevelopmentAdvisor
        RecruiterAssistantChatbot.CareerDevelopmentAdvisor careerDevelopmentAdvisor = new RecruiterAssistantChatbot.CareerDevelopmentAdvisor();

        // Call the provideCareerDevelopmentInfo method
        careerDevelopmentAdvisor.provideCareerDevelopmentInfo();

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the expected messages are present in the console output
        assertTrue(consoleOutput.contains("Here are some career development opportunities within our company:"));
        assertTrue(consoleOutput.contains("TrainingPrograms: We offer various training programs to enhance your skills."));
        assertTrue(consoleOutput.contains("Mentorship: Our mentorship program connects you with experienced professionals."));
        assertTrue(consoleOutput.contains("PromotionOpportunities: We have a clear promotion path based on performance."));

        // Reset System.out to the original PrintStream
        System.setOut(System.out);
    }

    // Add more test methods to cover other functionalities as needed

}
