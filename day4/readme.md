ava code to transpose the matrix using a dedicated method. It takes the original 2D array as an argument, flips its rows and columns, and returns the new transposed matrix


=== Original Matrix ===
1	2	3	
4	5	6	
7	8	9	

=== Transposed Matrix ===
1	4	7	
2	5	8	
3	6	9


public class MatrixTransposeMethod {
    public static void main(String[] args) {
        // Declare and initialize the 2D array in main
        int[][] originalMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("=== Original Matrix ===");
        printMatrix(originalMatrix);

        // Pass the 2D array as an argument to the transpose method
        int[][] transposedMatrix = transposeMatrix(originalMatrix);

        System.out.println("\n=== Transposed Matrix ===");
        printMatrix(transposedMatrix);
    }

    // Method to perform matrix transposition
    public static int[][] transposeMatrix(int[][] matrix) {
        int originalRows = matrix.length;
        int originalCols = matrix[0].length;

        // In a transpose, rows become columns and columns become rows
        int[][] transposed = new int[originalCols][originalRows];

        // Loop through the matrix to swap indices
        for (int i = 0; i < originalRows; i++) {
            for (int j = 0; j < originalCols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed; // Return the new transposed 2D array
    }

    // Helper method to display 2D arrays neatly
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}


