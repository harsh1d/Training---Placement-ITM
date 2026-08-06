// merge the array into one single array and print it out. and sort it out in the way that the runtime is very less use a simple logic and with less code 

package day3.task1;

import java.util.Arrays;


public class task11 {
    public static void main(String[] args) {
        // Example arrays to merge
        int[] array1 = {5, 43, 8, 1};
        int[] array2 = {9, 3, 7, 4};
        
        // Sort individual arrays first
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        // Merge two sorted arrays using two-pointer technique - O(n+m) time complexity
        int[] merged = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                merged[k++] = array1[i++];
            } else {
                merged[k++] = array2[j++];
            }
        }
        
        // Copy remaining elements from array1
        while (i < array1.length) {
            merged[k++] = array1[i++];
        }
        
        // Copy remaining elements from array2
        while (j < array2.length) {
            merged[k++] = array2[j++];
        }
        
        // Print the merged and sorted array
        System.out.println(Arrays.toString(merged));
    }
}   