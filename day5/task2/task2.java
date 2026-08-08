// reverse string the stack method is used to reverse a string by utilizing the stack data structure. The idea is to push each character of the string onto the stack and then pop them off in reverse order, effectively reversing the string.
// convert the string into character array and push each character onto the stack. Then, pop each character from the stack and append it to a new string, which will be the reversed version of the original string.
package day5.task2;

import java.util.Stack;

public class task2 {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        
        // Push each character onto the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        
        // Pop each character from the stack and build the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
