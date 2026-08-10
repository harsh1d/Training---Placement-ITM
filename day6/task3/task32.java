package day6.task3;

import java.util.stream.Collectors;

public class task32 {
    public static void main(String[] args) {
        String input = "programming";
        
        String result = input.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        
                
        System.out.println("Original: " + input);
        System.out.println("After removing duplicates: " + result);
    }
}

// remove duplicate characters from string java streams
// dot collect 
