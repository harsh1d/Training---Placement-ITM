// code for most frequently repeating

package day6.task1;

public class task13 {
    // Code to find the most frequently repeating element in an array
    public static int findMostFrequent(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int maxCount = 0;
        int mostFrequent = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }
        
        return mostFrequent;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 2, 1};
        int result = findMostFrequent(arr);
        System.out.println("Most frequently repeating element: " + result);
    }
}
