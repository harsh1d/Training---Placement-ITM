package day9.task1;

// Aim: Return an array where each element is the product of all numbers in the
// input array except the element at the same index, using prefix and suffix products.
public class task11 {

}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n];

        // Calculate prefix products: result[i] stores product of all elements before i
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Multiply with suffix products on the right
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}