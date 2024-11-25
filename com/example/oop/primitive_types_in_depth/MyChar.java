package com.example.oop.primitive_types_in_depth;

public class MyChar {

    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {

        if (this.ch == 'a' || this.ch == 'A' || this.ch == 'e' || this.ch == 'E' || this.ch == 'i'
                || this.ch == 'I' || this.ch == 'o' || this.ch == 'O' || this.ch == 'u' || this.ch == 'U')
            return true;

        return false;
    }

    public boolean isDigit() {
        // checks for 0-9 unicode
        return this.ch >= 48 && this.ch <= 57;
    }

    public boolean isAlphabet() {
        // between 'a' to 'z'
        if (this.ch >= 97 && this.ch <= 122)
            return true;

        // between 'A' to 'Z'
        if (this.ch >= 65 && this.ch <= 90)
            return true;

        return false;
    }

    public boolean isConsonant() {
        if (!this.isVowel())
            return true;

        return false;
    }

    public static void printLowerCaseAlphabets() {
        // 'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    public static void printUpperCaseAlphabets() {
        // 'A' to 'Z'
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}
