package org.example.strategy;

public class AddOperation implements Operation {
    @Override
    public int execute(int num1, int num2) {
        return num1 + num2;
    }
}
