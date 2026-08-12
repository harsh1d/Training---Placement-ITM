TCS Array Rotations 

Problem Statement: "Rotate Array Around K"

Description: Given an array of N integers and an integer K, divide the array into two parts right after the K-th position and slide the first part (containing K elements) to the end of the array.

Constraints:1 ≤ N ≤ 10⁵1 ≤ K ≤ N

Input Format:
Line 1: Size of the array (N)
Line 2: The array elements (space-separated)
Line 3: Value of K

Example 1:

Input:
5
10 20 30 40 50
2

Output: 30 40 50 10 20

Explanation: Position K = 2 means we slice after the second element (10, 20). This left block moves to the end. This is equivalent to a Left Rotation by K steps



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read array size
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        // Read array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Read K
        int k = sc.nextInt();
        sc.close();
        
        // Execute Left Rotation by K steps
        rotateLeft(arr, k);
        
        // Print output in space-separated format requested by TCS
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
    
    public static void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) return;
        
        // Handle cases where K >= N
        k = k % n;
        if (k == 0) return;
        
        // Three-step reversal process for Left Rotation
        reverse(nums, 0, k - 1);       // Reverse first part
        reverse(nums, k, n - 1);       // Reverse second part
        reverse(nums, 0, n - 1);       // Reverse whole array
    }
    
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}