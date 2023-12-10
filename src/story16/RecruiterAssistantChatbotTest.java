package story16;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


import org.junit.After;
import org.junit.Before;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
//import java.util.Map;

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
    public void testCollectFeedback() {
        // Arrange
        String userInput = "Sample Candidate\nFeedback1\nFeedback2\nFeedback3\nno\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        // Act
        RecruiterAssistantChatbot.main(new String[]{});

        // Assert
        String consoleOutput = outputStreamCaptor.toString();

        // Print debug information
        System.out.println("Console Output:\n" + consoleOutput);

      //  assertTrue(consoleOutput.contains("Feedback from Interviewer1 for Sample Candidate collected successfully."));
       // assertTrue(consoleOutput.contains("Feedback from Interviewer2 for Sample Candidate collected successfully."));
        //assertTrue(consoleOutput.contains("Feedback from Interviewer3 for Sample Candidate collected successfully."));
        //assertTrue(consoleOutput.contains("Compiled Feedback for Sample Candidate: {Interviewer1=Feedback1, Interviewer2=Feedback2, Interviewer3=Feedback3}"));
    }
}
