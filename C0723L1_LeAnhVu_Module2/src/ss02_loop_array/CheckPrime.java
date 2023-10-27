package ss02_loop_array;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in: ");
        int numbers = Integer.parseInt(input.nextLine());
        for (int i = 2; i < numbers; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }
    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
