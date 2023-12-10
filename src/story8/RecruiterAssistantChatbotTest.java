package story8;

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
    public void testATSConnector() {
        // Redirect System.in for testing
        String input = "John Doe\npath/to/resume.pdf\nno";
        setUpInputStream(input);

        // Redirect System.out for capturing console output
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create an instance of RecruiterAssistantChatbot
        RecruiterAssistantChatbot.ApplicantTrackingSystemConnector atsConnector =
                new RecruiterAssistantChatbot.ApplicantTrackingSystemConnector();

        // Call the method to link with the ATS
        atsConnector.linkWithATS("John Doe", "path/to/resume.pdf");

        // Get the captured console output
        String consoleOutput = captureConsoleOutput();

        // Assert that the expected messages are present in the console output
        assertTrue(consoleOutput.contains("Linking with ATS..."));
        assertTrue(consoleOutput.contains("Candidate: John Doe"));
        assertTrue(consoleOutput.contains("Resume: path/to/resume.pdf"));
        assertTrue(consoleOutput.contains("Candidate profile and application linked with the ATS successfully."));

        // Restore original System.in and System.out
        System.setIn(originalIn);
        System.setOut(System.out);
    }

    // Add more test methods as needed

    @Test
    public void testExit() {
        // Create an instance of RecruiterAssistantChatbot
        RecruiterAssistantChatbot.ApplicantTrackingSystemConnector atsConnector =
                new RecruiterAssistantChatbot.ApplicantTrackingSystemConnector();

        // Redirect System.in for testing
        String input = "exit\nno";
        setUpInputStream(input);

        // Redirect System.out for capturing console output
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method to link with the ATS
        atsConnector.linkWithATS("exit", "path/to/resume.pdf");

      
      
    }
}
