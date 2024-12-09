package com.example.oop.level2;

public class BookRunner {
    public static void main(String[] args) {

        Book bookC = new Book(101, "C++ for Complete Beginners", "Joshua");
        Book bookJava = new Book(102, "Java Basics", "Herbert");

        bookC.addReview(new Review(10, "Great Book", 4.5f));
        bookC.addReview(new Review(15, "Awesome", 4.7f));

        bookJava.addReview(new Review(15, "Great Book", 4.8f));
        bookJava.addReview(new Review(20, "Awesome", 4.6f));

        System.out.println(bookC);
        System.out.println(bookJava);
    }
}
