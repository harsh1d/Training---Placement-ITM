// palindrome
// A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
// This class provides a method to check if a given string is a palindrome
// A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
// This class provides a method to check if a given string is a palindrome

package day5.task3;

public class task3 {
    
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        
        
        // Remove spaces and convert to lowercase for comparison
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {  //lisril 
            // ascii values of each character is compared for equality 
            // 97 == 97 which is a so value is a
            // 99 == 99 ascii value of c is 99 
            // so all character will b converted into ascii value then comparisons happens 
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        // Test cases
        String test1 = "racecar";
        String test2 = "hello";
        String test3 = "A man a plan a canal Panama";
        
        System.out.println(test1 + " is palindrome: " + isPalindrome(test1));
        System.out.println(test2 + " is palindrome: " + isPalindrome(test2));
        System.out.println(test3 + " is palindrome: " + isPalindrome(test3));
    }
}
