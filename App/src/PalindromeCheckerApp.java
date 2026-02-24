import java.util.LinkedList;
import java.util.Scanner;


public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Define the input string
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {   // Optional filtering
                c = Character.toLowerCase(c);     // Case insensitive
                list.add(c);
            }
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            char first = list.removeFirst();   // Remove from front
            char last = list.removeLast();     // Remove from rear

            if (first != last) {
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