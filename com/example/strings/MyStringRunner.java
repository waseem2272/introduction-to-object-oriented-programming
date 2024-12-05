package com.example.strings;

import java.util.List;

public class MyStringRunner {
    public static void main(String[] args) {

        String originalString = "This is a lot of text";

        MyString myString = new MyString(originalString);
        String string = "Madam";

        String string1 = "Listen";
        String string2 = "Silent";

        System.out.println("Original String: " + originalString);
        System.out.println("Total spaces: " + myString.countSpaces());
        System.out.println("Total vowels: " + myString.countVowels());
        System.out.println("Total digits: " + myString.countDigits());
        myString.printEvenLengthWords();
        System.out.println();
        System.out.println("After appended new String: " + myString.appendStringToAnotherString(originalString, " again", originalString.length() - 1));
        System.out.println("Is the " + string + " Palindrome? " + myString.isPalindrome(string));
        System.out.println("Are the " + string1 + " and " + string2 + " Anagrams? " + myString.isAnagram(string1, string2));

        String[] languages = {"Java", "C++", "Python"};
        System.out.println(String.join(" | ", languages));

        List<String> list = List.of("Java", "C++", "Python");
        System.out.println(String.join(", ", list));

        String str = "123";
        System.out.println(Double.valueOf(str));

    }
}
