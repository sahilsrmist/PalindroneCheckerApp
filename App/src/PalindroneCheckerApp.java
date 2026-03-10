import java.util.Scanner;

/**
 * ============================================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ============================================================================
 * * Use Case 3: Reverse String Based Palindrome Check
 * * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 */
public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Step 1: Initialize an empty string to store the reversed version
        String reversed = "";

        // Step 2: Iterate from the last character to the first (as per hint)
        //         for (int i = input.length() - 1; i >= 0; i--) {
        // Step 3: Concatenate each character to the 'reversed' string
        reversed += input.charAt(i);
    }

    // Step 4: Compare original and reversed strings using .equals()
    // Note: We use .toLowerCase() to ensure the check is case-insensitive
        if (input.equalsIgnoreCase(reversed)) {
        System.out.println("Result: '" + input + "' is a palindrome.");
    } else {
        System.out.println("Result: '" + input + "' is NOT a palindrome.");
    }

        scanner.close();
}
}