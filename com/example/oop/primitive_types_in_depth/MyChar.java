package com.example.oop.primitive_types_in_depth;

public class MyChar {

    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {

        if (this.ch == 'a' || this.ch == 'A' || this.ch == 'e' || this.ch == 'E' || this.ch == 'i' || this.ch == 'I'
        || this.ch == 'o' || this.ch == 'O' || this.ch == 'u' || this.ch == 'U')
            return true;

        return false;
    }

    public boolean isDigit() {
        return this.ch >= 48 && this.ch <= 57;
    }
}
