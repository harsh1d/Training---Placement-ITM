package day6.task1;

import java.util.HashMap;
import java.util.Map;

public class task12 {
    public static void main(String[] args) {
        String sentence = "this is a test string and this string is a sample string";
        String[] words = sentence.toLowerCase().split("\\s+");
        
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.merge(word, 1, Integer::sum);
        }
        
        System.out.println("Word frequencies:");
        wordFrequency.forEach((word, count) -> System.out.println(word + ": " + count));
        System.out.println("\nTotal number of words: " + words.length);
    }
}