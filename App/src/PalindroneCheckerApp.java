import java.util.Scanner;
import java.util.Stack;

/**
 * ============================================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ============================================================================
 * * Use Case 5: Stack Based Palindrome Checker (Interactive Version)
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Create a Stack to store characters (LIFO)
        Stack<Character> stack = new Stack<>();

        // Push Phase: Load the stack with the input string
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Pop Phase: Compare original characters with stack contents
        for (int i = 0; i < input.length(); i++) {
            // Compare the character at index i with the character popped from top
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        if (isPalindrome) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        // Close scanner to prevent memory leaks
        scanner.close();
    }
}
