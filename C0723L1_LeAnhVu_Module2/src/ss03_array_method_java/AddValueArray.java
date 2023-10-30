package ss03_array_method_java;

import java.util.Arrays;
import java.util.Scanner;

public class AddValueArray {
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
        System.out.println("Input Index Add: ");
        int indexAdd = Integer.parseInt(input.nextLine());
        if (indexAdd <= 1 || indexAdd >= Arr.length - 1) {
            System.out.println("Out of Array");
        } else {
            System.out.println("Input Value Add: ");
            int valueAdd = Integer.parseInt(input.nextLine());
            System.out.println(Arrays.toString(add(Arr, indexAdd, valueAdd)));
        }

    }
    public static int[] add(int[] Arr, int indexAdd, int valueAdd) {
        int[] result = new int[Arr.length + 1];
        for (int i = 0; i < indexAdd; i++) {
            result[i] = Arr[i];
        }
        result[indexAdd] = valueAdd;
        for (int i = indexAdd; i < result.length-1; i++) {
            result[i + 1] = Arr[i];
        }
        return result;
    }
}
