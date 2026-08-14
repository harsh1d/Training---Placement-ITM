package day10.task1;

import java.util.*;

public class task13 {
    // Sample case example:
    // Input: nums = [1, 2, 1]
    // Output: [2, -1, 2]
    // Explanation: The first 1's next greater number is 2;
    // The number 2 can't find next greater number;
    // The second 1's next greater number needs to search circularly, which is also 2.
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>(); // stores indices

        // Traverse the array twice (simulate circular behavior)
        for (int i = 0; i < 2 * n; i++) {
            while (!stack.isEmpty() && nums[i % n] > nums[stack.peek()]) {
                res[stack.pop()] = nums[i % n];
            }
            if (i < n) { // only push indices from the first pass
                stack.push(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        task13 solution = new task13();

        // Test case from the example
        int[] nums = {1, 2, 1};
        int[] result = solution.nextGreaterElements(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}
