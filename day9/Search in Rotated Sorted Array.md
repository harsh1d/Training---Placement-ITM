Search in Rotated Sorted Array

- Problem: Find target in rotated sorted array.
- Example:  [4,5,6,7,0,1,2], target `0` at index `4`


class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) return m;

            // Left part is sorted
            if (nums[l] <= nums[m]) {
                if (target >= nums[l] && target < nums[m]) r = m - 1;
                else l = m + 1;
            } 
            // Right part is sorted
            else {
                if (target > nums[m] && target <= nums[r]) l = m + 1;
                else r = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(s.search(nums, 0)); // 4  index of 0
        System.out.println(s.search(nums, 3)); // -1  3 not available
    }
}


 How it works
1. Check mid
    - If  target == nums[m] then  return.

2. Determine sorted half
    - Left sorted: nums[l] <= nums[m]
    - Right sorted: nums[m] <= nums[r]

3. Decide search direction

 Time Complexity
- O(log n): Binary search.