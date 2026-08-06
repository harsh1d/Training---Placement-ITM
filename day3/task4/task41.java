// pendulum program in java
// A pendulum arrangement places elements alternately to the left and right of center
// Starting from the middle, smaller elements go left, larger elements go right
// This implementation uses a Deque (Double-ended Queue) data structure
// Deque allows efficient insertion at both ends, making it ideal for pendulum arrangement
// Elements are added alternately to the front (left) and back (right) of the deque

package day3.task4;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class task41{
    public static void main(String[] args) {
        // Example 1: Original array with duplicates
        int[] arr1 = { 1, 0, 2, 0, 3, 0, 4 };
        System.out.println("Example 1 - Array with duplicates:");
        System.out.print("Input: ");
        printArray(arr1);
        System.out.print("Pendulum arrangement: ");
        pendulumArrangement(arr1);
        System.out.println("\n");

        // Example 2: Array with negative numbers
        int[] arr2 = { -5, 3, -2, 8, 1, -7, 4 };
        System.out.println("Example 2 - Array with negative numbers:");
        System.out.print("Input: ");
        printArray(arr2);
        System.out.print("Pendulum arrangement: ");
        pendulumArrangement(arr2);
        System.out.println("\n");

        // Example 3: Array with sequential numbers
        int[] arr3 = { 5, 1, 3, 2, 4 };
        System.out.println("Example 3 - Sequential numbers:");
        System.out.print("Input: ");
        printArray(arr3);
        System.out.print("Pendulum arrangement: ");
        pendulumArrangement(arr3);
        System.out.println("\n");

        // Example 4: Array with large numbers
        int[] arr4 = { 100, 50, 75, 25, 90, 10 };
        System.out.println("Example 4 - Large numbers:");
        System.out.print("Input: ");
        printArray(arr4);
        System.out.print("Pendulum arrangement: ");
        pendulumArrangement(arr4);
    }

    // Method to perform pendulum arrangement using Deque
    public static void pendulumArrangement(int[] arr) {
        // Sort the array first
        Arrays.sort(arr);

        // Create a Deque for pendulum arrangement
        Deque<Integer> deque = new LinkedList<>();

        // Place elements in pendulum fashion using Deque
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                deque.addFirst(arr[i]);
            } else {
                deque.addLast(arr[i]);
            }
        }

        // Print the result
        for (int num : deque) {
            System.out.print(num + " ");
        }
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
