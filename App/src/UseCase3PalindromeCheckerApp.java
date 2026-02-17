import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String word = input.next();   // Change this to test other strings
        String reversed = "";

        // Iterate from the last character to the first.
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed string using equals()
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
