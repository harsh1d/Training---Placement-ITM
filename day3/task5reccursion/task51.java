package day3.task5reccursion;

import java.util.*;

public class task51 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number :");
            int num  = sc.nextInt();
            int[] dp = new int[num];
            // Bottom-up approach using dp array
            for (int i = 0 ; i < num ; i++) {
                if (i == 0) {
                    dp[i] = 0;
                } else if (i == 1) {
                    dp[i] = 1;
                } else {
                    dp[i] = dp[i - 1] + dp[i - 2];
                }
                System.out.print(dp[i] + " ");
            }
        }
    }
}
