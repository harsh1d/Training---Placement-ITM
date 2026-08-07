package day4.task3;

public class isprime {
    public static int isPrime(int input1){
        int num = 1, count = 0, i;
        while (count < input1) {
            num++;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                count++;
            }
        }
        return num;
    }
}



// package day4.task3;

// public class isprime {

//     public static int isPrime(int input1) {
//         int num = 2, count = 0;
//         while (count < input1) {
//             boolean isDivisible = false;
//             for (int i = 2; i <= Math.sqrt(num); i++) {
//                 if (num % i == 0) {
//                     isDivisible = true;
//                     break;
//                 }
//             }
//             if (!isDivisible)
//                 count++;
//             num++;
//         }
//         return num - 1;
//     }

//     public static void main(String[] args) {
//         System.out.println(isPrime(10));
//     }
// }
