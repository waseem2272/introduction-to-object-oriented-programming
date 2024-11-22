package com.example.oop.primitive_types_in_depth;

public class MyCharRunner {
    public static void main(String[] args) {

        MyChar myChar = new MyChar('9');
        System.out.println(myChar.isVowel());

        System.out.println(myChar.isDigit());
    }
}
