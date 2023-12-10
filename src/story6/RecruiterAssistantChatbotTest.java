package story6;

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
    public void testInquiryResponderAdvantages() {
        // Redirect System.in for testing
        String input = "advantages\nCompanyX\nno";
        setUpInputStream(input);

        // Redirect System.out for capturing console output
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create an instance of RecruiterAssistantChatbot
        RecruiterAssistantChatbot.CandidateInquiryResponder inquiryResponder =
                new RecruiterAssistantChatbot.CandidateInquiryResponder();

        // Call the method to respond to inquiries
        inquiryResponder.respondToInquiries("advantages", "CompanyX");

        // Get the captured console output
        String consoleOutput = captureConsoleOutput();

        // Assert that the expected messages are present in the console output
        assertTrue(consoleOutput.contains("Advantages of working at CompanyX:"));
        assertTrue(consoleOutput.contains("- Competitive salary and benefits"));
        assertTrue(consoleOutput.contains("- Opportunities for professional development"));
        assertTrue(consoleOutput.contains("- Inclusive and collaborative work environment"));

        // Restore original System.in and System.out
        System.setIn(originalIn);
        System.setOut(System.out);
    }

    // Add more test methods for other inquiry types (application process, culture)

    @Test
    public void testExit() {
        // Create an instance of RecruiterAssistantChatbot
        RecruiterAssistantChatbot.CandidateInquiryResponder inquiryResponder =
                new RecruiterAssistantChatbot.CandidateInquiryResponder();

        // Redirect System.in for testing
        String input = "exit\nCompanyX\nno";
        setUpInputStream(input);

        // Redirect System.out for capturing console output
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method to respond to inquiries
        inquiryResponder.respondToInquiries("exit", "CompanyX");

        // Get the captured console output
        String consoleOutput = captureConsoleOutput();

        // Assert that the exit message is present in the console output
        assertTrue(consoleOutput.contains("I'm sorry, I couldn't understand that inquiry."));

        // Restore original System.in and System.out
        System.setIn(originalIn);
        System.setOut(System.out);
    }
}
