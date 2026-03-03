import java.util.Scanner;

public class PalindromeCheckerApp {

    // 1️⃣ Reverse String Method
    public static boolean isPalindromeReverse(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    // 2️⃣ Two Pointer Method
    public static boolean isPalindromeTwoPointer(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(input.charAt(left)) !=
                    Character.toLowerCase(input.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // 3️⃣ Recursive Method
    public static boolean isPalindromeRecursive(String input) {
        input = input.toLowerCase();
        return checkRecursive(input, 0, input.length() - 1);
    }

    private static boolean checkRecursive(String input, int left, int right) {
        if (left >= right) return true;
        if (input.charAt(left) != input.charAt(right)) return false;
        return checkRecursive(input, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Optional: run multiple times for better benchmarking
        int iterations = 1;

        long start, end;

        // Reverse Method Benchmark
        start = System.nanoTime();
        boolean result1 = false;
        for (int i = 0; i < iterations; i++) {
            result1 = isPalindromeReverse(input);
        }
        end = System.nanoTime();
        long duration1 = end - start;

        // Two Pointer Benchmark
        start = System.nanoTime();
        boolean result2 = false;
        for (int i = 0; i < iterations; i++) {
            result2 = isPalindromeTwoPointer(input);
        }
        end = System.nanoTime();
        long duration2 = end - start;

        // Recursive Benchmark
        start = System.nanoTime();
        boolean result3 = false;
        for (int i = 0; i < iterations; i++) {
            result3 = isPalindromeRecursive(input);
        }
        end = System.nanoTime();
        long duration3 = end - start;

        System.out.println("\nResults after " + iterations + " iterations:");
        System.out.println("Reverse Method     : " + result1 + " | Time: " + duration1 + " ns");
        System.out.println("Two Pointer Method : " + result2 + " | Time: " + duration2 + " ns");
        System.out.println("Recursive Method   : " + result3 + " | Time: " + duration3 + " ns");

        scanner.close();
    }
}