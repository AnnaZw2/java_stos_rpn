package com.example;

public class MultiplyOperator implements Operator {
    @Override
    public int evaluate(int operand1, int operand2) {
        return operand1 * operand2;
    }
}
