package day9.task3;

public class task31 {
    // A pangram is a string that contains all 26 letters of the alphabet at least once
    // This method checks if the given string is a pangram
    // Sample input 1: "The quick brown fox jumps over the lazy dog" - returns true (contains all 26 letters)
    // Sample input 2: "Hello World" - returns false (missing several letters like q, x, z, etc.)
    // Sample input 3: "Pack my box with five dozen liquor jugs" - returns true (contains all 26 letters)
    public static boolean isPangram(String str) {
        // Convert string to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        
        // Check if all 26 letters from 'a' to 'z' are present in the string
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // Sample input 1
        String input1 = "The quick brown fox jumps over the lazy dog";
        System.out.println("Input: \"" + input1 + "\" - isPangram: " + isPangram(input1));
        
        // Sample input 2
        String input2 = "Hello World";
        System.out.println("Input: \"" + input2 + "\" - isPangram: " + isPangram(input2));
        
        // Sample input 3
        String input3 = "Pack my box with five dozen liquor jugs";
        System.out.println("Input: \"" + input3 + "\" - isPangram: " + isPangram(input3));
    }
}
// Input:"The quick brown fox jumps over the lazy dog"-isPangram:true 
// Input:"Hello World"-isPangram:false 
// Input:"Pack my box with five dozen liquor jugs"-isPangram:true