package day10.task1;

import java.util.Stack;
import java.util.Arrays;

public class task1 {
    // Method to find next greater element for each element in the array
    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        // Initialize result array with -1 (default when no greater element exists)
        Arrays.fill(result, -1);
        
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from stack that are smaller than or equal to current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            
            // If stack is not empty, top element is the next greater element
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            
            // Push current element to stack
            stack.push(arr[i]);
        }
        
        return result;
    }
    
    public static void main(String[] args) { 
        // Example usage
        int[] arr = {4, 5, 2, 10, 8};
        
        // Find next greater elements
        int[] result = nextGreaterElement(arr);
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }
}
