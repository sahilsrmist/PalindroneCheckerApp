import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * ============================================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ============================================================================
 * * Use Case 7: Deque Based Optimized Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Deque (Double Ended Queue).
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Create a Deque to store characters
        // ArrayDeque is usually faster than LinkedList for stack/queue operations
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        // If 0 or 1 element remains, it's naturally a palindrome
        while (deque.size() > 1) {
            // Remove from both ends and compare
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
