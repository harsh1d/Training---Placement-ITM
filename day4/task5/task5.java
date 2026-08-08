// perfect number add sum of all its digit if the number and sum of digit is same then it is a perfect number
// A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself)
// For example: 6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14
// The instruction seems to describe a different concept - checking if a number equals the sum of its digits
// This implementation checks if a number is a perfect number (sum of proper divisors)

package day4.task5;

public class task5 {
    
    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }
        
        int sum = 0;
        // Find all divisors and add them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        // Check if sum of divisors equals the number
        return sum == number;
    }
    
    // Method to calculate sum of digits
    public static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number);
        
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        
        return sum;
    }
    
    // Method to check if number equals sum of its digits (as per instruction description)
    public static boolean isNumberEqualToSumOfDigits(int number) {
        return number == sumOfDigits(number);
    }
    
    public static void main(String[] args) {
        // Test perfect numbers
        System.out.println("Testing Perfect Numbers:");
        System.out.println("6 is perfect number: " + isPerfectNumber(6));
        System.out.println("28 is perfect number: " + isPerfectNumber(28));
        System.out.println("12 is perfect number: " + isPerfectNumber(12));
        
        // Test number equals sum of digits
        System.out.println("\nTesting Number Equals Sum of Digits:");
        System.out.println("0 equals sum of digits: " + isNumberEqualToSumOfDigits(0));
        System.out.println("1 equals sum of digits: " + isNumberEqualToSumOfDigits(1));
        System.out.println("10 equals sum of digits: " + isNumberEqualToSumOfDigits(10));
    }
    
}