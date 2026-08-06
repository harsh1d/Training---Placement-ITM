// add all zero to end of the array on the right side 

package day3.task3;

public class task3 {
    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;
        
        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        
        // Fill remaining positions with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4};
        moveZerosToEnd(arr);
        
        // Print the result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
