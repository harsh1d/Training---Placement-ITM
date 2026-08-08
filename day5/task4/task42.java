package day5.task4;

import java.util.Stack;

// Valid Parenthesis
// 1. Time Complexity: O(n) - We iterate through the string once, where n is the length of the string.
// - Stack operations (push, pop) take O(1) time.
// 2. Space Complexity: O(n) - In the worst case, we might push all characters onto the stack (e.g., "(((((").
// Optimization:
// - Pushed expected closing brackets onto the stack instead of opening ones. This allows a single comparison in the else case.
// Modified to use while loop with two pointer variable
public class task42 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        int n = s.length();
        while (i < n) {
            char c = s.charAt(i);
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
            i++;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        task42 s = new task42();
        System.out.println(s.isValid("()")); // true
        System.out.println(s.isValid("()[]{}")); // true
        System.out.println(s.isValid("(]")); // false
    }
}
