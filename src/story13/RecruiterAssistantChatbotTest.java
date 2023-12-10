package story13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.regex.Pattern;

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
    public void testEvaluateResume() {
        // Arrange
        String userInput = "John Doe\nContact Information: ...\nRelevant Skills: ...\nno\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        // Act
        RecruiterAssistantChatbot.main(new String[]{});

        // Assert
        String consoleOutput = outputStreamCaptor.toString().toLowerCase();

        assertTrue(consoleOutput.contains("evaluating resume for john doe"));
        assertTrue(consoleOutput.contains("recommendation: ensure your resume includes up-to-date contact information."));
        assertTrue(consoleOutput.contains("recommendation: highlight relevant skills to match the job requirements."));
        assertTrue(consoleOutput.contains("resume evaluation completed."));

        // You can also use regular expressions for more flexible matching
        assertTrue(Pattern.compile("evaluating resume for john doe", Pattern.CASE_INSENSITIVE).matcher(consoleOutput).find());
        assertTrue(Pattern.compile("recommendation: ensure your resume includes.*contact information", Pattern.CASE_INSENSITIVE | Pattern.DOTALL).matcher(consoleOutput).find());
        assertTrue(Pattern.compile("recommendation: highlight relevant skills.*job requirements", Pattern.CASE_INSENSITIVE | Pattern.DOTALL).matcher(consoleOutput).find());
        assertTrue(Pattern.compile("resume evaluation completed", Pattern.CASE_INSENSITIVE).matcher(consoleOutput).find());
    }
}
