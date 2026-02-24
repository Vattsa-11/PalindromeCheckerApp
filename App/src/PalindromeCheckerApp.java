import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take custom input from user
        System.out.print("Enter text: ");
        String input = scanner.nextLine();





        // Create a Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {   // Optional: ignore spaces/special characters
                c = Character.toLowerCase(c);     // Optional: case-insensitive check
                queue.offer(c);   // Enqueue
                stack.push(c);    // Push
            }
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare dequeue and pop results
        while (!queue.isEmpty()) {
            char fromQueue = queue.poll();   // FIFO
            char fromStack = stack.pop();    // LIFO

            if (fromQueue != fromStack) {
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