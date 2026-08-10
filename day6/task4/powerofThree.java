package day6.task4;

// Class to check if a number is a power of three
public class powerofThree {
    static class Solution{
        // Method to determine if a given number n is a power of three
        public boolean isPowerOfThree(int n){
            // If n is less than or equal to 0, it cannot be a power of three
            if (n <= 0){
                return false;
            }
            // Keep dividing n by 3 as long as it is divisible by 3
            while (n % 3 == 0){
                n /= 3;
            }
            // If n becomes 1, it means the original number was a power of three
            return n == 1;
        }
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(27)); // true
        System.out.println(solution.isPowerOfThree(0));  // false
        System.out.println(solution.isPowerOfThree(9));  // true
        System.out.println(solution.isPowerOfThree(45)); // false
    }
}
