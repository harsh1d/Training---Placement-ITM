Selection Sort is a straightforward comparison-based sorting algorithm that works by repeatedly finding the minimum element from the unsorted part of the array and putting it at the beginning. 

The algorithm maintains two sub-arrays in a given array: 
1.  one which is already sorted and 
2.  the remaining portion which is unsorted

How Selection Sort Works

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 1, 4, 2, 8};
        
        System.out.println("Original Array:");
        printArray(data);
        
        selectionSort(data);
        
        System.out.println("\nSorted Array:");
        printArray(data);
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}