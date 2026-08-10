package day6.task4;

import java.util.Arrays;

public class anagram {
    
    public static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        
        if (str1.length() != str2.length()) {
            return false;
        }
        
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");
        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1, charArray2);
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
