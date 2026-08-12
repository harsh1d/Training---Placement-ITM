To find the first or last occurrence of a duplicate number in a sorted array using binary search, you cannot immediately return the index when arr[mid] == target. Instead, you must record the current index as a potential answer and continue searching in the appropriate half to see if a better match exists. [1] 
## Code Implementation
Here is a complete Java program that includes two distinct methods: one for finding the first occurrence and another for the last occurrence. [2] 

public class BinarySearchDuplicates {
//numbers = {2, 4, 10, 10, 10, 18, 20};  //10
    // Method to find the FIRST occurrence of a duplicate element
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1; // Stores the latest valid index found

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;     // Record the index
                right = mid - 1;  // Keep searching the LEFT side for an earlier match
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Method to find the LAST occurrence of a duplicate element
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1; // Stores the latest valid index found

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;    // Record the index
                left = mid + 1;  // Keep searching the RIGHT side for a later match
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Sorted array containing duplicate elements
        int[] numbers = {2, 4, 10, 10, 10, 18, 20};
        int targetValue = 10;

        int firstIndex = findFirstOccurrence(numbers, targetValue);
        int lastIndex = findLastOccurrence(numbers, targetValue);

        System.out.println("First occurrence of " + targetValue + " is at index: " + firstIndex);
        System.out.println("Last occurrence of " + targetValue + " is at index: " + lastIndex);
    }
}

The Core Logic Change

1. For First Occurrence: 

When arr[mid] == target,  save the index (result = mid) and shift search window to the left (right = mid - 1). 

This allows  to check if the exact same number appears earlier in the array. [3, 4]

2.  For Last Occurrence: 
When arr[mid] == target,  save the index (result = mid) and shift  search window to the right (left = mid + 1). 

This allows  to check if the exact same number appears later in the array. [5, 6] 

Complexity
Both methods strictly maintain a Time Complexity of O(log n) and a 

Space Complexity of O(1), making this strategy far more efficient than finding a match and scanning linearly left or right