package story30;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


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
    void testGatherAndAnalyzeFeedback() {
        RecruiterAssistantChatbot.FeedbackGatherer feedbackGatherer =
                new RecruiterAssistantChatbot.FeedbackGatherer();

        // Provide an input to simulate user interaction
        String simulatedInput = "1\njohn.doe@example.com\nPositive experience with the interview process\nno";
        System.setIn(new java.io.ByteArrayInputStream(simulatedInput.getBytes()));

        // Execute the main method
        RecruiterAssistantChatbot.main(new String[]{});

        // Verify the output or add assertions as needed
        String consoleOutput = outContent.toString().trim();
        assertTrue(consoleOutput.contains("Feedback received from john.doe@example.com: Positive experience with the interview process"));
        assertTrue(consoleOutput.contains("Analyzing Candidate Feedback:"));
        assertTrue(consoleOutput.contains("Candidate john.doe@example.com provided feedback: Positive experience with the interview process"));
        assertTrue(consoleOutput.contains("Areas for Improvement Identified:"));
        assertTrue(consoleOutput.contains("1. Improve communication during the interview process."));

        // Reset System.in and System.out to the original InputStream and PrintStream
        System.setIn(System.in);
        System.setOut(originalOut);
    }
}
