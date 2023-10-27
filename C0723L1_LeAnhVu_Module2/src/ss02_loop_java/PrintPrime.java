package ss02_loop_java;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in: ");
        int numbers = Integer.parseInt(input.nextLine());
        int count = 0;
        int N = 2;
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.println(N + " ");
                count++;
            }
            N++;
        }
    }
    public static boolean isPrime(int x){
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
