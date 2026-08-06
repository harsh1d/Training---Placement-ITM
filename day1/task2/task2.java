// give a code in which take input count the number of digit , sum it and reverse it 

package day1.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Count the number of digits
        int count = 0;
        int temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        System.out.println("Number of digits: " + count);
        
        // Calculate the sum of digits
        int sum = 0;
        temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);
        
        // Reverse the number
        int reverse = 0;
        temp = num;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reversed number: " + reverse);
        
        sc.close();
    }
}
