package ss01_introduction_java;

import java.util.Scanner;

public class ExchangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input exchange rate: ");
        int rate = Integer.parseInt(sc.nextLine());
        System.out.println("Input amount USD: ");
        int valueUSD = Integer.parseInt(sc.nextLine());
        System.out.println("Result: " + valueUSD * rate + " VNĐ");
    }
}
