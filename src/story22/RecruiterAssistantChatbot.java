package story22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a CheckInCoordinator class for sending periodic check-ins
    static class CheckInCoordinator {
        private Map<String, String> checkInHistory = new HashMap<>();

        public void sendPeriodicCheckIn(String newHireName, int checkInNumber) {
            // Simulate sending a periodic check-in
            String checkInMessage = generateCheckInMessage(newHireName, checkInNumber);

            // Store the check-in history
            checkInHistory.put(newHireName, checkInHistory.getOrDefault(newHireName, "") + checkInMessage);

            // Provide a confirmation message
            System.out.println("Check-in " + checkInNumber + " sent to " + newHireName + ".");
        }

        private String generateCheckInMessage(String newHireName, int checkInNumber) {
            // Simulate generating a check-in message
            return "Check-in " + checkInNumber + ": Hello, " + newHireName + "! How are you settling into your new role?\n";
        }

        public String getCheckInHistory(String newHireName) {
            // Get the check-in history for a new hire
            return checkInHistory.getOrDefault(newHireName, "No check-in history available");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        // Assume a list of new hires
        String[] newHires = {"NewHire1", "NewHire2", "NewHire3"};

        // Assume a CheckInCoordinator instance for sending periodic check-ins
        CheckInCoordinator checkInCoordinator = new CheckInCoordinator();

        do {
            System.out.println("Enter the name of the new hire:");
            String newHireName = scanner.nextLine();

            System.out.println("Enter the number of the periodic check-in:");
            int checkInNumber = Integer.parseInt(scanner.nextLine());

            // Send a periodic check-in to the new hire
            checkInCoordinator.sendPeriodicCheckIn(newHireName, checkInNumber);

            // Get the check-in history for confirmation
            String checkInHistory = checkInCoordinator.getCheckInHistory(newHireName);
            System.out.println("Check-In History for " + newHireName + ":\n" + checkInHistory);

            System.out.println("Do you want to send another check-in? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
