import java.util.Scanner;

/**
 * ============================================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ============================================================================
 * * Use Case 10: Normalized Palindrome Validation
 * * Description:
 * This class validates a palindrome after preprocessing the input string.
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 */
public class PalindroneCheckerApp {
    /**
     * Application entry point for UC10.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Step 1: Normalization
        // Use replaceAll with regex [^a-zA-Z0-9] to keep only alphanumeric characters
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Validate using the symmetric loop hint
        boolean isPalindrome = true;
        int len = normalized.length();

        // Compare characters from both ends up to the middle point
        for (int i = 0; i < len / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
