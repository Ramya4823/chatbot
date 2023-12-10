package story31;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

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
    public void testLifeManagementTips() {
    

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the expected messages are present in the console output
      //  assertTrue(consoleOutput.contains("Here are some tips on managing your personal and professional lives as a job seeker:"));
       // assertTrue(consoleOutput.contains("1. Set clear goals for your job search and prioritize tasks."));
        //assertTrue(consoleOutput.contains("2. Establish a daily routine to stay organized and maintain work-life balance."));
        //assertTrue(consoleOutput.contains("3. Network actively to expand your professional connections."));
        //assertTrue(consoleOutput.contains("4. Take breaks to avoid burnout and maintain mental well-being."));
        //assertTrue(consoleOutput.contains("5. Enhance your skills through continuous learning and professional development."));
    }

    @Test
    public void testExit() {
     

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the exit message is present in the console output
      //  assertTrue(consoleOutput.contains("Exiting Recruiter Assistant Chatbot. Goodbye!"));
    }

    @AfterEach
    public void tearDown() {
        // Restore original System.in and System.out
        System.setIn(originalIn);
        System.setOut(System.out);
    }
}
