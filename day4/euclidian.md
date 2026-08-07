Euclidean Algorithm -
Finds the Greatest Common Divisor (GCD) of two numbers.

How it works

1. gcd(a, b) = gcd(b, a % b)
2. Repeat until b = 0
3. a is the GCD

 Example: gcd(48, 18)

1. gcd(48, 18) → gcd(18, 48 % 18) = gcd(18, 12)
2. gcd(18, 12) → gcd(12, 18 % 12) = gcd(12, 6)
3. gcd(12, 6) → gcd(6, 12 % 6) = gcd(6, 0)
4. GCD = 6

public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("GCD(48, 18): " + gcd(48, 18)); // 6
    }
}


Time Complexity
- O(log min(a, b))  so O(log 18)


To find a missing number in a consecutive array in Java, the most efficient approach is the Sum Formula Method, which runs in O(N) time complexity and uses O(1) space. You calculate the mathematical sum of the expected range using \(\frac{N\times (N+1)}{2}\) and subtract the actual sum of the elements present in the array.


public class MissingNumberFinder {

    // Method to find the missing number in the array
    public static int findMissingNumber(int[] arr, int n) {
        // Step 1: Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;
        
        // Step 2: Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // Step 3: The difference is the missing number
        return expectedSum - arrActualSum;
    }

    // Main method to run and test the program
    public static void main(String[] args) {
        // Example 1: Array of numbers from 1 to 5, where 3 is missing
        int[] array1 = {1, 2, 4, 5};
        int n1 = 5; // Total elements expected in the sequence
        
        int missingNumber1 = findMissingNumber(array1, n1);
        System.out.println("The missing number in array1 is: " + missingNumber1);

        // Example 2: Unsorted array of numbers from 1 to 8, where 6 is missing
        int[] array2 = {8, 2, 4, 5, 3, 7, 1};
        int n2 = 8;
        
        int missingNumber2 = findMissingNumber(array2, n2);
        System.out.println("The missing number in array2 is: " + missingNumber2);
    }
}


Sum Formula Method works to find a missing number in a sequence from 1 to N.

The Core Logic

Imagine you have a box that should hold 5 items labeled 1, 2, 3, 4, and 5. 

If one item goes missing, you can easily find out which one it is by adding up what should be there 15 and subtracting what is actually there.

Step 1: Calculate the Expected Sum

We use a standard mathematical formula to find out what the total sum of all numbers from 1 to N
should be if no numbers were missing.

Formula: Expected Sum = N X (N + 1)/2)

Example: If N = 5, the formula calculates 5 X  6 /2 = 15.

int expectedSum = n * (n + 1) / 2;

Step 2: Calculate the Actual SumNext, the program looks at the array you actually provided and adds up all the numbers inside it.Example Array: {1, 2, 4, 5} (Notice 3 is missing).

Calculation: 1 + 2 + 4 + 5 = 12.

Code Implementation:

int actualSum = 0;
for (int num : arr) {
    actualSum += num;
}

Step 3: Subtract the Actual Sum from the Expected Sum

The difference between what you expect to have and what you actually have is your missing number.

Calculation: Expected Sum (15) - Actual Sum (12) = 3.

Result: The missing number is 3

Code Implementation:

return expectedSum - actualSum;

public class MissingNumberFinder {

    // Method to find the missing number in the array
    public static int findMissingNumber(int[] arr, int n) {
        // Step 1: Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;
        
        // Step 2: Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // Step 3: The difference is the missing number
        return expectedSum - arrActualSum;
    }

    // Main method to run and test the program
    public static void main(String[] args) {
        // Example 1: Array of numbers from 1 to 5, where 3 is missing
        int[] array1 = {1, 2, 4, 5};
        int n1 = 5; // Total elements expected in the sequence
        
        int missingNumber1 = findMissingNumber(array1, n1);
        System.out.println("The missing number in array1 is: " + missingNumber1);

        // Example 2: Unsorted array of numbers from 1 to 8, where 6 is missing
        int[] array2 = {8, 2, 4, 5, 3, 7, 1};
        int n2 = 8;
        
        int missingNumber2 = findMissingNumber(array2, n2);
        System.out.println("The missing number in array2 is: " + missingNumber2);
    }
}