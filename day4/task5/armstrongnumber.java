package day4.task5;

public class armstrongnumber {
    // An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits
    // For example: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
    
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }
    
    public static void main(String[] args) {
        int num = 153;
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
        
        // Print Armstrong numbers between 1 and 1000
        System.out.println("\nArmstrong numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
