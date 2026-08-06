//check the matrix are same or not

package day3.task2;

public class task2 {
    
    public static boolean areMatricesSame(int[][] matrix1, int[][] matrix2) {
        // Check if matrices are null
        if (matrix1 == null || matrix2 == null) {
            return false;
        }
        
        // Check if matrices have same number of rows
        if (matrix1.length != matrix2.length) {
            return false;
        }
        
        // Check if matrices have same number of columns and same elements
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length) {
                return false;
            }
            
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        // Example usage
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrix3 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 0}
        };
        
        System.out.println("Matrix1 and Matrix2 are same: " + areMatricesSame(matrix1, matrix2));
        System.out.println("Matrix1 and Matrix3 are same: " + areMatricesSame(matrix1, matrix3));
    }
}

