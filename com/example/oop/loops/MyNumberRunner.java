package com.example.oop.loops;

public class MyNumberRunner {
    public static void main(String[] args) {

        MyNumber myNumber = new MyNumber(7);
//        System.out.println(myNumber.isPrime());

        System.out.println(MyNumberRunner.checkPrime(18));
    }

    private static boolean checkPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {

            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }


}
