package story26;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RecruiterAssistantChatbotTest {

    @Test
    void testOrganizeAndPromoteVirtualJobFair() {
        // Redirect System.in and System.out to provide user input and capture console output
        String userInput = "1\n2\nno\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Create an instance of VirtualJobFairCoordinator
        RecruiterAssistantChatbot.VirtualJobFairCoordinator jobFairCoordinator = new RecruiterAssistantChatbot.VirtualJobFairCoordinator();

        // Call the organizeAndPromoteVirtualJobFair method
        jobFairCoordinator.organizeAndPromoteVirtualJobFair();

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the expected messages are present in the console output
        assertTrue(consoleOutput.contains("Virtual Job Fair Details:"));
        assertTrue(consoleOutput.contains("Virtual Job Fair on [Date] from [Time]."));
        assertTrue(consoleOutput.contains("Explore opportunities from leading companies."));
        assertTrue(consoleOutput.contains("Connect with recruiters through virtual booths."));

        assertTrue(consoleOutput.contains("Promoting the Virtual Job Fair:"));
        assertTrue(consoleOutput.contains("Share the event on social media platforms."));
        assertTrue(consoleOutput.contains("Collaborate with diversity-focused organizations."));
        assertTrue(consoleOutput.contains("Highlight inclusive hiring practices in promotional materials."));

        // Reset System.in and System.out to the original InputStream and PrintStream
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    void testMain() {
        // Redirect System.in and System.out to provide user input and capture console output
        String userInput = "1\n2\nno\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Call the main method
        RecruiterAssistantChatbot.main(new String[]{});

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the expected messages are present in the console output
        assertTrue(consoleOutput.contains("Welcome to the Recruiter Assistant Chatbot!"));
        assertTrue(consoleOutput.contains("Virtual Job Fair Details:"));
        assertTrue(consoleOutput.contains("Promoting the Virtual Job Fair:"));
        assertTrue(consoleOutput.contains("Exiting Recruiter Assistant Chatbot. Goodbye!"));

        // Reset System.in and System.out to the original InputStream and PrintStream
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    // Add more test methods to cover other functionalities as needed

}
