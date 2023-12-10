package story31;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class RecruiterAssistantChatbotTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testProvideLifeManagementTips() {
        RecruiterAssistantChatbot.LifeManagementAdvisor managementAdvisor =
                new RecruiterAssistantChatbot.LifeManagementAdvisor();

        // Capture the console output
        System.out.println("Test Output: Provide Life Management Tips");
        managementAdvisor.provideLifeManagementTips();
        String consoleOutput = outContent.toString().trim();

        // Assert that the output contains expected tips
        assertTrue(consoleOutput.contains("Set clear goals for your job search and prioritize tasks."));
        assertTrue(consoleOutput.contains("Establish a daily routine to stay organized and maintain work-life balance."));
        assertTrue(consoleOutput.contains("Network actively to expand your professional connections."));
        assertTrue(consoleOutput.contains("Take breaks to avoid burnout and maintain mental well-being."));
        assertTrue(consoleOutput.contains("Enhance your skills through continuous learning and professional development."));
    }

    @Test
    void testMainMethod() {
        // Provide an input to simulate user interaction
        String simulatedInput = "1\nno";
        System.setIn(new java.io.ByteArrayInputStream(simulatedInput.getBytes()));

        // Execute the main method
        RecruiterAssistantChatbot.main(new String[]{});

        // Verify the output or add assertions as needed
        String consoleOutput = outContent.toString().trim();
        assertTrue(consoleOutput.contains("Here are some tips on managing your personal and professional lives as a job seeker"));
        assertTrue(consoleOutput.contains("Do you want assistance with anything else? (yes/no)"));

        // Reset System.in and System.out to the original InputStream and PrintStream
        System.setIn(System.in);
        System.setOut(originalOut);
    }
}
