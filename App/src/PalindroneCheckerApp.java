/**
 * ============================================================================
 * MAIN CLASS - UseCase13PerformanceComparisonApp
 * ============================================================================
 * * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution time of various
 * palindrome validation approaches using System.nanoTime().
 */
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        String input = "radar"; // You can use a very long string for more visible differences

        System.out.println("Performance Comparison for: " + input);
        System.out.println("-------------------------------------------");

        // Test Strategy 1: Stack Based (UC5/UC12)
        compareStrategy("Stack-Based Approach", new StackStrategy(), input);

        // Test Strategy 2: Two-Pointer Approach (UC4/UC11 logic)
        compareStrategy("Two-Pointer Approach", new TwoPointerStrategy(), input);
    }

    private static void compareStrategy(String name, PalindromeStrategy strategy, String input) {
        // Capture start time in nanoseconds
        long startTime = System.nanoTime();

        // Execute the algorithm
        strategy.check(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate duration
        long duration = endTime - startTime;

        System.out.printf("%-25s : %d ns\n", name, duration);
    }
}

/** * Optimized Two-Pointer Strategy for comparison
 */
class TwoPointerStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        int start = 0, end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start++) != input.charAt(end--)) return false;
        }
        return true;
    }
}
