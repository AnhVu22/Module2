package ss01_introduction_java;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a = sc.nextLine();
        System.out.println(a);
    }
}
