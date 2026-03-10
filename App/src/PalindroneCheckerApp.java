import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * ============================================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ============================================================================
 * * Use Case 6: Queue + Stack Fairness Check
 * * Description:
 * This class demonstrates palindrome validation using two different
 * data structures: Queue (FIFO) and Stack (LIFO).
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Create a Queue (FIFO) - LinkedList implements the Queue interface in Java
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue
            stack.push(c); // Push
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // dequeue (poll) gets the FIRST character added
            // pop gets the LAST character added
            if (!queue.poll().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result in the requested format
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
