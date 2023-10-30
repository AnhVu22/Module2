package ss03_array_method_java;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteValueArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input length array: ");
        int lengthArr = Integer.parseInt(input.nextLine());
        int[] Arr = new int[lengthArr];
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Input Array element " + (i + 1));
            Arr[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("New Array is: " + Arrays.toString(Arr));
        System.out.println("Input Value will Delete: ");
        int delValue = Integer.parseInt(input.nextLine());
        boolean isExit = false;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == delValue) {
                isExit = true;
                for (int j = i; j < Arr.length - 1; j++) {
                    Arr[j] = Arr[j + 1];
                }
                Arr[Arr.length - 1] = 0;
                i--;
            }
        }
            if (!isExit) {
                System.out.println("Not found element");
            } else {
                System.out.println("Arrrays after deletion: " + Arrays.toString(Arr));
            }
    }
}
