// find the longest sub string
// To find the longest substring without repeating characters:
// 1. Use a sliding window approach with two pointers (start and end)
// 2. Use a HashSet or HashMap to track characters in the current window
// 3. Expand the window by moving the end pointer and add characters to the set
// 4. If a duplicate is found, shrink the window from the start until the duplicate is removed
// 5. Keep track of the maximum length found during the process
// 6. Time complexity: O(n), Space complexity: O(min(n, m)) where m is the charset size

package day9.task2;

import java.util.HashSet;
import java.util.Set;

public class task23 {
    
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;
        
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
            // If duplicate found, shrink window from start
            while (set.contains(currentChar)) {
                set.remove(s.charAt(start));
                start++;
            }
            
            // Add current character to set
            set.add(currentChar);
            
            // Update max length
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        task23 solution = new task23();
        
        // Test cases
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb")); // Output: 3 (abc)
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));    // Output: 1 (b)
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));   // Output: 3 (wke)
        System.out.println(solution.lengthOfLongestSubstring(""));         // Output: 0
        System.out.println(solution.lengthOfLongestSubstring("abcdef"));   // Output: 6 (abcdef)
    }
}
