package story7;

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
    public void testIndustryInsightsProvider() {
        // Redirect System.in for testing
        String input = "Software Development\nno";
        setUpInputStream(input);

        // Redirect System.out for capturing console output
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create an instance of RecruiterAssistantChatbot
        RecruiterAssistantChatbot.IndustryInsightsProvider insightsProvider =
                new RecruiterAssistantChatbot.IndustryInsightsProvider();

        // Call the method to provide industry insights
        insightsProvider.provideIndustryInsights("Software Development");

        // Get the captured console output
        String consoleOutput = captureConsoleOutput();

        // Assert that the expected messages are present in the console output
        assertTrue(consoleOutput.contains("Industry insights for Software Development:"));
        assertTrue(consoleOutput.contains("- Emerging technologies and skills in demand"));
        assertTrue(consoleOutput.contains("- Current market dynamics and challenges"));
        assertTrue(consoleOutput.contains("Compensation expectations for Software Development:"));
        assertTrue(consoleOutput.contains("- Median salary range: $X,XXX - $Y,XXX"));
        assertTrue(consoleOutput.contains("- Factors affecting compensation, such as experience and location"));

        // Restore original System.in and System.out
        System.setIn(originalIn);
        System.setOut(System.out);
    }

    // Add more test methods as needed

    @Test
    public void testExit() {
        // Create an instance of RecruiterAssistantChatbot
        RecruiterAssistantChatbot.IndustryInsightsProvider insightsProvider =
                new RecruiterAssistantChatbot.IndustryInsightsProvider();

        // Redirect System.in for testing
        String input = "exit\nno";
        setUpInputStream(input);

        // Redirect System.out for capturing console output
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method to provide industry insights
        insightsProvider.provideIndustryInsights("exit");

        // Get the captured console output
        String consoleOutput = captureConsoleOutput();

        // Assert that the exit message is present in the console output
      //  assertTrue(consoleOutput.contains("I'm sorry, I couldn't understand that profession."));

        // Restore original System.in and System.out
        //System.setIn(originalIn);
    //    System.setOut(System.out);
    }
}
