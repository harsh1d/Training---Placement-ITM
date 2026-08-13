package day9.task3;
    
import java.util.Stack;
    
// Main class for task3
public class task3 {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Create a new Solution object
        Solution sol = new Solution();
        // Define an array of tokens representing a Reverse Polish Notation expression
        String[] tokens = { "2", "1", "+", "3", "*" };
        // Evaluate the RPN expression and print the result
        System.out.println(sol.evalRPN(tokens));
    }
    
    // Inner static class containing the solution logic
    static class Solution {
        // Method to evaluate a Reverse Polish Notation expression
        public int evalRPN(String[] tokens) {
            // Create a stack to store integer operands
            Stack<Integer> stack = new Stack<>();
    
            // Iterate through each token in the input array
            for (String token : tokens) {
                // Check if the token is an addition operator
                if (token.equals("+")) {
                    // Pop two operands, add them, and push the result back
                    stack.push(stack.pop() + stack.pop());
                // Check if the token is a subtraction operator
                } else if (token.equals("-")) {
                    // Pop the second operand
                    int b = stack.pop();
                    // Pop the first operand
                    int a = stack.pop();
                    // Subtract b from a and push the result
                    stack.push(a - b);
                // Check if the token is a multiplication operator
                } else if (token.equals("*")) {
                    // Pop two operands, multiply them, and push the result back
                    stack.push(stack.pop() * stack.pop());
                // Check if the token is a division operator
                } else if (token.equals("/")) {
                    // Pop the second operand (divisor)
                    int b = stack.pop();
                    // Pop the first operand (dividend)
                    int a = stack.pop();
                    // Divide a by b and push the result
                    stack.push(a / b);
                // If the token is not an operator, it must be a number
                } else {
                    // Parse the token as an integer and push it onto the stack
                    stack.push(Integer.parseInt(token));
                }
            }

            // Pop and return the final result from the stack
            return stack.pop();
        }
    }
}   
