import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String word = input.next();

        // Convert the string into a character array.
        char[] chars = word.toCharArray();

        // Initialize pointer at the beginning.
        int start = 0;

        // Initialize pointer at the end.
        int end = chars.length - 1;

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Continue comparison until pointers cross.
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
