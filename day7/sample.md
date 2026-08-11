Counting the total number of 1s in a sorted binary array (an array containing only 0s and 1s) is a classic problem that can be optimized using binary search.

Since the array is sorted, all 0s come first and all 1s come last (e.g., [0, 0, 1, 1, 1, 1]). 

You only need to find the first occurrence of 1; the total count of 1s will be the remaining length of the array.

This approach solves the problem in O(log n) time complexity, as it eliminates the need to look for a last occurrence or count linearly. [6, 8] 

public class CountOnes {

    // Method to count 1s in a sorted binary array
    public static int countOnesInSortedArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int firstOneIndex = -1;

        // Perform binary search to find the FIRST occurrence of 1
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == 1) {
                firstOneIndex = mid;
                right = mid - 1; // Keep searching the LEFT side for an earlier 1
            } else {
                left = mid + 1;  // Element is 0, so 1 must be on the right side
            }
        }

        // If no 1 was found, return 0
        if (firstOneIndex == -1) {
            return 0;
        }

        // Total 1s = (Total Length) - (Index of the First 1)
        return arr.length - firstOneIndex;
    }

    public static void main(String[] args) {
        // Sorted binary array
        int[] binaryArray = {0, 0, 0, 1, 1, 1, 1, 1};

        int totalOnes = countOnesInSortedArray(binaryArray);

        System.out.println("Total number of 1s: " + totalOnes);
    }
}

Why This Logic Works
If an array has a length of 8 and the first 1 appears at index 3:

Index 0, 1, 2 are 0s (3 elements).
Index 3, 4, 5, 6, 7 are 1s.
Formula: 8 - 3 = 5. [9, 10, 11, 12] 


 Unsorted Array Alternative
If your array is unsorted, binary search will not work. You must fall back to a simple linear search loop:

int count = 0;for (int num : arr) {
    if (num == 1) count++;
}