import java.util.LinkedList;
import java.util.Scanner;

/**
 * ============================================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ============================================================================
 * * Use Case 8: Linked List Based Palindrome Checker
 * * Description:
 * This class checks whether a string is a palindrome using a LinkedList.
 * Characters are added to the list and then compared by removing elements
 * from both ends (removeFirst and removeLast).
 */
public class PalindroneCheckerApp {
    /**
     * Application entry point for UC8.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        // This symmetric validation removes from both ends
        while (list.size() > 1) {
            // removeFirst() and removeLast() are efficient in a doubly linked list
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Display the validation result
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
