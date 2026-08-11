Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping adjacent elements if they are in the wrong order. 

The algorithm gets its name because smaller or larger elements "bubble" to the top (or end) of the list with each pass

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Loop through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Last i elements are already in place, so we skip them
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no two elements were swapped in the inner loop, break
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 1, 4, 2, 8};
        
        System.out.println("Original Array:");
        printArray(data);
        
        bubbleSort(data);
        
        System.out.println("\nSorted Array:");
        printArray(data);
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}


How Bubble Sort Works

Compare adjacent items: Start at the beginning of the list and look at the first two elements.

Swap if out of order: 
If the first element is larger than the second, swap them with temp.

Move forward: Move to the next pair of elements and repeat the process until the end of the list.

Repeat passes: A single pass guarantees that the largest element moves to its final, correct position at the very end. 

Repeat the process for the remaining unsorted portion until the entire list is sorted.

Step-by-Step ExampleConsider the unsorted array: [5, 1, 4, 2]

First Pass:Compare 5 and 1 -> 5 > 1, swap  [1, 5, 4, 2]

Compare 5 and 4 -> 5 > 4, swap → [1, 4, 5, 2]

Compare 5 and 2 -> 5 > 2, swap → [1, 4, 2, 5] (The largest number, 5, has bubbled to the end)

Second Pass:
Compare 1 and 4 → 1 < 4, no swap → [1, 4, 2, 5]

Compare 4 and 2 → 4 > 2, swap → [1, 2, 4, 5] (The next largest number, 4, is now in place)

Third Pass:
Compare 1 and 2 → 1 < 2, no swap → [1, 2, 4, 5] (Array is fully sorted)


ConsPros:
1. Incredibly easy to understand and write code for.

2. It is an in-place sorting algorithm (requires no extra memory memory space).

3. It is a stable sort (maintains the relative order of identical elements).

Cons:
Highly inefficient for large datasets due to its quadratic time complexity.

Performs significantly worse than algorithms like Merge Sort or Quick Sort.



--------------------



def bubble_sort(arr):
    n = len(arr)
    # Loop through all array elements
    for i in range(n):
        swapped = False
        
        # Last i elements are already in place
        for j in range(0, n - i - 1):
            # Swap if the element found is greater than the next element
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
                
      
# If no two elements were swapped by inner loop, then break
        if not swapped:
            break

# Example Usage
data = [64, 34, 25, 12, 22, 11, 90]
bubble_sort(data)
print("Sorted array:", data)


optimization technique using a boolean flag to exit early if the array becomes sorted ahead of time.