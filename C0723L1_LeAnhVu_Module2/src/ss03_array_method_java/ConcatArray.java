package ss03_array_method_java;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Arrray 1 Length: ");
        int array1Length = Integer.parseInt(input.nextLine());
        int[] array1 = new int[array1Length];
        for (int i = 0; i < array1Length; i++) {
            System.out.println("Input Array 1 Element: " + (i + 1));
            array1[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Input Array 2 Length: ");
        int array2Length = Integer.parseInt(input.nextLine());
        int[] array2 = new int[array2Length];
        for (int j = 0; j < array2Length ; j++) {
            System.out.println("Input Array 2 Element: " +  (j + 1));
            array2[j] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Output Array 1: " + Arrays.toString(array1));
        System.out.println("Output Array 2: " + Arrays.toString(array2));

    }
}
