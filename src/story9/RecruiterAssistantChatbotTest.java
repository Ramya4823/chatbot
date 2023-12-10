package story9;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecruiterAssistantChatbotTest {

    private ByteArrayOutputStream outContent;
    private InputStream originalIn;

    // Set up input stream for testing
    private void setUpInputStream(String input) {
        originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    // Capture console output for testing
    private String captureConsoleOutput() {
        return outContent.toString().trim();
    }

    @Test
    public void testDeadlineReminder() {
        // Redirect System.in for testing
        String input = "9\nno";
        setUpInputStream(input);

        // Redirect System.out for capturing console output
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create an instance of RecruiterAssistantChatbot
        RecruiterAssistantChatbot.ApplicationDeadlineReminder deadlineReminder =
                new RecruiterAssistantChatbot.ApplicationDeadlineReminder();

        // Call the method to remind about deadlines
        deadlineReminder.remindAboutDeadlines();

        // Get the captured console output
        String consoleOutput = captureConsoleOutput();

        // Assert that the expected messages are present in the console output
        assertTrue(consoleOutput.contains("Reminding job applicants to complete necessary paperwork and about approaching deadlines for job applications."));
        assertTrue(consoleOutput.contains("Please ensure you have submitted all required documents and meet the application deadlines."));

        // Restore original System.in and System.out
        System.setIn(originalIn);
        System.setOut(System.out);
    }

    // Add more test methods as needed

    @Test
    public void testExit() {
        // Create an instance of RecruiterAssistantChatbot
        RecruiterAssistantChatbot.ApplicationDeadlineReminder deadlineReminder =
                new RecruiterAssistantChatbot.ApplicationDeadlineReminder();

        // Redirect System.in for testing
        String input = "10\nno";
        setUpInputStream(input);

        // Redirect System.out for capturing console output
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method to exit
        deadlineReminder.remindAboutDeadlines();

        // Get the captured console output
        String consoleOutput = captureConsoleOutput();

       
    }
}
