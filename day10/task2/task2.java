package day10.task2;

public class task2 {
    // Method to check if all elements of first array exist in second array
    public static boolean equalElements(int[] arr1, int[] arr2) {
        // Check if first array is null or empty
        if (arr1 == null || arr1.length == 0) {
            return true;
        }
        
        // Check if second array is null
        if (arr2 == null) {
            return false;
        }
        
        // Check each element of first array
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            // Search for current element in second array
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            // If element not found in second array, return false
            if (!found) {
                return false;
            }
        }
        // All elements found
        return true;
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {4, 3, 2, 1, 5};
        
        if (equalElements(array1, array2)) {
            System.out.println("All elements of first array exist in second array");
        } else {
            System.out.println("Not all elements of first array exist in second array");
        }
    }
}
