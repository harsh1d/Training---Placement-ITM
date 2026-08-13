// product of all element except one element in the array

package day9.task1;

public class task12 {
    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }
        System.out.println(product);
    }
    
}
