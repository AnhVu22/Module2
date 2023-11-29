package ss13_search_algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {0, 2, 3, 5, 7, 11, 13, 17, 19, 23};
        int result = binarySearch(13, array, 0, 10);
        if (result == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Indexed: " + result);
        }
    }
    public static int binarySearch(int x, int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            if (x == array[mid]) return mid;
            if (x > array[mid]) return binarySearch(x, array, mid + 1, right);
            else return binarySearch(x, array, left, mid - 1);
        }
        return -1;
    }
}
