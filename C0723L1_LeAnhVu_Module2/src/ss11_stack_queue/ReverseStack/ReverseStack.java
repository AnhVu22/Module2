package ss11_stack_queue.ReverseStack;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
//        reverse int array
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Input stack size: ");
        int sizeStack = Integer.parseInt(scanner.nextLine());
        int[] array = new int[sizeStack];
        Stack<Integer> stack = new Stack<>();
        for (int  i = 0; i < sizeStack; i++) {
            array[i] = rd.nextInt(100);
            stack.add(array[i]);
        }
        System.out.println(Arrays.toString(array));
        int index=0;
        while (!stack.isEmpty()){
            array[index]=stack.pop();
            index++;
        }
        System.out.println(Arrays.toString(array));
//        reverse string array
        String str = "This is a Stack";
        Stack<Character> wStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            wStack.push(str.charAt(i));
        }
        System.out.println(wStack);
        for (int i = 0; i < str.length(); i++) {
            wStack.pop();
        }
        System.out.println(wStack);
    }
}

