package day10.task1;

public class task11 {
    public static void main(String[] args) {
        // Example usage
        int[] arr = {4, 5, 2, 10, 8};
        
        // Find next greater elements using task1 class
        int[] result = task1.nextGreaterElement(arr);
        
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Next Greater Elements: " + java.util.Arrays.toString(result));
    }
}