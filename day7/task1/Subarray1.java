package day7.task1;


// 2.
// Count the
// number of
// subarrays with
// a given sum

// -Logic:
// Use a
// HashMap to
// store the
// prefix sums
// and their frequencies.

import java.util.HashMap;
import java.util.Map;

public class Subarray1 {    
    public static int countSubarrays(int[] arr, int sum) {
        int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (map.containsKey(prefixSum - sum)) {
                count += map.get(prefixSum - sum);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 5;
        System.out.println("Number of subarrays with sum " + sum + ": " + countSubarrays(arr, sum));
    }
}
