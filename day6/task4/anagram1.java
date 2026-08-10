package day6.task4;

public class anagram1 {
    
    public static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        
        if (str1.length() != str2.length()) {
            return false;
        }
        
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");
        
        // Create frequency array for 26 lowercase letters
        int[] frequency = new int[26];
        
        // Increment frequency for characters in str1
        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i) - 'a']++;
        }
        
        // Decrement frequency for characters in str2
        for (int i = 0; i < str2.length(); i++) {
            frequency[str2.charAt(i) - 'a']--;
        }
        
        // Check if all frequencies are zero
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";
        
        if (isAnagram(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagrams");
        }
    }
}
