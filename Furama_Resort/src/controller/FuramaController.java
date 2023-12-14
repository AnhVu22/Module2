package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu() {
        int menuChoice;
        do {
            System.out.println("FURAMA RESORT MANAGEMENT SYSTEM" + "\n" +
                    "1. Employee Management" + "\n" +
                    "2. Customer Management" + "\n" +
                    "3. Facility Management" + "\n" +
                    "4. Booking Management" + "\n" +
                    "5. Promotion Management" + "\n" +
                    "6. Exit");
            System.out.println("Enter your choice");
            try {
                menuChoice = Integer.parseInt(scanner.nextLine());
                switch (menuChoice) {
                    case 1:
                        showEmployeeManagement();
                        break;
                    case 2:
                        showCustomerManagement();
                        break;
                    case 3:
                        showFacilityManagement();
                        break;
                    case 4:
                        showBookingManagement();
                        break;
                    case 5:
                        showPromotionManagement();
                        break;
                    case 6:
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                menuChoice = 0;
            }
        } while (menuChoice != 6);
    }

    private static void showEmployeeManagement() {
        int choice;
        do {
            System.out.println("EMPLOYEE MANAGEMENT" + "\n" +
                    "1. Display List Employees" + "\n" +
                    "2. Add New Employee" + "\n" +
                    "3. Edit Employee" + "\n" +
                    "4. Return Main Menu");
            System.out.print("Please enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        // Implement display list employees
                        break;
                    case 2:
                        // Implement add new employee
                        break;
                    case 3:
                        // Implement edit employee
                        break;
                    case 4:
                        System.out.println("Returning to main menu.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the input buffer
                choice = 0; // Reset choice to trigger the loop again
            }
        } while (choice != 4);
    }

    private static void showCustomerManagement() {
        int choice;
        do {
            System.out.println("CUSTOMER MANAGEMENT" + "\n" +
                    "1. Display List Customers" + "\n" +
                    "2. Add New Customer" + "\n" +
                    "3. Edit Customer" + "\n" +
                    "4. Return Main Menu");
            System.out.print("Please enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        // Implement display list employees
                        break;
                    case 2:
                        // Implement add new employee
                        break;
                    case 3:
                        // Implement edit employee
                        break;
                    case 4:
                        System.out.println("Returning to main menu.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the input buffer
                choice = 0; // Reset choice to trigger the loop again
            }
        } while (choice != 4);
    }

    private static void showFacilityManagement() {
        int choice;
        do {
            System.out.println("FACILITY MANAGEMENT" + "\n" +
                    "1. Display List Facility" + "\n" +
                    "2. Add New Facility" + "\n" +
                    "3. Display List Facility Maintenance" + "\n" +
                    "4. Return Main Menu");
            System.out.print("Please enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        // Implement display list employees
                        break;
                    case 2:
                        // Implement add new employee
                        break;
                    case 3:
                        // Implement edit employee
                        break;
                    case 4:
                        System.out.println("Returning to main menu.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the input buffer
                choice = 0; // Reset choice to trigger the loop again
            }
        } while (choice != 4);
    }
    private static void showBookingManagement() {
        int choice;
        do {
            System.out.println("BOOKING MANAGEMENT" + "\n" +
                    "1. Add New Booking" + "\n" +
                    "2. Display List Booking" + "\n" +
                    "3. Create New Contracts" + "\n" +
                    "4. Display List Contracts" + "\n" +
                    "5. Edit Contracts" + "\n" +
                    "6. Return Main Menu");
            System.out.print("Please enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        // Implement display list employees
                        break;
                    case 2:
                        // Implement add new employee
                        break;
                    case 3:
                        // Implement edit employee
                        break;
                    case 4:
                        // Implement edit employee
                        break;
                    case 5:
                        // Implement edit employee
                        break;
                    case 6:
                        System.out.println("Returning to main menu.");
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the input buffer
                choice = 0; // Reset choice to trigger the loop again
            }
        } while (choice != 6);
    }
    private static void showPromotionManagement() {
        int choice;
        do {
            System.out.println("PROMOTION MANAGEMENT" + "\n" +
                    "1. Display List Customers Use Service" + "\n" +
                    "2. Display List Customers Get Voucher" + "\n" +
                    "3. Return Main Menu");
            System.out.print("Please enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        // Implement display list employees
                        break;
                    case 2:
                        // Implement add new employee
                        break;
                    case 3:
                        System.out.println("Returning to main menu.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the input buffer
                choice = 0; // Reset choice to trigger the loop again
            }
        } while (choice != 3);
    }
}


