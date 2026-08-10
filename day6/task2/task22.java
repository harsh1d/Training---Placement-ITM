// find the sum of all negative number of errors 

package day6.task2;

public class task22 {
    public static int sumOfNegativeNumbers(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int sum = 0;
        for (int num : arr) {
            if (num < 0) {
                sum += num;
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};
        int result = sumOfNegativeNumbers(arr);
        System.out.println("Sum of all negative numbers: " + result);
    }
}
