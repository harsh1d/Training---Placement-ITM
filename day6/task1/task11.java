// take a string break it into words and prompt the word and count the frequency of each word in the string
// task i count the number of words in the sentence 


package day6.task1;

import java.util.HashMap;
import java.util.Map;

public class task11 {
    public static void main(String[] args) {
        String sentence = "this is a test string and this string is a sample string";
        
        // Break the string into words
        String[] words = sentence.toLowerCase().split("\\s+");
        
        // Count the frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        // Print each word and its frequency
        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Count total number of words
        int totalWords = words.length;
        System.out.println("\nTotal number of words: " + totalWords);
    }
}
