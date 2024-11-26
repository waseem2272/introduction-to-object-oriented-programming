package com.example.oop.loops;

public class MyNumber {

    private int number;
    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (this.number <= 1) { // 0 and 1 are not prime
            return false;
        }
        for (int i = 2; i * i <= this.number; i++) { // Check divisors up to √number
            if (this.number % i == 0) {
                return false; // Divisible by i, not a prime number
            }
        }
        return true; // No divisors found, it's a prime number
    }

}
