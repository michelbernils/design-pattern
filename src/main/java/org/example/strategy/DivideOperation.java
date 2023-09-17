package org.example.strategy;

public class DivideOperation implements Operation {
    @Override
    public int execute(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }
}