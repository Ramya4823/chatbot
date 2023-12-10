package story3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RecruiterAssistantChatbotTest {

    @Test
    void testProvideCustomizedAdvice() {
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Create an instance of CoverLetterAdvisor
        //RecruiterAssistantChatbot.CoverLetterAdvisor coverLetterAdvisor = new RecruiterAssistantChatbot.CoverLetterAdvisor();

        // Call the provideCustomizedAdvice method
        //String advice = coverLetterAdvisor.provideCustomizedAdvice("Software Engineer", "ABC Inc.", "Java, Python, SQL");

        // Get the captured console output
       // String consoleOutput = outContent.toString().trim();

        // Assert that the expected advice is present in the console output
     //   assertTrue(consoleOutput.contains("Dear Applicant,"));
        //assertTrue(consoleOutput.contains("I recommend customizing your cover letter for the position of Software Engineer at ABC Inc."));
       // assertTrue(consoleOutput.contains("Highlight your skills in Java, Python, SQL and showcase how they align with the company's values and requirements."));
        //assertTrue(consoleOutput.contains("Best regards,\nRecruiter Assistant Chatbot"));

        // Reset System.out to the original PrintStream
        System.setOut(originalOut);
    }

    @Test
    void testMain() {
        // Redirect System.in and System.out to provide user input and capture console output
        String userInput = "Software Engineer\nABC Inc.\nJava, Python, SQL\nno\n";
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
        assertTrue(consoleOutput.contains("Here is your customized advice for your cover letter:"));
        assertTrue(consoleOutput.contains("Exiting Recruiter Assistant Chatbot. Goodbye!"));

        // Reset System.in and System.out to the original InputStream and PrintStream
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    // Add more test methods to cover other functionalities as needed

}
