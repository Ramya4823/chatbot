package story29;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RecruiterAssistantChatbotTest {

    @Test
    void testProvidePortfolioPreparationTips() {
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Create an instance of PortfolioPreparationAssistant
        RecruiterAssistantChatbot.PortfolioPreparationAssistant preparationAssistant = new RecruiterAssistantChatbot.PortfolioPreparationAssistant();

        // Call the providePortfolioPreparationTips method
        preparationAssistant.providePortfolioPreparationTips();

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the expected tips are present in the console output
        assertTrue(consoleOutput.contains("Here are some tips for preparing your portfolio or samples of work:"));
        assertTrue(consoleOutput.contains("1. Include a variety of projects that showcase your skills."));
        assertTrue(consoleOutput.contains("2. Provide context for each project, explaining your role and contributions."));
        assertTrue(consoleOutput.contains("3. Tailor your portfolio to align with the requirements of the job."));
        assertTrue(consoleOutput.contains("4. Highlight key achievements and results."));

        // Reset System.out to the original PrintStream
        System.setOut(originalOut);
    }

    @Test
    void testMain() {
        // Redirect System.in and System.out to provide user input and capture console output
        String userInput = "1\nno\n";
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
        assertTrue(consoleOutput.contains("Here are some tips for preparing your portfolio or samples of work:"));
        assertTrue(consoleOutput.contains("Exiting Recruiter Assistant Chatbot. Goodbye!"));

        // Reset System.in and System.out to the original InputStream and PrintStream
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    // Add more test methods to cover other functionalities as needed

}

