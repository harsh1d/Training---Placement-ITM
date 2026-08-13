package day9.task4;

public class PrimeFactorization {
    // PrimeFactorization: A class for finding prime factors of a number
    // Prime factorization is the process of breaking down a composite number into its prime factors
    // For example: 12 = 2 × 2 × 3, so the prime factors of 12 are 2, 2, and 3
    
    public static void findPrimeFactors(int number) {
        if (number <= 1) {
            System.out.println("Number must be greater than 1");
            return;
        }
        
        System.out.print("Prime factors of " + number + ": ");
        
        // Divide by 2 until the number is odd
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }
        
        // Check odd numbers starting from 3
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
        
        // If number is still greater than 2, it's a prime factor
        if (number > 2) {
            System.out.print(number);
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        findPrimeFactors(12);
        findPrimeFactors(60);
        findPrimeFactors(315);
        findPrimeFactors(17);
    }
}
