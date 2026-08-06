// pendulum program in java
// A pendulum arrangement places elements alternately to the left and right of center
// Starting from the middle, smaller elements go left, larger elements go right

package day3.task4;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4};
        
        // Sort the array first
        Arrays.sort(arr);
        
        // Create result array for pendulum arrangement
        int[] result = new int[arr.length];
        int left = (arr.length - 1) / 2;
        int right = left + 1;
        
        // Place elements in pendulum fashion
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[left--] = arr[i];
            } else {
                result[right++] = arr[i];
            }
        }
        
        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
