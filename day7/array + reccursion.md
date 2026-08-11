array + recursion 

 LeetCode 78. Subsets
Problem: Return all subsets of `[1,2,3]`
Output: [[], [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]]


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), res);
        return res;
    }
    private void helper(int[] nums, int i, List<Integer> path, List<List<Integer>> res) {
        if (i == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        // don't include nums[i]
        helper(nums, i+1, path, res);
        // include nums[i]
        path.add(nums[i]);
        helper(nums, i+1, path, res);
        path.remove(path.size()-1); // backtrack
    }
}