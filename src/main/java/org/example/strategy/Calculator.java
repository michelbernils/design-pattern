package org.example.strategy;

public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int calculate(int num1, int num2) {
        if (operation == null) {
            throw new UnsupportedOperationException("Nenhuma operação definida.");
        }
        return operation.execute(num1, num2);
    }
}
