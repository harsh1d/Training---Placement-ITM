// for loop for reversing the string "Twinkle Twinkle Little Star"

package day5.task2;

public class task23 {
    public static void main(String[] args) {
        String str = "Twinkle Twinkle little Star ";
        String reversed = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
