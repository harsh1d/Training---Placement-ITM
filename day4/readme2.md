The \(2\text{D}\) arrays are declared and initialized directly inside the main method, and the addition logic is isolated into a separate reusable addMatrices method.


public class MatrixAdditionMethod {
    public static void main(String[] args) {
        // Declare and initialize two 2D arrays directly
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        System.out.println("=== Matrix A ===");
        printMatrix(matrixA);

        System.out.println("\n=== Matrix B ===");
        printMatrix(matrixB);

        // Pass the 2D arrays as arguments to the addition method
        int[][] resultMatrix = addMatrices(matrixA, matrixB);

        // Display the final result if the addition was successful
        if (resultMatrix != null) {
            System.out.println("\n=== Resultant Sum Matrix ===");
            printMatrix(resultMatrix);
        }
    }

    // Method to perform matrix addition
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;

        // Validation check: Ensure dimensions match
        if (b.length != rows || b[0].length != cols) {
            System.out.println("\nError: Matrices must have identical dimensions for addition.");
            return null;
        }

        int[][] sum = new int[rows][cols];

        // Loop through rows and columns to add elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        return sum; // Return the new 2D array
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

