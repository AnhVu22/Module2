package ss14_sort_algorithm;

import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(10);
        list.add(1);
        list.add(5);
        list.add(6);
        System.out.println(list);
        insertionSort(list);
    }
    public static int insertionSort(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            System.out.println("Key: " + key);
            int currentMaxIndex = i - 1;
            while (currentMaxIndex > -1) {
                int compareNum = list.get(currentMaxIndex);
                if (key < compareNum) {
                    System.out.println(key + " < " + compareNum);
                    currentMaxIndex--;
                } else {
                    System.out.println(key + " > " + compareNum);
                    System.out.println("Move " + key + " to position after " + compareNum);
                    break;
                }
            }
            if (currentMaxIndex == -1) System.out.println("Move " + key + " to first position");
            list.add(currentMaxIndex + 1,key);
            list.remove(i + 1);
            System.out.println(list);
        }
        return 0;
    }
}
