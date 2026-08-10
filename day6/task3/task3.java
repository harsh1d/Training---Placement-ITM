// remove duplicate characters from string

package day6.task3;

import java.util.LinkedHashSet;

public class task3 {
    public static void main(String[] args) {
    
        String input = "Hello World";
        String result = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("After removing duplicates: " + result);
    }
    
    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>(); // will maintain the serial order of insertion of the inserted characters 
                                                             // and remove duplicates 
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        return sb.toString();
    }
}
