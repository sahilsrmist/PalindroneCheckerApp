import java.util.Scanner;

/**
 * ============================================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ============================================================================
 * * Use Case 11: Object-Oriented Palindrome Service
 * * Description:
 * This class demonstrates palindrome validation using object-oriented design.
 * The logic is encapsulated inside a separate service class.
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate the Service Object
        PalindromeService service = new PalindromeService();

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Call the encapsulated method
        boolean isPalindrome = service.checkPalindrome(input);

        // Display results
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}

/**
 * Service class that contains palindrome logic.
 * Demonstrates Encapsulation and Separation of Concerns.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * @param input The string to validate
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        // Handle null or empty cases
        if (input == null || input.isEmpty()) {
            return true;
        }

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Mismatch found
            }
            start++;
            end--;
        }

        return true; // All characters matched
    }
}
