package com.example.oop.level2;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private int id;
    private String name;
    private String author;

    private List<Review> reviews;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview(Review review) {
        if (this.reviews == null) {
            this.reviews = new ArrayList<>();
        }
        this.reviews.add(review);
    }

    public String toString() {
        return String.format("Name: %s, Author: %s, Reviews: %s",
                this.name, this.author, this.reviews);
    }
}
