package com.sunbeam;

public class main {
    public static void main(String[] args) {
        // Postfix evaluation
        String postfixExpression = "34+2*";
        int resultPostfix = PostfixEvaluation.evaluatePostfix(postfixExpression);
        System.out.println("Postfix Evaluation (" + postfixExpression + ") = " + resultPostfix);

        // Prefix evaluation
        String prefixExpression = "*+342";
        int resultPrefix = PrefixEvaluation.evaluatePrefix(prefixExpression);
        System.out.println("Prefix Evaluation (" + prefixExpression + ") = " + resultPrefix);
    }
}
