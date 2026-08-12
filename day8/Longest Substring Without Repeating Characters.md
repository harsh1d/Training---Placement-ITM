Longest Substring Without Repeating Characters
- Problem: Find length of longest substring with unique chars.

class Solution { 
    public int lengthOfLongestSubstring(String s) {
        // Array to store the last seen index of all 128 ASCII characters
        int[] lastSeen = new int[128];
        
        // Initialize all indices to -1 (meaning not yet seen)
        for (int i = 0; i < 128; i++) {
            lastSeen[i] = -1;
        }
        
        int maxLength = 0;
        int left = 0; 
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            // If the character was seen inside the current window, move left pointer
            if (lastSeen[c] >= left) {
                left = lastSeen[c] + 1;
            }
            
            // Update the last seen position of the character
            lastSeen[c] = right;
            
            // Update the maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        } 
        
        return maxLength; 
    } 

    public static void main(String[] args) { 
        Solution s = new Solution(); 
        System.out.println(s.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(s.lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(s.lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(s.lengthOfLongestSubstring(""));         // 0
        System.out.println(s.lengthOfLongestSubstring("dvdf"));     // 3
    }
}