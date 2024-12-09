package com.example.oop.level1;

public class BookRunner {
    public static void main(String[] args) {

        Book artOfComputerProgramming = new Book(20);
        Book effectiveJava = new Book(30);
        Book cleanCode = new Book(40);

        System.out.println(artOfComputerProgramming.getNoOfCopies());
        System.out.println(effectiveJava.getNoOfCopies());
        System.out.println(cleanCode.getNoOfCopies());

        artOfComputerProgramming.setNoOfCopies(200);
        System.out.println(artOfComputerProgramming.getNoOfCopies());

        effectiveJava.setNoOfCopies(100);
        System.out.println(effectiveJava.getNoOfCopies());

        cleanCode.setNoOfCopies(30);
        System.out.println(cleanCode.getNoOfCopies());

    }
}
