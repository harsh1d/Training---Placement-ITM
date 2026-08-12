// TCS An Equilibrium Index of an array is an index such that the sum of elements at lower indices is equal to the sum of elements at higher indices.

// TCS NQT often tests this problem because it filters out candidates who use a brute-force O(N²)approach instead of the optimized linear approach.

// The Optimal Logic

// Calculate Total Sum:

// Find the sum of the entire array first.Track Left Sum:

// Start iterating from left to right,maintaining a running leftSum.

// Calculate Right Sum:At any index i,the rightSum is simply totalSum-leftSum-arr[i].

// Compare:If leftSum==rightSum,you found an equilibrium index.

// Optimized Java Solution(O(N)Time,O(1)Space)

package day8.task2;

public class task2 {
    
    public static int findEquilibriumIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        
        // Calculate total sum
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
        // Track left sum and find equilibrium index
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            // Calculate right sum: totalSum - leftSum - arr[i]
            int rightSum = totalSum - leftSum - arr[i];
            
            // Compare: if leftSum == rightSum, equilibrium index found
            if (leftSum == rightSum) {
                return i;
            }
            
            // Update left sum for next iteration
            leftSum += arr[i];
        }
        
        return -1; // No equilibrium index found
    }
    
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int result = findEquilibriumIndex(arr);
        
        if (result != -1) {
            System.out.println("Equilibrium index found at: " + result);
        } else {
            System.out.println("No equilibrium index found");
        }
    }
}
