package day1.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twosum {

    /**
     * Finds indices of the two numbers in nums that add up to target.
     * 
     * @param nums   Array of integers
     * @param target Target sum
     * @return Array of two indices, or null if no solution exists
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null; // Not enough elements
        }

        Map<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null; // No valid pair found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input array size
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            if (n < 2) {
                System.out.println("Array must have at least two elements.");
                return;
            }

            // Input array elements
            int[] nums = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            // Input target
            System.out.print("Enter target sum: ");
            int target = sc.nextInt();

            // Solve
            int[] result = twoSum(nums, target);

            if (result != null) {
                System.out.println("Indices: " + result[0] + ", " + result[1]);
            } else {
                System.out.println("No two numbers add up to the target.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
