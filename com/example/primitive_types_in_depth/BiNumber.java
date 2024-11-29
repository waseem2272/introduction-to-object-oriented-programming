package com.example.primitive_types_in_depth;

public class BiNumber {

    private int number1, number2;
    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int add() {
        return this.number1 + this.number2;
    }

    public int multiply() {
        return this.number1 * this.number2;
    }

    public void doubleValue() {
        this.number1 *= 2;
        this.number2 *= 2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }
}
