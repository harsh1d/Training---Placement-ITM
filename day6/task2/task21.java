// find palindrome string using two pointer approach


package day6.task2;

public class task21 {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }
        
        // Manual length calculation without using built-in length() function
        int length = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            length++;
        }
        
        if (length == 0) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }
        
        int left = 0;
        int right = length - 1;
        
        while (left < right) {
            // Manual character access without using built-in charAt() function
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String str = "racecar";
        boolean result = isPalindrome(str);
        System.out.println("Is the string a palindrome? " + result);
    }
}