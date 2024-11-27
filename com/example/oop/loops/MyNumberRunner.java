package com.example.oop.loops;

import java.util.Scanner;

public class MyNumberRunner {
    public static void main(String[] args) {

        MyNumber myNumber = new MyNumber(6);
        System.out.println(myNumber.isPrime());

        int sum = myNumber.sumUptoN();
        System.out.println("sumUptoN " + sum);

        int sumOfDivisors = myNumber.sumOfDivisors();
        System.out.println("sumOfDivisors " + sumOfDivisors);

        myNumber.printANumberTriangle();
    }
}
