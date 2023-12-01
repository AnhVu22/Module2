package ss11_stack_queue.CheckPalindrome;

import ss11_stack_queue.CheckPalindrome.CheckPalindrome;

import java.util.Scanner;

public class MainCheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String: ");
        String string = scanner.nextLine();
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        if (checkPalindrome.isPalindrome(string)) {
            System.out.println("Is a Palindrome");
        } else System.out.println("Is Not a Palindrome");
    }
}
