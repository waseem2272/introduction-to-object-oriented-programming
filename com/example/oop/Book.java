package com.example.oop;

public class Book {
    private int noOfCopies;

    public Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        if (noOfCopies > 0)
            this.noOfCopies += noOfCopies;
    }

    public int getNoOfCopies() {
        return this.noOfCopies;
    }
}
