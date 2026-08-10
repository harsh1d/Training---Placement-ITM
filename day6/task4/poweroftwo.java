package day6.task4;

// Class to check if a number is a power of two
public class poweroftwo {
    static class Solution{
        // Method to determine if a given number n is a power of two
        public boolean isPowerOfTwo(int n){
            // If n is less than or equal to 0, it cannot be a power of two
            if (n <= 0){
                return false;
            }
            // Keep dividing n by 2 as long as it is divisible by 2
            while (n % 2 == 0){
                n /= 2;
            }
            // If n becomes 1, it means the original number was a power of two
            return n == 1;
        }
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfTwo(16)); // true
        System.out.println(solution.isPowerOfTwo(0));  // false
        System.out.println(solution.isPowerOfTwo(8));  // true
        System.out.println(solution.isPowerOfTwo(18)); // false
    }
}
