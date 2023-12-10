package story2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
//import java.util.List;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

public class RecruiterAssistantChatbotTest {

    private static final String LINE_SEPARATOR = System.lineSeparator();

    @Test
    public void testMainMethodWithNoQualifiedApplicants() {
        // Arrange
        String input = "JavaScript\nno\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Act
        RecruiterAssistantChatbot.main(new String[]{});

        // Assert
        String expectedOutput = "Welcome to the Recruiter Assistant Chatbot!" + LINE_SEPARATOR +
                                "Enter the required skills to find qualified applicants:" + LINE_SEPARATOR +
                                "No qualified applicants found for the given skills." + LINE_SEPARATOR +
                                "Do you want to search again? (yes/no)" + LINE_SEPARATOR +
                                "Exiting Recruiter Assistant Chatbot. Goodbye!" + LINE_SEPARATOR;
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testMainMethodWithQualifiedApplicants() {
        // Arrange
        String input = "Java\nno\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Act
        RecruiterAssistantChatbot.main(new String[]{});

        // Assert
        String expectedOutput = "Welcome to the Recruiter Assistant Chatbot!" + LINE_SEPARATOR +
                                "Enter the required skills to find qualified applicants:" + LINE_SEPARATOR +
                                "Found qualified applicants:" + LINE_SEPARATOR +
                                "JobApplication{applicantName='John Doe', desiredPosition='Software Engineer', skills='Java, Python', experience='3 years experience'}" + LINE_SEPARATOR +
                                "Do you want to search again? (yes/no)" + LINE_SEPARATOR +
                                "Exiting Recruiter Assistant Chatbot. Goodbye!" + LINE_SEPARATOR;
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    // Add more test cases for other methods as needed...
}


