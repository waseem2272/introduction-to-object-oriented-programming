package com.example.oop.level2;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return this.length * this.width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return String.format("Length - %d, Width - %d, area() - %d, perimeter() - %d",
                this.length, this.width, this.area(), this.perimeter());
    }
}
