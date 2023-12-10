package story19;

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
    void testProvideCompensationInformation() {
        RecruiterAssistantChatbot.CompensationAdvisor compensationAdvisor =
                new RecruiterAssistantChatbot.CompensationAdvisor();

        // Provide an input to simulate user interaction
        String simulatedInput = "1\nno";
        System.setIn(new java.io.ByteArrayInputStream(simulatedInput.getBytes()));

        // Execute the main method
        RecruiterAssistantChatbot.main(new String[]{});

        // Verify the output or add assertions as needed
        String consoleOutput = outContent.toString().trim();
        assertTrue(consoleOutput.contains("Here are some resources and tips for negotiating job offers and understanding compensation packages:"));
        assertTrue(consoleOutput.contains("1. Research: Research industry-standard salaries for your role and experience."));
        assertTrue(consoleOutput.contains("2. Know Your Worth: Understand your skills, qualifications, and the value you bring to the company."));
        assertTrue(consoleOutput.contains("3. Benefits: Consider not only the base salary but also other benefits such as health insurance, retirement plans, and bonuses."));
        assertTrue(consoleOutput.contains("4. Negotiate respectfully: Approach negotiations with a positive and respectful attitude."));
        assertTrue(consoleOutput.contains("5. Be Prepared: Have a clear understanding of your desired salary range and be prepared to justify it."));

        // Reset System.in and System.out to the original InputStream and PrintStream
        System.setIn(System.in);
        System.setOut(originalOut);
    }
}
