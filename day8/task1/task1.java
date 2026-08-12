package day8.task1;

public class task1 {
    
    // Method to rotate matrix by 90 degrees clockwise using two pointer approach
    public static void rotateMatrix90(int[][] matrix) {
        int n = matrix.length;
        
        // Step 1: Transpose the matrix (swap rows with columns)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j]; 
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Step 2: Reverse each row using two pointer approach
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            
            // Use two pointers to reverse the row
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    
    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Main method to test the rotation
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        rotateMatrix90(matrix);
        
        System.out.println("\nMatrix after 90 degree rotation:");
        printMatrix(matrix);
    }
}
