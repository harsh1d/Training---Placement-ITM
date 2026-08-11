package day7.task3;

public class task3 {
    // Method to find the index of the minimum element in an array
    // Sample example:
    // int[] numbers = {5, 2, 8, 1, 9};
    // int minIndex = findMinElementIndex(numbers);
    // Result: minIndex = 3 (because array[3] = 1 is the minimum element)
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

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        int minIndex = findMinElementIndex(numbers);
        System.out.println("Minimum element index: " + minIndex);
        System.out.println("Minimum element value: " + numbers[minIndex]);
    }
}


// selection sort  = divides the array in sub array . one array is the sorted array and the other is unsorted array. It finds the minimum element from the unsorted array and puts it at the end of the sorted array. It keeps on doing this until all the elements are sorted.