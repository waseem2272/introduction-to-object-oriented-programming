package com.example.loops;

public class MyNumber {

    private int number;

    public MyNumber() {}
    public MyNumber(int number) {
        this.number = number;
    }

//    public boolean isPrime() {
//
//        if (this.number <= 1) {
//            return false;
//        }
//
//        for (int i = 2; i <= this.number / 2; i++) {
//            if (this.number % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }

    // another way
    public boolean isPrime() {
        if (this.number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(this.number); i++) {
            if (this.number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumUptoN() {
        // 1 + 2 + 3 + 4 ... n
        int sum = 0;
        for (int i = 1; i <= this.number; i++) {
            sum += i;
        }
        return sum;
    }

    public int sumOfDivisors() {

        // sum of the number except 1 and number itself
        int sum = 0;

        for (int i = 2; i <= this.number - 1; i++) {
            if (this.number % i == 0) {
                System.out.println("Divisors: " + i);
                sum += i;
            }
        }
        return sum;
    }

    public void printANumberTriangle() {

        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        for (int i = 1; i <= this.number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
