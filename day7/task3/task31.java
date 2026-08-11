package day7.task3;

public class task31 {
    // Method to find the index of the minimum element in an array
    // Sample example:
    // int[] numbers = {5, 2, 8, 1, 9};
    // int minIndex = findMinElementIndex(numbers);
    // Result: minIndex = 3 (because array[3] = 1 is the minimum element)
    // The minimum element index is 3 and the minimum element value is 1
    // This is found by iterating through the array and keeping track of the index with the smallest value
    public static int findMinElementIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    // Selection sort = divides the array in sub array. one array is the sorted array and the other is unsorted array.
    // It finds the minimum element from the unsorted array and puts it at the end of the sorted array.
    // It keeps on doing this until all the elements are sorted.
    public static void selectionSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the first element of unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        int minIndex = findMinElementIndex(numbers);
        System.out.println("Minimum element index: " + minIndex);
        System.out.println("Minimum element value: " + numbers[minIndex]);
        
        System.out.println("\nBefore sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        selectionSort(numbers);
        
        System.out.println("\nAfter sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
