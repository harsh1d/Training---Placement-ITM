// Character frequency loops
// This program counts the frequency of each character in a string

package day6.task1;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        // Convert string to character array
        char[] chars = str.toCharArray();
        
        // Array to track which characters have been counted
        boolean[] visited = new boolean[str.length()];
        
        System.out.println("\nCharacter frequencies:");
        
        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            // Skip if already counted
            if (visited[i]) {
                continue;
            }
            
            int count = 1;
            
            // Count occurrences of current character
            for (int j = i + 1; j < str.length(); j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            
            // Display character and its frequency
            System.out.println(chars[i] + " : " + count);
        }
        
        sc.close();
    }
}