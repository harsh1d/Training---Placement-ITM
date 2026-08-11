package day7.task1;

public class KadanesAlgorithmDemo {

    /**
     * Finds the maximum subarray sum using Kadane's Algorithm.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int findMaxSubarraySum(int[] nums) {
        // Step 1: Base case handling for empty arrays
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Step 2: Initialize both tracking variables to the first element
        int currentMax = nums[0];
        int maxSoFar = nums[0];

        // Step 3: Loop through the rest of the array starting at index 1
        for (int i = 1; i < nums.length; i++) {
            // Decision: Add current element to existing streak, or start a new streak here?
            currentMax = Math.max(nums[i], currentMax + nums[i]);

            // Update the global maximum (the leaderboard record) if the current streak is
            // higher
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    // Main method to execute and test the algorithm
    public static void main(String[] args) {

        // Test Case 1: Standard mixed array (with positive and negative numbers)
        int[] testCase1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result1 = findMaxSubarraySum(testCase1);
        System.out.println("Test Case 1 Array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]");
        System.out.println("Maximum Subarray Sum: " + result1); // Expected Output: 6 (from [4, -1, 2, 1])
        System.out.println("------------------------------------------------");

        // Test Case 2: All negative numbers (forces the algorithm to pick the single
        // largest negative number)
        int[] testCase2 = { -8, -3, -5, -2, -7 };
        int result2 = findMaxSubarraySum(testCase2);
        System.out.println("Test Case 2 Array: [-8, -3, -5, -2, -7]");
        System.out.println("Maximum Subarray Sum: " + result2); // Expected Output: -2 (from [-2])
        System.out.println("------------------------------------------------");

        // Test Case 3: All positive numbers (the maximum sum is simply the sum of the
        // whole array)
        int[] testCase3 = { 1, 2, 3, 4, 5 };
        int result3 = findMaxSubarraySum(testCase3);
        System.out.println("Test Case 3 Array: [1, 2, 3, 4, 5]");
        System.out.println("Maximum Subarray Sum: " + result3); // Expected Output: 15
        System.out.println("------------------------------------------------");
    }
}