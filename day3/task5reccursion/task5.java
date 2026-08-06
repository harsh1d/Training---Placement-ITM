package day3.task5reccursion;

public class task5 {
    static class SumRecursion {
        static int sum(int n) {
            if (n <= 0) {
                return 0;
            }
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = SumRecursion.sum(5);
        System.out.println("Sum of numbers from 1 to 5 is: " + result);
    }
}
    
