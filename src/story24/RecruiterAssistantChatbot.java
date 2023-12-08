package story24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecruiterAssistantChatbot {

    // Assume a RecruitmentDataAnalyzer class for analyzing recruitment data
    static class RecruitmentDataAnalyzer {
        private Map<String, Integer> sourcingChannelData = new HashMap<>();

        public RecruitmentDataAnalyzer() {
            // Simulate recruitment data (replace with actual data)
            sourcingChannelData.put("Job Boards", 150);
            sourcingChannelData.put("Employee Referrals", 80);
            sourcingChannelData.put("Social Media", 120);
            // Add more sourcing channels and corresponding data
        }

        public void analyzeSourcingChannels() {
            // Simulate analyzing and providing insights into sourcing channels
            System.out.println("Recruitment Data Analysis - Effectiveness of Sourcing Channels:");
            for (Map.Entry<String, Integer> entry : sourcingChannelData.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " candidates sourced");
            }

            // Identify the most effective sourcing channel
            String mostEffectiveChannel = findMostEffectiveChannel();
            System.out.println("The most effective sourcing channel is: " + mostEffectiveChannel);
        }

        private String findMostEffectiveChannel() {
            // Simulate finding the most effective sourcing channel
            int maxCandidates = 0;
            String mostEffectiveChannel = "";

            for (Map.Entry<String, Integer> entry : sourcingChannelData.entrySet()) {
                if (entry.getValue() > maxCandidates) {
                    maxCandidates = entry.getValue();
                    mostEffectiveChannel = entry.getKey();
                }
            }

            return mostEffectiveChannel;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Recruiter Assistant Chatbot!");

        // Assume a RecruitmentDataAnalyzer instance for analyzing recruitment data
        RecruitmentDataAnalyzer dataAnalyzer = new RecruitmentDataAnalyzer();

        do {
            System.out.println("As a recruiter, how can I assist you with recruitment data analysis?");
            System.out.println("1. Provide insights into the effectiveness of different sourcing channels.");
            System.out.println("2. Exit");

            int userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 1:
                    // Analyze and provide insights into sourcing channels
                    dataAnalyzer.analyzeSourcingChannels();
                    break;
                case 2:
                    System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

            System.out.println("Do you want assistance with anything else? (yes/no)");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Exiting Recruiter Assistant Chatbot. Goodbye!");
        scanner.close();
    }
}
