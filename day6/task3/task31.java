package day6.task3;

public class task31 {
    
    // Main method - entry point of the program
    public static void main(String[] args) {
        
        // Declare and initialize the input string
        String input = "Hello World";
        
        // Call the removeDuplicates method and store the result
        String result = removeDuplicates(input);
        
        // Print the original string
        System.out.println("Original: " + input);
        
        // Print the string after removing duplicates
        System.out.println("After removing duplicates: " + result);
    }
    
    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        
        // Create a StringBuilder to build the result string
        StringBuilder sb = new StringBuilder();
        
        // Convert string to character array and iterate through each character
        char[] charArray = str.toCharArray();
        
        // Loop through each character in the array
        for (int i = 0; i < charArray.length; i++) {
            // Check if the character is already present in the result
            boolean isDuplicate = false;
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == charArray[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            // Add character to StringBuilder only if it's not a duplicate
            if (!isDuplicate) {
                sb.append(charArray[i]);
            }
        }
        
        // Convert StringBuilder to String and return the result
        return sb.toString();
    }
}
