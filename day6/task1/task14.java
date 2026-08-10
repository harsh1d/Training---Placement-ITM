package day6.task1;

public class task14 {
    // Code to find the most frequently repeating character in a string
    public static char findMostFrequent(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }
        
        int maxCount = 0;
        char mostFrequent = str.charAt(0);
        
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = str.charAt(i);
            }
        }
        
        return mostFrequent;
    }
    
    public static void main(String[] args) {
        String str = "hello world";
        char result = findMostFrequent(str);
        System.out.println("Most frequently repeating character: " + result);
    }
}
