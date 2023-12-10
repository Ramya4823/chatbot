package story10;

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

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;
    private final InputStream originalSystemIn = System.in;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown() {
        System.setOut(originalSystemOut);
        System.setIn(originalSystemIn);
    }

    @Test
    public void testMainMethodWithUserInput() {
        // Arrange
        String input = "Software Developer\nJava, Python, SQL\nABC Corp\nLinkedIn\nno\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Act
        RecruiterAssistantChatbot.main(new String[]{});

        // Assert
        String expectedOutput = "Welcome to the Recruiter Assistant Chatbot!" + System.lineSeparator() +
                "Enter the job title:" + System.lineSeparator() +
                "Enter the required skills (comma-separated):" + System.lineSeparator() +
                "Enter the company name:" + System.lineSeparator() +
                "Job Description:" + System.lineSeparator() +
                "Job Title: Software Developer" + System.lineSeparator() +
                "Skills Required: Java, Python, SQL" + System.lineSeparator() +
                "Company: ABC Corp" + System.lineSeparator() +
                "" + System.lineSeparator() +
                "Responsibilities:" + System.lineSeparator() +
                "- List of responsibilities goes here" + System.lineSeparator() +
                "" + System.lineSeparator() +
                "Qualifications:" + System.lineSeparator() +
                "- List of qualifications goes here" + System.lineSeparator() +
                "" + System.lineSeparator() +
                "How to Apply:" + System.lineSeparator() +
                "Please submit your resume and cover letter through our website." + System.lineSeparator() +
                "Enter the platform to post the job description:" + System.lineSeparator() +
                "Posting job description on LinkedIn:" + System.lineSeparator() +
                "Do you want to create and post another job description? (yes/no)" + System.lineSeparator() +
                "Exiting Recruiter Assistant Chatbot. Goodbye!" + System.lineSeparator();
       // assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    // Add more test cases as needed...
}
