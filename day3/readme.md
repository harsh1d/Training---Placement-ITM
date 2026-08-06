Question 3: Factorial
Problem Statement:
Solve the standard 'Factorial' problem efficiently using optimized Java logic.
Learning Objective:
Understand pattern recognition, logic building, optimization, and implementation.
Sample Test Case:
Input: Custom Input
Output: Expected Output
Optimized Java Solution Template:
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Read input
        
        // Write optimized logic here
        
        // Print output
    }
}
Question 4: Fibonacci Series
Problem Statement:
Solve the standard 'Fibonacci Series' problem efficiently using optimized Java logic.
Learning Objective:
Understand pattern recognition, logic building, optimization, and implementation.
Sample Test Case:
Input: Custom Input
Output: Expected Output
Optimized Java Solution Template:
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Read input
        
        // Write optimized logic here
        
        // Print output
    }
}




Ques:  Write a program to check if two given matrices are identical

import java.util.*;
class Main 
{
    static int size=4;
    public static boolean areSame(int A[][], int B[][])
    {
        int i,j;
        for(i=0;i < size;i++)
        {
            for(j=0;j < size;j++)
                if(A[i][j]!=B[i][j])
                    return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int A[][]={{1,1,1,1},{2,2,2,2},{3,3,3,3,},{4,4,4,4}};
        int B[][]={{1,1,1,1},{2,2,2,2},{3,3,3,3,},{4,4,4,4}};
        if(areSame(A,B))
        {
            System.out.println("Matrices are identical");
        }
        else 
            System.out.println("Matrices are not identical");
    }
}


Move all zeros to the end of an array:


public class Solution {
    public void moveZeros(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[i];
                nums[i] = temp;
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0, 1, 0, 3, 12};
        s.moveZeros(nums);
        for (int num : nums) {
            System.out.print(num + " "); // 1 3 12 0 0
        }
    }
}


How it works:

1. nonZeroIndex tracks the position where the next non-zero element should go.

2. When a non-zero element is found, swap it with the element at nonZeroIndex.

3. All zeros end up at the end.


Time Complexity: O(n)
Space Complexity: O(1)





import java.util.Arrays;

public class FaultyPendulum {
    
    public static int[] arrangePendulum(int[] arr) {
        int n = arr.length;
        
        // Step 1: Sort the array in ascending order
        Arrays.sort(arr);
        
        // Step 2: Initialize the output array
        int[] result = new int[n];
        
        // Step 3: Find the center index for the minimum element
        // If n is odd, center is exactly mid. If even, it's (n-1)/2.
        int mid = (n - 1) / 2;
        
        // Place the absolute minimum value at the center
        result[mid] = arr[0];
        
        int right = 1; // Displacements to the right
        int left = 1;  // Displacements to the left
        
        // Step 4: Distribute elements alternately to right and left
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                // Odd iterations go to the right
                result[mid + right] = arr[i];
                right++;
            } else {
                // Even iterations go to the left
                result[mid - left] = arr[i];
                left++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Test case 1 (Odd length)
        int[] arr1 = {2, 3, 5, 1, 4};
        System.out.println("Original: " + Arrays.toString(arr1));
        System.out.println("Pendulum: " + Arrays.toString(arrangePendulum(arr1)));
        // Output should be: [5, 3, 1, 2, 4]

        System.out.println();

        // Test case 2 (Even length)
        int[] arr2 = {11, 12, 31, 14, 5, 20};
        System.out.println("Original: " + Arrays.toString(arr2));
        System.out.println("Pendulum: " + Arrays.toString(arrangePendulum(arr2)));
        // Sorted: [5, 11, 12, 14, 20, 31]
        // Mid index: (6-1)/2 = 2
        // Output should be: [20, 12, 5, 11, 14, 31]
    }
}



Problem Description

Given an array arr[] of n integers, arrange the elements of the array in a way similar to the to-and-fro movement of a Pendulum.

The rules for the arrangement are as follows:

Center Element: The minimum element out of the list must come at the center of the array. If the number of elements is even (n is even), the minimum element should be placed at the (n-1)/2 index (assuming 0-based indexing).

Right Placement: The next number in ascending order (the second smallest) goes to the right of the minimum element.

Left Placement: The next higher number (the third smallest) goes to the left of the minimum element.

To-and-Fro Cycle: This alternating pattern continues (right, then left, then right, etc.) as you move up to the highest numbers, mirroring the path of a swinging pendulum.

Expected Output

Return or print the final rearranged array following this pendulum logic.

Examples:

Example 1Input: arr[] = [1, 3, 2, 5, 4]Output: [5, 3, 1, 2, 4]

Explanation:

The minimum element is 1. It goes to the middle position: [_, _, 1, _, _].

The next higher element is 2. It goes to the right: [_, _, 1, 2, _].

The next higher element is 3. It goes to the left: [_, 3, 1, 2, _].

The next higher element is 4. It goes to the right: [_, 3, 1, 2, 4].

The largest element is 5. It goes to the left: [5, 3, 1, 2, 4].

Example 2
Input: arr[] = [11, 12, 31, 14, 5]Output: [31, 12, 5, 11, 14]

Explanation: The smallest element is 5, which sits in the center. The subsequent elements 11, 12, 14, and 31 alternate right and left.

Constraints1 ≤ n ≤ 10⁵\(1 \le arr[i] \le 10^5\)





find the maximum element in an array 


public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element: " + max); // 8
    }
}


 How it works
1. Assume 1st element is max.
2. Loop through rest of array.
3. Update max if you find bigg


---------------------------------

 Problem Statement
If 2+ elements occur equal max times, return all of them.


import java.util.*;

public class Main {
    public static List<Integer> majorityElements(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        int maxCount = 0;
        for (int c : count.values()) {
            maxCount = Math.max(maxCount, c);
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            if (e.getValue() == maxCount) {
                result.add(e.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 3};
        System.out.println(majorityElements(nums1)); // [2, 3]

        int[] nums2 = {1, 1, 1, 2, 2, 2};
        System.out.println(majorityElements(nums2)); // [1, 2]

        int[] nums3 = {1, 2, 3};
        System.out.println(majorityElements(nums3)); // [1, 2, 3]
    }
}


How it works
1. Count frequencies.
2. Find max count.
3. Collect elements with that count.



 Time Complexity: O(n)


-----------------------

 Frequency array works too, but you need to know range of numbers.

 When to use
- If numbers are non-negative and range is small we can use frq array.
- Else, HashMap  is safer.

 Java Code with Frequency Array

import java.util.*;

public class Main {
    public static List<Integer> majorityElements(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        int range = max - min + 1;
        
        int[] freq = new int[range];
        for (int n : nums) {
            freq[n - min]++;
        }

        int maxCount = 0;
        for (int c : freq) {
            maxCount = Math.max(maxCount, c);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < range; i++) {
            if (freq[i] == maxCount) {
                result.add(i + min);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 3};
        System.out.println(majorityElements(nums1)); // [2, 3]

        int[] nums2 = {1, 1, 1, 2, 2, 2};
        System.out.println(majorityElements(nums2)); // [1, 2]
    }
}


 Tradeoffs
- Array: Fast if range is small, else OOM.
- HashMap: Slower but handles any range.