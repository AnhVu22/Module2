package ss13_search_algorithm;

import java.util.ArrayList;

public class LongestString {
    public static void main(String[] args) {
        String str1 = "QRSTABCXYZ";
        String str2 = "ABCHDEFGJ";
        String str3 = "JKLABCDEX";
        String str4 = "XYZQRSTUVA";
        String str5 = "Welcome";
        System.out.println(findLongestString(str1));
        System.out.println(findLongestString(str2));
        System.out.println(findLongestString(str3));
        System.out.println(findLongestString(str4));
        System.out.println(findLongestString(str5));

    }
        public static String findLongestString(String str) {
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
                }
                list.add(count);
                count = "";
            }
            String max = list.get(0);
            for (String s : list) {
                if (max.length() < s.length())
                    max = s;
            }
            return max;
        }
    }

