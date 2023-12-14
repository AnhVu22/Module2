package view;

import controller.FuramaController;

import java.util.Scanner;

public class Main {
    private  static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
