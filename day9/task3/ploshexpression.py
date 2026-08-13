from typing import List

class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        # Sample example:
        # Input: tokens = ["2", "1", "+", "3", "*"]
        # Explanation: ((2 + 1) * 3) = 9
        # Step by step:
        # - Push 2 onto stack: [2]
        # - Push 1 onto stack: [2, 1]
        # - See '+': pop 1 and 2, compute 2+1=3, push 3: [3]
        # - Push 3 onto stack: [3, 3]
        # - See '*': pop 3 and 3, compute 3*3=9, push 9: [9]
        # Output: 9
        stack = []
        for token in tokens:
            if token in "+-*/":
                b = stack.pop()
                a = stack.pop()
                if token == "+":
                    stack.append(a + b)
                elif token == "-":
                    stack.append(a - b)
                elif token == "*":
                    stack.append(a * b)
                else:  # division
                    stack.append(int(a / b))  # truncate toward zero
            else:
                stack.append(int(token))
        return stack[0]
