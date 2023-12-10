package story4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
    public void testPhoneInterviewer() {
        // Redirect System.in for testing
        String input = "John Doe\nno";
        setUpInputStream(input);

        // Redirect System.out for capturing console output
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create an instance of RecruiterAssistantChatbot
        RecruiterAssistantChatbot.PhoneInterviewer phoneInterviewer = new RecruiterAssistantChatbot.PhoneInterviewer();

        // Call the method to conduct a phone interview
        phoneInterviewer.conductPhoneInterview("John Doe");

        // Get the captured console output
        String consoleOutput = captureConsoleOutput();

        // Assert that the expected messages are present in the console output
        assertTrue(consoleOutput.contains("Phone interview with candidate: John Doe"));
        assertTrue(consoleOutput.contains("Please answer the following open-ended questions:"));
        assertTrue(consoleOutput.contains("Can you tell me about your experience and how it aligns with the requirements of the job?"));
        assertTrue(consoleOutput.contains("What motivated you to apply for this position at our company?"));
        assertTrue(consoleOutput.contains("Thank you for your responses. We will contact you with further information."));

        // Restore original System.in and System.out
        System.setIn(originalIn);
        System.setOut(System.out);
    }
}
