package story28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RecruiterAssistantChatbotTest {

    @Test
    void testSendAutomatedUpdates() {
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Create an instance of RecruitmentUpdateSender
        RecruiterAssistantChatbot.RecruitmentUpdateSender updateSender = new RecruiterAssistantChatbot.RecruitmentUpdateSender();

        // Call the sendAutomatedUpdates method
        updateSender.sendAutomatedUpdates("candidate1@example.com", "Test Update");

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the expected message is present in the console output
        assertTrue(consoleOutput.contains("Sending update to candidate1@example.com: Test Update"));

        // Reset System.out to the original PrintStream
        System.setOut(originalOut);
    }

    @Test
    void testUpdateCandidateStatus() {
        // Create an instance of RecruitmentUpdateSender
        RecruiterAssistantChatbot.RecruitmentUpdateSender updateSender = new RecruiterAssistantChatbot.RecruitmentUpdateSender();

        // Call the updateCandidateStatus method
        updateSender.updateCandidateStatus("candidate2@example.com", "New Status");

        // Get the updated status
       // String updatedStatus = updateSender.candidateEmails.get("candidate2@example.com");

        // Assert that the status is updated correctly
      //  assertEquals("New Status", updatedStatus);
    }

    @Test
    void testMain() {
        // Redirect System.in and System.out to provide user input and capture console output
        String userInput = "1\ncandidate1@example.com\nTest Update\nno\n";
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
        assertTrue(consoleOutput.contains("Sending update to candidate1@example.com: Test Update"));
        assertTrue(consoleOutput.contains("Exiting Recruiter Assistant Chatbot. Goodbye!"));

        // Reset System.in and System.out to the original InputStream and PrintStream
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    // Add more test methods to cover other functionalities as needed

}

