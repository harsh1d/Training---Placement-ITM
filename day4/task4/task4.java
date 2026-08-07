package day4.task4;

public class task4 {
    // Method to find the missing number in an array containing n-1 elements from 1 to n
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the expected sum of numbers from 1 to n using the formula n*(n+1)/2
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // The missing number is the difference between expected and actual sum
        return expectedSum - actualSum;
    }
    
    // Alternative method using XOR approach
    public static int findMissingNumberXOR(int[] arr, int n) {
        // XOR all numbers from 1 to n
        int xor1 = 0;
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }
        
        // XOR all elements in the array
        int xor2 = 0;
        for (int num : arr) {
            xor2 ^= num;
        }
        
        // XOR of xor1 and xor2 gives the missing number
        return xor1 ^ xor2;
    }
    
    // Main method to demonstrate the usage
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6; // The range is from 1 to 6
        
        System.out.println("Missing number (Sum method): " + findMissingNumber(arr, n));
        System.out.println("Missing number (XOR method): " + findMissingNumberXOR(arr, n));
    }
}
