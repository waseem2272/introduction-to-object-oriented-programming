package com.example.oop.level2;

import java.math.BigDecimal;

public class Review {

    private int id;
    private String review;
    private float rating;

    public Review(int id, String review, float rating) {
        this.id = id;
        this.review = review;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Review{" +
                "review='" + review + '\'' +
                ", rating=" + rating +
                '}';
    }
}
