package ss03_array_method_java;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Array Length: ");
        int arrayLength = Integer.parseInt(input.nextLine());
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Input Array Element: " + (i + 1));
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Output Array: " + Arrays.toString(array));
        int min = array[0];
        int j;
        for (j = 1; j < arrayLength; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("Min Value: " + min);
    }
}