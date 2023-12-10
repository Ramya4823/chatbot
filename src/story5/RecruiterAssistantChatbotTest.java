package story5;

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
    public void testApplicationAssistant() {
        // Redirect System.in for testing
        String input = "CompanyX\nSoftware Engineer\nno";
        setUpInputStream(input);

        // Redirect System.out for capturing console output
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create an instance of RecruiterAssistantChatbot
        RecruiterAssistantChatbot.ApplicationAssistant applicationAssistant =
                new RecruiterAssistantChatbot.ApplicationAssistant();

        // Call the method to provide application guidance
        applicationAssistant.provideApplicationGuidance("CompanyX", "Software Engineer");

        // Get the captured console output
        String consoleOutput = captureConsoleOutput();

        // Assert that the expected messages are present in the console output
        assertTrue(consoleOutput.contains("To apply for the position of Software Engineer at CompanyX:"));
        assertTrue(consoleOutput.contains("1. Update your resume to highlight relevant skills and experience."));
        assertTrue(consoleOutput.contains("2. Prepare any pertinent papers, such as a cover letter or portfolio."));
        assertTrue(consoleOutput.contains("3. Visit the company's official website or job portal."));
        assertTrue(consoleOutput.contains("4. Locate the 'Careers' or 'Job Opportunities' section."));
        assertTrue(consoleOutput.contains("5. Find the specific job opening for Software Engineer."));
        assertTrue(consoleOutput.contains("6. Follow the application instructions provided by the company."));
        assertTrue(consoleOutput.contains("7. Attach your resume and any pertinent papers as required."));
        assertTrue(consoleOutput.contains("8. Complete the application form, if applicable."));
        assertTrue(consoleOutput.contains("9. Double-check all information before submitting."));
        assertTrue(consoleOutput.contains("10. Submit your application."));
        assertTrue(consoleOutput.contains("You have successfully applied for the position. Good luck!"));

        // Restore original System.in and System.out
        System.setIn(originalIn);
        System.setOut(System.out);
    }
}
