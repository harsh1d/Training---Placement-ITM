# https://leetcode.com/problems/next-greater-element-i/

from typing import List

class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        # Dictionary to store the next greater element for each number in nums2
        next_greater = {}
        stack = []

        # Traverse nums2 and build the mapping
        for num in nums2:
            # While stack is not empty and current num is greater than stack top
            while stack and num > stack[-1]:
                next_greater[stack.pop()] = num
            stack.append(num)

        # For remaining elements in stack, no greater element exists
        while stack:
            next_greater[stack.pop()] = -1

        # Build the result for nums1 using the mapping
        return [next_greater[num] for num in nums1]

