package com.example.oop.loops;

public class MyNumber {

    private int number;
    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {

        if (this.number <= 1) {
            return false;
        }

        for (int i = 2; i <= this.number / 2; i++) {
            if (this.number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
