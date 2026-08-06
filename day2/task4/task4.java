// take the array and check the occurrences 

package day2.task4;

import java.util.HashMap;
import java.util.Map;

public class task4 {
    public static void checkOccurrences(int[] array) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        
        for (int num : array) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Occurrences: " + entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        checkOccurrences(array);
    }
}
