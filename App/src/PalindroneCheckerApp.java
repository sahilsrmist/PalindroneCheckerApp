import java.util.Scanner;
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.println("Modify this logic to usecase 2");
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Welcome to Palindrome Checker App ---");
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("✨ Result: '" + input + "' is a palindrome!");
        } else {
            System.out.println("❌ Result: '" + input + "' is NOT a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Step 1: Normalize the string (lowercase and remove non-alphanumeric characters)
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Reverse the cleaned string
        String reversed = new StringBuilder(clean).reverse().toString();

        // Step 3: Compare and return
        return clean.equals(reversed);
    }
}
