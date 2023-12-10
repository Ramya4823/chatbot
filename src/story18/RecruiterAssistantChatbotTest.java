package story18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.After;
import org.junit.Before;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

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
    public void testConductBackgroundCheck() {
        // Arrange
        String userInput = "Candidate1\nno\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        // Act
        RecruiterAssistantChatbot.main(new String[]{});

        // Assert
        String consoleOutput = outputStreamCaptor.toString();

        // Print debug information
        System.out.println("Console Output:\n" + consoleOutput);

       
    }
}
