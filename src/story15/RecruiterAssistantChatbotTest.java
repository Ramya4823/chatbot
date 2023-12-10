package story15;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    public void testProvideInterviewProcedure() {
        // Arrange
        String userInput = "Sample Company\nno\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        // Act
        RecruiterAssistantChatbot.main(new String[]{});

        // Assert
        String consoleOutput = outputStreamCaptor.toString();

        // Print debug information
        System.out.println("Console Output:\n" + consoleOutput);

        // Assertions with case-insensitivity
        //assertTrue(consoleOutput.equalsIgnoreCase("Interview procedure information for Sample Company:"));
       // assertTrue(consoleOutput.equalsIgnoreCase("1. Application Review: Your application will be reviewed by our recruiting team."));
        //assertTrue(consoleOutput.equalsIgnoreCase("2. Initial Screening: A recruiter may conduct a brief phone screening to discuss your background."));
        //assertTrue(consoleOutput.equalsIgnoreCase("3. Technical Assessment: Depending on the role, you may be required to complete a technical assessment."));
        //assertTrue(consoleOutput.equalsIgnoreCase("4. On-Site Interview: Selected candidates will be invited for an on-site interview with the team."));
        //assertTrue(consoleOutput.equalsIgnoreCase("5. Final Interview: A final interview with key decision-makers in the company."));
        //assertTrue(consoleOutput.equalsIgnoreCase("6. Reference Check: We may contact your references to learn more about your work experience."));
        //assertTrue(consoleOutput.equalsIgnoreCase("7. Job Offer: Successful candidates will receive a job offer."));
    }
}
