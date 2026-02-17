import java.util.Scanner;

public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input text:");
        String word = input.next();

        boolean isPalindrome = true;

        // Loop only till half of the string length.
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
