// merging two arrays together and arrange the array in the sorted way

package day3.task1;
import java.util.Arrays;
public class task1 {
    public static void main(String[] args) {

        // Define two arrays to merge
        int[] array1 = {5, 2, 8, 1};
        int[] array2 = {9, 3, 7, 4};
        
        // Merge the two arrays
        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        
        // Sort the merged array
        Arrays.sort(mergedArray);
        
        // Print the sorted merged array
        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
    }
}
