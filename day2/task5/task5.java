package day2.task5;

import java.util.*;

public class task5 {

    /**
     * Finds all unique triplets in the array which sum to zero.
     * Constraint: 3 <= nums.length <= 3000
     */
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        // Validate constraints
        if (n < 3 || n > 3000) {
            return new ArrayList<>(); // Return empty if constraints are not met
        }

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // Sort to enable two-pointer approach

        for (int i = 0; i < n; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];

                if (total < 0) {
                    left++; // Need a larger sum
                } else if (total > 0) {
                    right--; // Need a smaller sum
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for the second element
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for the third element
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
            }
        }

        return res;
    }

    // Example usage
    public static void main(String[] args) {
        task5 solver = new task5();
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = solver.threeSum(nums);
        System.out.println(result);
    }
}
