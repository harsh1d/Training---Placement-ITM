package day9.task2;

public class task22 {
    // driver code to test the algorithm
    public static void main(String[] args) {
        int [] nums = {12,11,13,5,6};
        
        System.out.println("Original Array: ");
        printArray(nums);
        
        insertionsort(nums);
        
        System.out.println("Sorted Array: ");
        printArray(nums);
    }
    
    // insertion sort implementation for descending order
    static void insertionsort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    // utility method to print the array
    static void printArray(int [] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
