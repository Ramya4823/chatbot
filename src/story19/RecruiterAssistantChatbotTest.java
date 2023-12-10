package story19;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RecruiterAssistantChatbotTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testProvideCompensationInformation() {
        RecruiterAssistantChatbot.CompensationAdvisor compensationAdvisor = new RecruiterAssistantChatbot.CompensationAdvisor();
        compensationAdvisor.provideCompensationInformation();

        String consoleOutput = outContent.toString();
        
        assertTrue(consoleOutput.contains("Research industry-standard salaries"));
        assertTrue(consoleOutput.contains("Understand your skills, qualifications, and the value"));
        assertTrue(consoleOutput.contains("Consider not only the base salary but also other benefits"));
        assertTrue(consoleOutput.contains("Approach negotiations with a positive and respectful attitude"));
        assertTrue(consoleOutput.contains("Have a clear understanding of your desired salary range"));
    }

    // Add more test methods as needed
}
