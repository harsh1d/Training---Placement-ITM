Stacks: Reverse Polish Notation
LeetCode #150 - Medium difficulty

Reverse Polish Notation (RPN): Postfix expression evaluation.

Example:  3 4 + 5 *  → (3+4)*5 = 35

 Evaluation Algo
1. Use stack
2. Scan tokens:
    - Operand → push
    - Operator → pop 2, apply, push result


import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for (String t : tokens) {
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int b = stk.pop();
                int a = stk.pop();
                switch(t) {
                    case "+": stk.push(a+b); break;
                    case "-": stk.push(a-b); break;
                    case "*": stk.push(a*b); break;
                    case "/": stk.push(a/b); break;
                }
            } else {
                stk.push(Integer.parseInt(t));
            }
        }
        return stk.pop();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(sol.evalRPN(tokens)); // (2+1)*3 = 9
    }
}


----------

Postfix Notation : Operators follow operands. 
Example:    A B +   means   A + B

 Infix vs Postfix
- Infix:   A + B * C  →  A B C * +  (Postfix)
- Infix:   (A + B) * C  →  A B + C *  (Postfix)


1. Use stack
2. Scan postfix left-to-right:
    - Operand → push
    - Operator → pop 2, apply, push result


import java.util.Stack;

class Solution {
    public int evalPostfix(String[] exp) {
        Stack<Integer> stk = new Stack<>();
        for (String t : exp) {
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int b = stk.pop();
                int a = stk.pop();
                switch(t) {
                    case "+": stk.push(a+b); break;
                    case "-": stk.push(a-b); break;
                    case "*": stk.push(a*b); break;
                    case "/": stk.push(a/b); break;
                }
            } else {
                stk.push(Integer.parseInt(t));
            }
        }
        return stk.pop();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] exp = {"2", "3", "1", "*", "+"}; // (3*1)+2 = 5
        System.out.println(sol.evalPostfix(exp)); // 5
    }
}


   OK break down postfix evaluation with example:   
   2 3 1 * +
   -Empty Stack:  []
1.    2 → push(2) → [2]
2.    3 → push(3) → [2, 3]
3.    1 → push(1) → [2, 3, 1]
4.    * → pop(1,3), 3*1=3, push(3) → [2, 3]
5.    + → pop(3,2), 2+3=5, push(5) → [5]

- Result:  5