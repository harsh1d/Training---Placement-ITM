// addition of matrix 

package day4.task2;

public class task1 {
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length; // count length row
        int cols = a[0].length; // count length column

        // validation check : Ensure dimensions match 
        if(b.length != rows || b[0].length != cols){
            System.out.println("\nError: Matrices must have identical dimentions for addition.");
            return null;    
        }
        int[][] sum = new int[rows][cols]; // create a new matrix to store the sum

        //loop through rows and columns to add corresponding elements

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j]; // add corresponding elements
            }
        }
        return sum;
    }

    // helper method to display 2d arrays neatly
    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for (int element : row){
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}