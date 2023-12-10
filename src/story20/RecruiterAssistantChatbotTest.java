package story20;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecruiterAssistantChatbotTest {

    @Test
    void testSendOnboardingMaterials() {
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create an instance of OnboardingMaterialSender
        RecruiterAssistantChatbot.OnboardingMaterialSender materialSender = new RecruiterAssistantChatbot.OnboardingMaterialSender();

        // Call the sendOnboardingMaterials method
        materialSender.sendOnboardingMaterials("NewHire1");

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the expected message is present in the console output
        assertEquals("Onboarding materials sent to NewHire1.", consoleOutput);

        // Reset System.out to the original PrintStream
        System.setOut(System.out);
    }

    // Add more test methods as needed
}

