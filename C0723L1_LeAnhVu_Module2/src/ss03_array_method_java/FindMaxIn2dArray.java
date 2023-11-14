package ss03_array_method_java;

import java.util.Scanner;

public class FindMaxIn2dArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Length Of Matrix");
        int length = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.println("Input row " + (i+1) + " And Column " + (j+1));
                int value = Integer.parseInt(scanner.nextLine());
                array[i][j] = value;
            }
        }
//        int[][] arr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        int max = findMax(array);
        System.out.println("The Max Value Is " + max);
    }
    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] i : arr) {
            for (int j : i) {
                if (j > max) max = j;
            }
        }
        return max;
    }
}
