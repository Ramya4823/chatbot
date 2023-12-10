package story30;

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
        String input = "1\nrejected@example.com\nValuable insights\nno";
        originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect System.out for capturing console output
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testFeedbackAnalysis() {
        // Create an instance of RecruiterAssistantChatbot
     //   RecruiterAssistantChatbot recruiterAssistantChatbot = new RecruiterAssistantChatbot();

        // Call the method to simulate user input
        //recruiterAssistantChatbot.runChatbot();

        // Get the captured console output
      //  String consoleOutput = outContent.toString().trim();

        // Assert that the expected messages are present in the console output
      //  assertTrue(consoleOutput.contains("Feedback received from rejected@example.com: Valuable insights"));
        //assertTrue(consoleOutput.contains("Analyzing Candidate Feedback:"));
        //assertTrue(consoleOutput.contains("Candidate rejected@example.com provided feedback: Valuable insights"));
        //assertTrue(consoleOutput.contains("Areas for Improvement Identified:"));
        //assertTrue(consoleOutput.contains("1. Improve communication during the interview process."));
        //assertTrue(consoleOutput.contains("2. Streamline the application status notification process."));
    }

    // Add more test methods as needed

    @Test
    public void testExit() {
        // Create an instance of RecruiterAssistantChatbot
      //  RecruiterAssistantChatbot recruiterAssistantChatbot = new RecruiterAssistantChatbot();

        // Call the method to simulate user input
       // recruiterAssistantChatbot.runChatbot();

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the exit message is present in the console output
        assertTrue(consoleOutput.contains("Exiting Recruiter Assistant Chatbot. Goodbye!"));
    }

    // Add more test methods as needed

    // Restore original System.in and System.out
    @AfterEach
    public void tearDown() {
        System.setIn(originalIn);
        System.setOut(System.out);
    }
}


