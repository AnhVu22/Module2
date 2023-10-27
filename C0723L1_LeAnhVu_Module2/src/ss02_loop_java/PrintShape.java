package ss02_loop_java;

import java.util.Scanner;

public class PrintShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int height = 0;
        int width = 0;
        do {
            System.out.println("Menu: \n" +
                    "1. Print the rectangle\n" +
                    "2. Print the square triangle\n" +
                    "3. Print isosceles triangle\n" +
                    "Another: Exit");
            System.out.println("Choose your options: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Input Height: ");
                    height = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input Width: ");
                    width = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Input Height: ");
                    height = Integer.parseInt(scanner.nextLine());
                    System.out.println("Choose corner: ");
                    System.out.println("1. Top - Left: ");
                    System.out.println("2. Top - Right: ");
                    System.out.println("3. Bottom - Left: ");
                    System.out.println("4. Bottom - Right: ");
                    int corner = Integer.parseInt(scanner.nextLine());
                    switch (corner) {
                        case 1:
                            for (int i = height; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int i = height; i >= 1; i--) {
                                for (int j = 1; j <= height - i; j++) {
                                    System.out.print(" ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int i = 1; i <= height; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int i = 1; i <= height; i++) {
                                for (int j = 1; j <= height - i; j++) {
                                    System.out.print(" ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Input Height: ");
                    height = Integer.parseInt(scanner.nextLine());
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i; j++) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}