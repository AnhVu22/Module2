package ss11_stack_queue.CheckPalindrome;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class CheckPalindrome {
    public boolean isPalindrome(String str) {
        Queue<Character> stringQueue = new ArrayDeque<>();
        String upper = str.toUpperCase();
        for (int i = upper.length() - 1; i >= 0; i--) {
            stringQueue.add(upper.charAt(i));
        }
        for (int i = 0; i < upper.length(); i++) {
            if (upper.charAt(i) != stringQueue.remove()) ;
            return false;
        }
        return true;
    }
}
