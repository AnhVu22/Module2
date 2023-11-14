package ss03_array_method_java;

import java.util.Scanner;

public class SumColumnArray {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Input Length Of Matrix");
        int length = Integer.parseInt(inputValue.nextLine());
        int[][] arraySum = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.println("Input row " + (i+1) + " And Column " + (j+1));
                int value = Integer.parseInt(inputValue.nextLine());
                arraySum[i][j] = value;
            }
        }
        System.out.println("Input Column To Find Sum: ");
        int column = Integer.parseInt(inputValue.nextLine());
        int sum = 0;
        for (int[] i : arraySum) {
            sum += i[column];
        }
        System.out.println("Output Sum: " + sum);
    }
}
