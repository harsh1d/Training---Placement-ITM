Chocolate Distribution Problem" (also framed as "Minimize Difference in Packets").

This problem tests your ability to use Sorting alongside the Sliding Window technique to find an optimal subset.

Description:

 Given an array of N integers where each value represents the number of chocolates in a packet, and M number of students. Distribute chocolate packets such that:

Each student gets exactly one packet.
The difference between the maximum number of chocolates given to a student and the minimum number of chocolates given to a student is minimized.

Constraints:1 ≤ N ≤ 10⁵1 ≤ M ≤ N\(1 \le \text{arr}[i] \le 10^9\)

Input Format:
Line 1: Number of packets (N)
Line 2: Space-separated integers (packets details)
Line 3: Number of students (M)

Example 1:
Input:
7
7 3 2 4 9 12 56
3

Output: 2
Explanation: We need to choose 3 packets. If we pick packets with chocolates 2, 3, 4, the maximum is 4 and the minimum is 2. The difference is 4 - 2 = 2. 

This is the minimum possible difference.

The Optimal Logic
Sort the Array: 
Sorting the array brings elements with close numerical values next to each other.

Apply Sliding Window: 

Maintain a window of size M. The first element of the window is the minimum value, and the last element is the maximum value.

Track the Minimum Difference: 
Calculate arr[i + M - 1] - arr[i] for every valid window starting at index i, and store the lowest difference found.

Optimized  Solution O(N log N) Time, O(1) Space

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static long findMinDifference(long[] arr, int n, int m) {
        // If there are no chocolates or students, or packets are fewer than students
        if (m == 0 || n == 0 || n < m) {
            return 0;
        }

        // Step 1: Sort the array
        Arrays.sort(arr);

        long minDiff = Long.MAX_VALUE;

        // Step 2 & 3: Slide a window of size M across the sorted array
        for (int i = 0; i + m - 1 < n; i++) {
            long currentDiff = arr[i + m - 1] - arr[i];
            
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong(); // Using long to handle large values securely
        }
        
        int m = sc.nextInt();
        sc.close();

        System.out.println(findMinDifference(arr, n, m));
    }
}