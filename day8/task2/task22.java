package day8.task2;

public class task22 {
    // Array leader index program: A leader is an element that is greater than all elements to its right
    public static void findLeaders(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        
        System.out.print("Leaders and their indices: ");
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        
        // The rightmost element is always a leader
        System.out.print(arr[n - 1] + " (index: " + (n - 1) + ") ");
        
        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                System.out.print(arr[i] + " (index: " + i + ") ");
                maxFromRight = arr[i];
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        findLeaders(arr);
    }
}
