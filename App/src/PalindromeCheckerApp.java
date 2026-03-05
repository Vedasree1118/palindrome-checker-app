import java.util.Scanner;

/**
 * =============================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =============================================================================
 * * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 * * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 * * This use case focuses purely on performance
 * measurement and algorithm comparison.
 * * The goal is to introduce benchmarking concepts.
 * * @author Developer
 * @version 13.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for input
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Start performance measurement
        long startTime = System.nanoTime();

        // Palindrome logic
        boolean isPalindrome = checkPalindrome(input);

        // End performance measurement
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // Display results matching the provided snapshot
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");

        scanner.close();
    }

    /**
     * Simple palindrome check logic.
     * * @param text The string to validate
     * @return true if palindrome, false otherwise
     */
    private static boolean checkPalindrome(String text) {
        if (text == null) return false;

        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();

        for (int i = 0; i < length / 2; i++) {
            if (clean.charAt(i) != clean.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}