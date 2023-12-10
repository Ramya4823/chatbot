package chatbot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class RecruiterAssistantChatbotTest {

    private final InputStream originalSystemIn = System.in;
    private final PrintStream originalSystemOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown() {
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);
    }

    @Test
    public void testUserChoosesToFindJobVacancies() {
        // Simulate user input
        provideInput("1\n\n0\n");

        // Call the main method with a Scanner
        try (InputStream inputStream = new ByteArrayInputStream("userSkills".getBytes())) {
            System.setIn(inputStream);
            RecruiterAssistantChatbot.main(new String[]{});
        } catch (Exception e) {
            // Handle exceptions, if any
            e.printStackTrace();
        }

        // Validate the output
        String expectedOutput = "Select an option:\n" +
                                "1. Assist job seeker in finding job vacancies\n" +
                                "0. Exit\n" +
                                "Enter your skills:\n" +
                                "Fetching job vacancies for skills: userSkills\n" +
                                "Select an option:\n" +
                                "1. Assist job seeker in finding job vacancies\n" +
                                "0. Exit\n" +
                                "Exiting Recruiter Assistant Chatbot. Goodbye!";

        // Normalize both actual and expected output for comparison
        String normalizedExpected = expectedOutput.replaceAll("\\s", "");
        String normalizedActual = outputStreamCaptor.toString().replaceAll("\\s", "");

        // Print both expected and actual output for debugging
        System.out.println("Expected Output: " + normalizedExpected);
        System.out.println("Actual Output:   " + normalizedActual);

        // Identify the point of difference
        identifyDifference(normalizedExpected, normalizedActual);

        assertEquals(normalizedExpected, normalizedActual);
    }

    private void provideInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    private void identifyDifference(String expected, String actual) {
        int minLength = Math.min(expected.length(), actual.length());
        int diffIndex = -1;

        for (int i = 0; i < minLength; i++) {
            if (expected.charAt(i) != actual.charAt(i)) {
                diffIndex = i;
                break;
            }
        }

        if (diffIndex != -1) {
            System.out.println("Difference at index: " + diffIndex);
            System.out.println("Expected: " + expected.substring(diffIndex));
            System.out.println("Actual:   " + actual.substring(diffIndex));
        } else {
            System.out.println("No differences found.");
        }
    }
}


