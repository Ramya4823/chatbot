package story24;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RecruiterAssistantChatbotTest {

    @Test
    void testAnalyzeSourcingChannels() {
        // Redirect System.in and System.out to provide user input and capture console output
        String userInput = "1\n2\nno\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Create an instance of RecruitmentDataAnalyzer
        RecruiterAssistantChatbot.RecruitmentDataAnalyzer dataAnalyzer = new RecruiterAssistantChatbot.RecruitmentDataAnalyzer();

        // Call the analyzeSourcingChannels method
        dataAnalyzer.analyzeSourcingChannels();

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the expected messages are present in the console output
        assertTrue(consoleOutput.contains("Recruitment Data Analysis - Effectiveness of Sourcing Channels:"));
        assertTrue(consoleOutput.contains("Job Boards: 150 candidates sourced"));
        assertTrue(consoleOutput.contains("Employee Referrals: 80 candidates sourced"));
        assertTrue(consoleOutput.contains("Social Media: 120 candidates sourced"));
        assertTrue(consoleOutput.contains("The most effective sourcing channel is: Job Boards"));

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
        assertTrue(consoleOutput.contains("Recruitment Data Analysis - Effectiveness of Sourcing Channels:"));
        assertTrue(consoleOutput.contains("The most effective sourcing channel is: Job Boards"));
        assertTrue(consoleOutput.contains("Exiting Recruiter Assistant Chatbot. Goodbye!"));

        // Reset System.in and System.out to the original InputStream and PrintStream
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    // Add more test methods to cover other functionalities as needed

}
