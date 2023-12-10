package story20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.jupiter.api.Assertions.assertEquals;

class RecruiterAssistantChatbotTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testSendOnboardingMaterials() {
        RecruiterAssistantChatbot.OnboardingMaterialSender materialSender =
                new RecruiterAssistantChatbot.OnboardingMaterialSender();

        // Set up a new hire name
        String newHireName = "John Doe";

        // Send onboarding materials
        materialSender.sendOnboardingMaterials(newHireName);

        // Get the onboarding materials for confirmation
        String onboardingMaterials = materialSender.getOnboardingMaterials(newHireName);

        // Assert that the onboarding materials are as expected
        assertEquals("Welcome to the company, John Doe!\n\nPlease find attached the necessary forms for onboarding.\n\n" +
                "Review the company policies document for a better understanding of our guidelines.", onboardingMaterials);
    }

    // Add more test methods as needed to achieve 100% coverage

    @Test
    void testMainMethod() {
        // Provide an input to simulate user interaction
        String simulatedInput = "John Doe\nno";
        System.setIn(new java.io.ByteArrayInputStream(simulatedInput.getBytes()));

        // Execute the main method
        RecruiterAssistantChatbot.main(new String[]{});

        // Verify the output or add assertions as needed
        String consoleOutput = outContent.toString();
        // Add assertions based on the expected output

        // Reset System.in and System.out to the original InputStream and PrintStream
        System.setIn(System.in);
        System.setOut(originalOut);
    }
}


