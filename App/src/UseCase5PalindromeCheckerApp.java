import java.util.Stack;
import java.util.Scanner;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {

        // Declare and initialize the input string.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String word = input.next();

        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack.
        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Iterate again through original string.
        for (char c : word.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
