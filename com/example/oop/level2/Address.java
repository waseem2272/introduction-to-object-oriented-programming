package com.example.oop.level2;

public class Address {

    private String line1;
    private String city;
    private int zip;

    public Address(String line1, String city, int zip) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {
        return String.format("Line 1: %s, City: %s, zip: %d", this.line1, this.city, this.zip);
    }
}
