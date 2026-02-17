import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String args[]){
        System.out.println("Check Palindrome");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word");
        String og = input.next().toLowerCase();
        String rev = new StringBuilder(og).reverse().toString();

        if (og.equals(rev)){
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is not a palindrome");
        }
    }
}
