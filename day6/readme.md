To solve the character frequency problem efficiently in Java, use a fixed-size integer array for standard ASCII strings, giving an O(n) time and O(1) space complexity. 

For broader Unicode strings, use a HashMap or a Java 8 Stream collector. 

Optimal ASCII Array Approach

1 Run a single loop through the string length.

2 Map each character to its ASCII index position.

3 Increment the count in an int array of size 256.


Qn Character frequency loops

public class CharacterFrequency {
    public static void printFrequency(String str) {
        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    }
}


Qn Character frequency collections

import java.util.HashMap;
import java.util.Map;

public class MapFrequency {
    public static void countFreq(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


Qn Most Frequently appearing character - reapeating char count

Optimal Approach (ASCII)Loop through the string to populate the frequency array.

Track the maximum count and the corresponding character in a single pass over the array.

public class MostFrequentChar {
    public static char getMostFrequent(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty");
        }

        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        int maxCount = -1;
        char mostFreqChar = ' ';

        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                mostFreqChar = (char) i;
            }
        }

        return mostFreqChar;
    }

    public static void main(String[] args) {
        String test = "success";
        System.out.println("Most frequent character: " + getMostFrequent(test)); 
        // Output: s
    }
}


Qn more than 1 repeating chars

import java.util.ArrayList;
import java.util.List;

public class MostFrequentChars {
    public static List<Character> getAllMostFrequent(String str) {
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }

        int[] freq = new int[256];
        int maxCount = 0;

        // Step 1: Populate frequencies and find the maximum count
        for (char c : str.toCharArray()) {
            freq[c]++;
            if (freq[c] > maxCount) {
                maxCount = freq[c];
            }
        }

        // Step 2: Collect all characters that match the max count
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            if (freq[i] == maxCount && maxCount > 0) {
                result.add((char) i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String test = "test"; // 't' appears 2 times, 'e' appears 1 time, 's' appears 1 time
        System.out.println("Most frequent: " + getAllMostFrequent(test)); 
        // Output: [t]

        String test2 = "paper"; // 'p' appears 2 times, 'a' appears 2 times (Tie)
        System.out.println("Most frequent: " + getAllMostFrequent(test2)); 
        // Output: [a, p] (Sorted by ASCII order)
    }
}



Qn : First Non Repeating Character

public class NaiveSolution {
    public static int firstNonRepeatingCharNaive(String s) {
        int n = s.length();
        
        // Loop through each character in the string
        for (int i = 0; i < n; i++) {
            boolean isRepeating = false;
            
            // Compare it against every other character
            for (int j = 0; j < n; j++) {
                // If it matches a character at a different index, it repeats
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isRepeating = true;
                    break; // No need to check further for this character
                }
            }
            
            // If the inner loop finishes and no match was found, return the index
            if (!isRepeating) {
                return i;
            }
        }
        
        return -1; // Return -1 if all characters repeat
    }

    public static void main(String[] args) {
        String input = "swiss";
        int index = firstNonRepeatingCharNaive(input);
        
        if (index != -1) {
            System.out.println("First non-repeating character is: '" + input.charAt(index) + "' at index " + index);
        } else {
            System.out.println("All characters are repeating.");
        }
    }
}


Why This Is Inefficient

Time Complexity: O(N²). 
For a string of length N, the outer loop runs N times. For each iteration, the inner loop can also run up to N times. 
If the string has 100,000 characters, it could take up to 10 billion operations.

Space Complexity: O(1). 
It uses constant extra space since it only requires a few primitive variables (i, j, isRepeating) to track indices and state.


Dry run tracking the pointers i and j step-by-step for the input "swiss".

To understand why this is the output, look at how the nested loops process the string "swiss" step-by-step:

Iteration 1 (i = 0, character is 's'):
The inner loop checks other indices.

At j = 3, it finds another 's'.  isRepeating becomes true. 
Loop breaks.

Iteration 2 (i = 1, character is 'w'):
The inner loop checks all other indices (s, i, s, s).
It finds no other 'w' in the entire string.  so isRepeating remains false.
The method immediately returns index 1.

so whats best approach?

The most optimized approach uses a Frequency Map (or a fixed-size array) and achieves a linear time complexity.

import java.util.Scanner;

public class Solution {
    public static int firstNonRepeatingChar(String s) {
        // Step 1: Count frequencies using an integer array for ASCII/Extended ASCII characters
        int[] freq = new int[256]; 
        
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        
        // Step 2: Find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return i; // Returns the index of the character
            }
        }
        
        return -1; // Returns -1 if all characters repeat
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();
        
        int index = firstNonRepeatingChar(input);
        
        if (index != -1) {
            System.out.println("First non-repeating character is: '" + input.charAt(index) + "' at index " + index);
        } else {
            System.out.println("All characters are repeating.");
        }
        sc.close();
    }
}



Pattern Recognition & Logic Building
The Naive Approach (O(N²)): Check every character against every other character using nested loops. This is highly inefficient for long strings.

The Optimized Approach (O(N)): Break the problem into two distinct phases: counting and lookup.

Data Structure Selection: 

Instead of a heavy HashMap, a fixed-size integer array (int[256]) serves as a direct-address table for standard ASCII characters. 

This eliminates object overhead and garbage collection pauses.

Complexity Analysis

Time Complexity: O(N)

The first loop traverses the string of length N to populate frequencies O(N).

The second loop traverses the string again to find the first unique character O(N).
So 2 separate loops
Total time: O(N) + O(N) = O(N).

Space Complexity: O(1) (Constant Space)The size of the array is fixed at 256, regardless of how large the input string grows.

Sample Test CasesInputOutputExplanation
1. swiss'w' at index 1s repeats, w is the first unique character.

2. leetcode'l' at index 0  l appears once and is the first non repeating character.

3. aabbcc
All characters are repeating.
Every character appears exactly twice


