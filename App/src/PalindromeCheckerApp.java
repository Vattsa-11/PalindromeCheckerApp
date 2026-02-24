import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Define the input string (custom input)
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {   // Optional: ignore spaces/special characters
                c = Character.toLowerCase(c);     // Optional: case-insensitive comparison
                deque.addLast(c);                 // Insert at rear
            }
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            char front = deque.removeFirst();   // Remove from front
            char rear = deque.removeLast();     // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}