Insertion sort is a simple, comparison-based sorting algorithm that builds a final sorted array one element at a time. 

It works similarly to the way you might sort playing cards in your hands—you take one card at a time from an unsorted pile and insert it into its correct position within your sorted hand.

How It Works
The algorithm virtually splits the array into two parts: 

a sorted part at the beginning and an unsorted part at the end.

Start with the second element (index 1), assuming the first element is already sorted.

Compare this element with the elements before it (to its left).

Shift all larger elements one position to the right to clear a space.

Insert the element into its correct sorted position.

Repeat this process for all remaining unsorted elements until the entire array is sorted

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        // Traverse from the second element up to the last element
        
	for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // The element to be positioned
            int j = i - 1;

            /* Move elements of arr[0..i-1] that are greater than key
               to one position ahead of their current position */
            
	while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            
            // Place the key at its correct position
            arr[j + 1] = key;
        }
    }

    // Driver code to test the algorithm
    public static void main(String[] args) {
        int[] nums = {12, 11, 13, 5, 6};
        
     System.out.println("Original array:"+ Arrays.toString(nums));
       // printArray(nums);

        insertionSort(nums);

        System.out.println("\nSorted array:" + Arrays.toString(nums));
        //printArray(nums);
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}



Key Java Features Used

In-place modification: 
The algorithm passes the array by reference, modifying the original primitive int[] array directly without returning a new one.

Primitive types: Using int avoids the wrapper class overhead of Integer, maximizing execution speed.

Conditional loops: 
The while loop efficiently combines boundary checking (j >= 0) and value comparison (arr[j] > key) using short-circuit evaluation.