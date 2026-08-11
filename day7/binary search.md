A binary search is a highly efficient searching algorithm that works by repeatedly dividing the search interval in half. Unlike a linear search, a binary search requires the data structure to be sorted beforehand.

1.  2 pointer apprach

public class BinarySearchWhileLoop {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        // Keep searching as long as the search space is valid
        while (left <= right) {
            // Find the middle index safely to prevent integer overflow
            int mid = left + (right - left) / 2;

            // Check if the target is at the middle position
            if (arr[mid] == target) {
                return mid; // Target found, return its index
            }

            // If target is larger, discard the left half
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller, discard the right half
            else {
                right = mid - 1;
            }
        }

        return -1; // Target not found after search space is exhausted
    }

    public static void main(String[] args) {
        int[] numbers = {3, 9, 15, 21, 27, 33, 39, 45};
        int targetValue = 15;

        int resultIndex = binarySearch(numbers, targetValue);

        if (resultIndex != -1) {
            System.out.println("Element " + targetValue + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + targetValue + " not found in the array.");
        }
    }
}


Why a while loop is usually preferred over a for loop here:

No Linear Increment: A traditional for loop looks like for(int i=0; i<n; i++), where i increments by a fixed amount every time. 

Binary search skips large chunks of the array conditionally, making a while loop a more natural syntax choice.

Header Omission: In the example above, the final part of the for loop header for(...; ...; /* empty */)
is left blank because the updates to low or high rely entirely on if-else logic inside the body.

2.  for loop :

public class BinarySearchForLoop {

    public static int binarySearch(int[] arr, int target) {
        // Initialize left and right pointers in the loop header
        // The loop runs as long as the search space is valid (left <= right)
        for (int left = 0, right = arr.length - 1; left <= right; ) {
            
            // Calculate the middle index safely to prevent integer overflow
            int mid = left + (right - left) / 2;

            // Target found, return its index immediately
            if (arr[mid] == target) {
                return mid; 
            }

            // If target is larger, narrow focus to the right half
            if (arr[mid] < target) {
                left = mid + 1; 
            } 
            // If target is smaller, narrow focus to the left half
            else {
                right = mid - 1; 
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30, 35};
        int targetValue = 30;

        int resultIndex = binarySearch(numbers, targetValue);

        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found.");
        }
    }
}