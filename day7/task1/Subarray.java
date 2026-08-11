// 1. Print all subarrays of an array

// - Logic: Use two nested loops to generate all possible subarrays.

package day7.task1;


public class Subarray {
    public static void printSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        printSubarrays(arr);
    }
}
