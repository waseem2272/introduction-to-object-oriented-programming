package com.example.strings;

public class MyStringRunner {
    public static void main(String[] args) {

        String originalString = "This is a lot of text";

        MyString myString = new MyString(originalString);
        String palindrome = "MadaM";

        System.out.println("Original String: " + originalString);
        System.out.println("Total spaces: " + myString.countSpaces());
        System.out.println("Total vowels: " + myString.countVowels());
        System.out.println("Total digits: " + myString.countDigits());
        myString.printEvenLengthWords();
        System.out.println();
        System.out.println("After appended new String: " + myString.appendStringToAnotherString(originalString, " again", originalString.length() - 1));
        System.out.println("Is " + palindrome + " Palindrome: " + myString.isPalindrome(palindrome));
    }
}
