package java_with_dsa;
import java.util.*;

public class LongestUniqueSubString {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " +
                lengthOfLongestSubstring(input));
    }
}
