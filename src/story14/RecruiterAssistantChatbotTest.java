package story14;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
//import java.util.regex.Pattern;

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
    public void testScheduleInterview() {
        // Arrange
        String userInput = "John Doe\n2023-01-01 14:00\nno\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        // Act
        RecruiterAssistantChatbot.main(new String[]{});

        // Assert
        String consoleOutput = outputStreamCaptor.toString().toLowerCase();

        assertTrue(consoleOutput.contains("scheduling interview for john doe with interviewers: [interviewer1, interviewer2, interviewer3]"));
        assertTrue(consoleOutput.contains("interview scheduled for john doe on"));

        // Check for a flexible pattern in the date and time
       // assertTrue(Pattern.compile("interview scheduled for john doe on \\S+ \\d+, \\d{4} \\d+:\\d+", Pattern.CASE_INSENSITIVE).matcher(consoleOutput).find());
       // assertTrue(consoleOutput.contains("interviewers are not available at the suggested date and time. please try another time."));
    }
}
