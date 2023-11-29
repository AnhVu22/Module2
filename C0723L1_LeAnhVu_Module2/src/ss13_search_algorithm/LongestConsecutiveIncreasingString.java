package ss13_search_algorithm;

import java.util.ArrayList;

public class LongestConsecutiveIncreasingString {
    public static void main(String[] args) {
        String str1 = "ABCABCDGABXY";
        String str2 = "ABCEAFGHIABMNSXY";
        String str3 = "ABCZBEFB";
        String str4 = "XYZQRSTUV";
        String str5 = "Welcome";
        System.out.println(findLongest(str1));
        System.out.println(findLongest(str2));
        System.out.println(findLongest(str3));
        System.out.println(findLongest(str4));
        System.out.println(findLongest(str5));
    }
    public static String findLongest(String str) {
        ArrayList<String> list = new ArrayList<>();
        String count = "";
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            count += temp;
            for (int j = i + 1; j < str.length(); j++) {
                if (temp < str.charAt(j)) {
                    count += str.charAt(j);
                    temp = str.charAt(j);
                }
                else break;
            }
            list.add(count);
            count = "";
        }
        String max = list.get(0);
        for (String item : list) {
            if (max.length() < item.length()) max = item;
        }
        return max;
    }
}
