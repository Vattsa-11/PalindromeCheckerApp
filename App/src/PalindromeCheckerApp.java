import java.util.Scanner;


public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Optional: normalize input (remove non-alphanumeric & make lowercase)
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = check(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }

    private static boolean check(String s, int start, int end) {

        // Base Condition: If start crosses or meets end
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Call: Move towards the center
        return check(s, start + 1, end - 1);
    }
}