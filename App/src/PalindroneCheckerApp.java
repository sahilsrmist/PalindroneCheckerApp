import java.util.Scanner;
import java.util.Stack;

/**
 * ============================================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ============================================================================
 * * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * * Description:
 * This class demonstrates how different palindrome validation algorithms
 * can be selected dynamically at runtime using the Strategy Design Pattern.
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // 1. Define a strategy (We are using the Stack-based implementation here)
        // This is where Polymorphism happens: Reference is Interface, Object is Concrete Class.
        PalindromeStrategy strategy = new StackStrategy();

        // 2. Execute the selected algorithm
        boolean isPalindrome = strategy.check(input);

        // Display results
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}

/**
 * INTERFACE - PalindromeStrategy
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    /**
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * Implements the PalindromeStrategy using a Stack (LIFO).
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();

        // Push Phase
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare Phase
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
