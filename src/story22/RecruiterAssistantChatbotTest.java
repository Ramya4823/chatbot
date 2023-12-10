package story22;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.jupiter.api.Assertions.assertEquals;

class RecruiterAssistantChatbotTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testSendPeriodicCheckIn() {
        RecruiterAssistantChatbot.CheckInCoordinator checkInCoordinator =
                new RecruiterAssistantChatbot.CheckInCoordinator();

        // Set up a new hire name and check-in number
        String newHireName = "John Doe";
        int checkInNumber = 1;

        // Send a periodic check-in
        checkInCoordinator.sendPeriodicCheckIn(newHireName, checkInNumber);

        // Get the check-in history for confirmation
        String checkInHistory = checkInCoordinator.getCheckInHistory(newHireName);

        // Assert that the check-in history is as expected
        assertEquals("Check-in 1: Hello, John Doe! How are you settling into your new role?\n", checkInHistory);
    }

    // Add more test methods as needed to achieve 100% coverage

    @Test
    void testMainMethod() {
        // Provide an input to simulate user interaction
        String simulatedInput = "John Doe\n1\nno";
        System.setIn(new java.io.ByteArrayInputStream(simulatedInput.getBytes()));

        // Execute the main method
        RecruiterAssistantChatbot.main(new String[]{});

        // Verify the output or add assertions as needed
        String consoleOutput = outContent.toString();
        // Add assertions based on the expected output

        // Reset System.in and System.out to the original InputStream and PrintStream
        System.setIn(System.in);
        System.setOut(originalOut);
    }
}
