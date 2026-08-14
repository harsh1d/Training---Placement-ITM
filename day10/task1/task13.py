# https://leetcode.com/problems/next-greater-element-ii/

from typing import List

class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [-1] * n
        stack = []  # stores indices

        # Traverse the array twice (simulate circular behavior)
        for i in range(2 * n):
            while stack and nums[i % n] > nums[stack[-1]]:
                res[stack.pop()] = nums[i % n]
            if i < n:  # only push indices from the first pass
                stack.append(i)

        return res
