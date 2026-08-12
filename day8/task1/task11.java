package day8.task1;

public class task11 {
    
    // Method to rotate array by 90 degrees clockwise using two pointer approach
    public static void rotateMatrix90(int[][] array) {
        int n = array.length;
        
        // Step 1: Transpose the array (swap rows with columns)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap array[i][j] with array[j][i]
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        
        // Step 2: Reverse each row using two pointer approach
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            
            // Use two pointers to reverse the row
            while (left < right) {
                int temp = array[i][left];
                array[i][left] = array[i][right];
                array[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    
    // Helper method to print the array
    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Main method to test the rotation
    public static void main(String[] args) {
        int[][] array = {
            {10, 20},
            {30, 40}
        };
        
        System.out.println("Original Matrix:");
        printMatrix(array);
        
        rotateMatrix90(array);
        
        System.out.println("\nMatrix after 90 degree rotation:");
        printMatrix(array);
    }
}
