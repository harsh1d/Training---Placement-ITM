package day6.task2;

import java.util.Arrays;

public class task2 {

    public static char[] getMostRepeatingChars(String input) {
        // Handle edge cases for empty or null inputs
        if (input == null || input.isEmpty()) {
            return new char[0];
        }

        // 1. Count frequencies using an ASCII frequency array
        int[] frequencies = new int[256];
        int maxFrequency = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            frequencies[c]++;

            // Track the maximum frequency found so far
            if (frequencies[c] > maxFrequency) {
                maxFrequency = frequencies[c];
            }
        }

        // 2. Count how many characters have this maximum frequency (for array sizing)
        int tieCount = 0;
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] == maxFrequency) {
                tieCount++;
            }
        }

        // 3. Populate and return the primitive char array
        char[] result = new char[tieCount];
        int index = 0;
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] == maxFrequency) {
                result[index++] = (char) i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test case 1: Single clear winner
        String test1 = "success";
        System.out.println("Input: " + test1);
        System.out.println("Result: " + Arrays.toString(getMostRepeatingChars(test1)));
        // Output: [s] ('s' appears 3 times)

        // Test case 2: Multiple characters tie for highest frequency
        String test2 = "teststring";
        System.out.println("\nInput: " + test2);
        System.out.println("Result: " + Arrays.toString(getMostRepeatingChars(test2)));
        // Output: [s, t] (both 's' and 't' appear 3 times)
    }
}
