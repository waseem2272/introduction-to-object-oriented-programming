package com.example.primitive_types_in_depth;

public class BiNumberRunner {

    public static void main(String[] args) {

        BiNumber biNumber = new BiNumber(2, 3);

        System.out.println(biNumber.add());
        System.out.println(biNumber.multiply());

        biNumber.doubleValue();

        System.out.println(biNumber.getNumber1());
        System.out.println(biNumber.getNumber2());
    }
}
