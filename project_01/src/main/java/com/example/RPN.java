package com.example;

public class RPN {

    Stack stack = new Stack();

   

    public int calculate(String[] expression) {
        if (expression == null || expression.length == 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < expression.length; i++) {
            stack.push(expression[i]);

        }

        while (stack.size() > 1) {
            String operator = stack.pop();
            String operand2 = stack.pop();

            String operand1 = stack.pop();

            if (!operand1.matches("[0-9]+") || !operand2.matches("[0-9]+") || operator == null) {
                throw new IllegalArgumentException();
            } else {
                int result = mathOperation(operator, operand1, operand2);
                stack.push(String.valueOf(result));
            }

        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException();
        }

        return Integer.parseInt(stack.pop());

    }

    private int mathOperation(String operator, String operand1, String operand2) {

        int operand11 = Integer.parseInt(operand1);
        int operand22 = Integer.parseInt(operand2);

        switch (operator) {
            case "+":
                AddOperator addOperator = new AddOperator();
                return addOperator.evaluate(operand11, operand22);
            case "-":
                SubtractOperator subOperator = new SubtractOperator();
                return subOperator.evaluate(operand11, operand22);
            case "*":
                MultiplyOperator mulOperator = new MultiplyOperator();
                return mulOperator.evaluate(operand11, operand22);

            default:
                throw new IllegalArgumentException();
        }
    }

}
