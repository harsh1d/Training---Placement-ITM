package day10.task1;

import java.util.*;

public class task12 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Dictionary to store the next greater element for each number in nums2
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        // Traverse nums2 and build the mapping
        for (int num : nums2) {
            // While stack is not empty and current num is greater than stack top
            while (!stack.isEmpty() && num > stack.peek()) {
                nextGreater.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        // For remaining elements in stack, no greater element exists
        while (!stack.isEmpty()) {
            nextGreater.put(stack.pop(), -1);
        }
        
        // Build the result for nums1 using the mapping
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.get(nums1[i]);
        }
        
        return result;
    }
    
    // Sample Input:
    // Enter the size of nums1: 3
    // Enter elements of nums1: 4 1 2
    // Enter the size of nums2: 4
    // Enter elements of nums2: 1 3 4 2
    // Expected Output: Result: [-1, 3, -1]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of nums1: ");
        int size1 = scanner.nextInt();
        int[] nums1 = new int[size1];
        System.out.print("Enter elements of nums1: ");
        for (int i = 0; i < size1; i++) {
            nums1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the size of nums2: ");
        int size2 = scanner.nextInt();
        int[] nums2 = new int[size2];
        System.out.print("Enter elements of nums2: ");
        for (int i = 0; i < size2; i++) {
            nums2[i] = scanner.nextInt();
        }
        
        task12 solution = new task12();
        int[] result = solution.nextGreaterElement(nums1, nums2);
        
        System.out.print("Result: ");
        System.out.println(Arrays.toString(result));
        
        scanner.close();
    }
    
    // Sample example for working:
    // Input: nums1 = [4, 1, 2], nums2 = [1, 3, 4, 2]
    // Process nums2: [1, 3, 4, 2]
    //   - For 1: no greater element yet, push to stack
    //   - For 3: 3 > 1, so next greater of 1 is 3, push 3 to stack
    //   - For 4: 4 > 3, so next greater of 3 is 4, push 4 to stack
    //   - For 2: 2 < 4, push 2 to stack
    //   - Remaining in stack (4, 2): no greater element, so -1
    // Mapping: {1: 3, 3: 4, 4: -1, 2: -1}
    // Result for nums1 [4, 1, 2]: [-1, 3, -1]
}
