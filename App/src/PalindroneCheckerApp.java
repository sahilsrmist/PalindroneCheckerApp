import java.util.Scanner;

/**
 * ============================================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ============================================================================
 * * Use Case 9: Recursive Palindrome Checker
 * * Description:
 * This class validates a palindrome using recursion.
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 */
public class PalindroneCheckerApp {
    /**
     * Application entry point for UC9.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Start recursion from index 0 to length - 1
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Display result
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }

    /**
     * Recursively checks whether a string is a palindrome.
     * * @param s      Input string
     * @param start  Starting index
     * @param end    Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition 1: If pointers cross or meet, all characters matched
        if (start >= end) {
            return true;
        }

        // Base Condition 2: If a mismatch is found, it's not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Step: Move inward and check the remaining substring
        return check(s, start + 1, end - 1);
    }
}
