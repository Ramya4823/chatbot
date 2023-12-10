package story22;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.jupiter.api.Assertions.assertTrue;

class RecruiterAssistantChatbotTest {

    @Test
    void testSendPeriodicCheckIn() {
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create an instance of CheckInCoordinator
        RecruiterAssistantChatbot.CheckInCoordinator checkInCoordinator = new RecruiterAssistantChatbot.CheckInCoordinator();

        // Call the sendPeriodicCheckIn method
        checkInCoordinator.sendPeriodicCheckIn("NewHire1", 1);

        // Get the captured console output
        String consoleOutput = outContent.toString().trim();

        // Assert that the expected messages are present in the console output
        assertTrue(consoleOutput.contains("Check-in 1 sent to NewHire1."));

        // Reset System.out to the original PrintStream
        System.setOut(System.out);
    }

    // Add more test methods as needed
}
