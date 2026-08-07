Matrix Multiplication using the explicit pass-by-argument structure. If  dimensions are for rectangular matrices by tracking matrix.length for rows and matrix[0].length for columns.

=== Matrix A (2x3) ===
1	2	3	
4	5	6	

=== Matrix B (3x2) ===
7	8	
9	1	
2	3	

=== Resultant Product Matrix (2x2) ===
31	19	
85	55

uniques digit count

import java.util.ArrayList;
public class UniqueDigitsCount {
    public static int uniqueDigitsCount(int input1) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (input1 != 0){
            int digit = input1 % 10;
            if (!nums.contains(digit)) nums.add(digit);
            input1 /= 10;
        }
        return nums.size();
    }
}




public class NthPrime {
    public static int nthPrime(int input1) {
        int num = 1, count = 0, i;
        while(count < input1){
            num++;
            for (i = 2; i <= num; i++)
                if (num % i == 0) break;
            if (i == num) count++;
        }
        return num;
    }
}