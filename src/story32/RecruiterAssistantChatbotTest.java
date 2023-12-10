package story32;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecruiterAssistantChatbotTest {

    private ByteArrayOutputStream outContent;
    private InputStream originalIn;

    @BeforeEach
    public void setUp() {
        // Redirect System.in for testing
        String input = "1\nno";
        originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect System.out for capturing console output
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCareerGoalsGuidance() {
        // Create an instance of RecruiterAssistantChatbot
        RecruiterAssistantChatbot.CareerGoalsAdvisor goalsAdvisor = new RecruiterAssistantChatbot.CareerGoalsAdvisor();

        // Call the method to simulate user input
        goalsAdvisor.provideCareerGoalsGuidance();

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the expected messages are present in the console output
        assertTrue(consoleOutput.contains("Here is some guidance on setting realistic career goals as a job seeker:"));
        assertTrue(consoleOutput.contains("1. Assess your skills, strengths, and interests to identify areas of focus."));
        assertTrue(consoleOutput.contains("2. Define short-term and long-term career objectives based on your assessment."));
        assertTrue(consoleOutput.contains("3. Ensure your goals are specific, measurable, achievable, relevant, and time-bound (SMART)."));
        assertTrue(consoleOutput.contains("4. Research industry trends and job market demands to align your goals with opportunities."));
        assertTrue(consoleOutput.contains("5. Seek mentorship and advice from professionals in your desired field."));
    }

    @Test
    public void testExit() {
        // Create an instance of RecruiterAssistantChatbot
        RecruiterAssistantChatbot recruiterAssistantChatbot = new RecruiterAssistantChatbot();

        // Call the method to simulate user input
        recruiterAssistantChatbot.main(new String[0]);

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the exit message is present in the console output
        assertTrue(consoleOutput.contains("Exiting Recruiter Assistant Chatbot. Goodbye!"));
    }

    @AfterEach
    public void tearDown() {
        // Restore original System.in and System.out
        System.setIn(originalIn);
        System.setOut(System.out);
    }
}

