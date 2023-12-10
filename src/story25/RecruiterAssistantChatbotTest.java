package story25;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RecruiterAssistantChatbotTest {

    @Test
    void testProvideProfessionalDevelopmentInfo() {
        // Redirect System.in and System.out to provide user input and capture console output
        String userInput = "1\n2\nno\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Create an instance of ProfessionalDevelopmentAdvisor
        RecruiterAssistantChatbot.ProfessionalDevelopmentAdvisor developmentAdvisor = new RecruiterAssistantChatbot.ProfessionalDevelopmentAdvisor();

        // Call the provideProfessionalDevelopmentInfo method
        developmentAdvisor.provideProfessionalDevelopmentInfo();

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the expected messages are present in the console output
        assertTrue(consoleOutput.contains("Relevant Professional Development Opportunities:"));
        assertTrue(consoleOutput.contains("Attend industry conferences for networking."));
        assertTrue(consoleOutput.contains("Enroll in online courses for skill enhancement."));
        assertTrue(consoleOutput.contains("Join professional associations for career growth."));

        assertTrue(consoleOutput.contains("Relevant Certifications:"));
        assertTrue(consoleOutput.contains("Certified Professional in [Your Field]"));
        assertTrue(consoleOutput.contains("Project Management Professional (PMP)"));
        assertTrue(consoleOutput.contains("Google Analytics Certification"));

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
        assertTrue(consoleOutput.contains("Relevant Professional Development Opportunities:"));
        assertTrue(consoleOutput.contains("Relevant Certifications:"));
        assertTrue(consoleOutput.contains("Exiting Recruiter Assistant Chatbot. Goodbye!"));

        // Reset System.in and System.out to the original InputStream and PrintStream
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    // Add more test methods to cover other functionalities as needed

}
