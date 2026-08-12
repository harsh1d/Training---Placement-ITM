Array Rotations 

Rotate Matrix by 90 Degrees

To rotate a matrix by 90 degrees, you can use the following steps:

1. Transpose the matrix (i.e., swap rows with columns).
2. Reverse each row of the transposed matrix.

Example:

Suppose we have a 3x3 matrix:

1 2 3
4 5 6
7 8 9

Transpose:

1 4 7
2 5 8
3 6 9

Reverse each row:

7 4 1
8 5 2
9 6 3
```
The resulting matrix is the original matrix rotated by 90 degrees.


public class RotateMatrix {
    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        rotateMatrix(matrix);
        System.out.println("Rotated Matrix:");
        printMatrix(matrix);
    }
}


Output:

Original Matrix:
1 2 3 
4 5 6 
7 8 9 
Rotated Matrix:
7 4 1 
8 5 2 
9 6 3 

The output shows the original matrix and the rotated matrix. 

--------------------------------------

Spiral Traversal
Spiral traversal is a way of traversing a 2D matrix (or array) in a spiral order, starting from the top-left corner and moving clockwise.

Example:Suppose we have a 4x4 matrix:

	 1     2    3    4
	 5     6    7    8
	 9   10  11  12
	13  14  15  16

The spiral traversal of this matrix would be:
1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10

How it works:
Start at the top-left corner (1).
Move right until you reach the end of the row (4).Move down until you reach the end of the column (8, 12, 16).

Move left until you reach the start of the row (15, 14, 13).
Move up until you reach the start of the column (9, 5).Repeat steps 2-5 until all elements are visited.

Algorithm:
Initialize four pointers: top, bottom, left, and right to represent the current boundaries of the matrix.

Traverse the matrix in a spiral order:
Traverse from left to right at the top row.
Traverse from top to bottom at the right column.
Traverse from right to left at the bottom row.
Traverse from bottom to top at the left column.
Update the boundaries after each traversal:

Increment top.Decrement right.
Decrement bottom.Increment left.
Repeat step 2 until all elements are visited.

public class SpiralTraversal {
    public static void spiralTraversal(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            // Traverse from left to right at the top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            // Traverse from top to bottom at the right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            // Traverse from right to left at the bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            // Traverse from bottom to top at the left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println("Spiral Traversal: ");
        spiralTraversal(matrix);
    }
}


Output:

Spiral Traversal: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 

The output shows the elements of the matrix in a spiral order, starting from the top-left corner and moving clockwise.