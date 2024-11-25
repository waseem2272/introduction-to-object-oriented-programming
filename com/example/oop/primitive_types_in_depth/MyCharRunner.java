package com.example.oop.primitive_types_in_depth;

import java.util.Set;

public class MyCharRunner {
    public static void main(String[] args) {

        MyChar myChar = new MyChar('c');
        System.out.println(myChar.isVowel());

        System.out.println(myChar.isDigit());

        System.out.println(myChar.isAlphabet());

        System.out.println(myChar.isConsonant());

        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();
    }
}
