// how many masters are there ?
// how to count vowels 
// take array of 5 values for the vowels 
package day9.task1;

public class task1 {
    public static void main(String[] args) {
        String str = "how many masters are there";
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (ch == vowels[j]) {
                    count++;
                }
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
