package com.example.oop.level2;

public class BookRunner {
    public static void main(String[] args) {

        Book book = new Book(101, "C++ for Complete Beginners", "Joshua");
        book.addReview(new Review(10, "Great Book", 4.5f));
        book.addReview(new Review(15, "Awesome", 4.7f));
        System.out.println(book);
    }
}
