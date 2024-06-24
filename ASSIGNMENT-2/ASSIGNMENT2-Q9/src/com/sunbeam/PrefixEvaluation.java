package com.sunbeam;

import java.util.Stack;

public class PrefixEvaluation {
    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert char to integer value
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                int result = applyOperation(ch, operand1, operand2);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    private static int applyOperation(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
