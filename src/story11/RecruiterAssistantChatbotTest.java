package story11;

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
    public void testProvideProfileAdvice() {
        // Arrange
        RecruiterAssistantChatbot.LinkedInProfileAdvisor advisor = new RecruiterAssistantChatbot.LinkedInProfileAdvisor();
        advisor.provideProfileAdvice("TestUser");

        // Assert
        String expectedOutput = "Advice for improving your LinkedIn profile, TestUser:" +
                System.lineSeparator() +
                "1. Profile Picture: Use a professional and clear profile picture." +
                System.lineSeparator() +
                "2. Headline: Craft a compelling headline that showcases your skills and interests." +
                System.lineSeparator() +
                "3. Summary: Write a concise and engaging summary highlighting your career goals and achievements." +
                System.lineSeparator() +
                "4. Experience: Provide detailed descriptions of your work experience, emphasizing accomplishments." +
                System.lineSeparator() +
                "5. Skills: List relevant skills to attract recruiters and employers." +
                System.lineSeparator() +
                "6. Recommendations: Request and provide recommendations from colleagues and supervisors." +
                System.lineSeparator() +
                "7. Connections: Connect with professionals in your industry to expand your network." +
                System.lineSeparator() +
                System.lineSeparator() +
                "Remember to regularly update your profile and engage with your network!" +
                System.lineSeparator();

        // Remove leading/trailing whitespaces and normalize line endings for comparison
        String normalizedExpected = expectedOutput.trim().replace("\r\n", "\n");
        String normalizedActual = outputStreamCaptor.toString().trim().replace("\r\n", "\n");

        assertEquals(normalizedExpected, normalizedActual);
    }

    @Test
    public void testMainWithUserInputYes() {
        // Arrange
        System.setIn(new ByteArrayInputStream("TestUser\nyes\nno\n".getBytes()));

        // Act
       

        // Remove leading/trailing whitespaces and normalize line endings for comparison
        //String normalizedExpected = expectedOutput.trim().replace("\r\n", "\n");
        String normalizedActual = outputStreamCaptor.toString().trim().replace("\r\n", "\n");

      //  assertEquals(normalizedExpected, normalizedActual);
    }
}

