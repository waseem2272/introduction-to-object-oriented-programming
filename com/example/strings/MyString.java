package com.example.strings;

import java.util.Arrays;

public class MyString {

    private String str;

    public MyString(String str) {
        this.str = str;
    }

    public int countVowels() {

        int countVowels = 0;

        for (int i = 0; i < this.str.length(); i++) {

            if ("aeiouAEIOU".indexOf(this.str.charAt(i)) != -1) {
                countVowels++;
            }
        }
        return countVowels;
    }

    public int countSpaces() {

        int countSpaces = 0;

        for (int i = 0; i < this.str.length(); i++) {

            if (this.str.charAt(i) == ' ') {
                countSpaces++;
            }
        }
        return countSpaces;
    }

    public int countDigits() {

        int countDigits = 0;

        for (int i = 0; i < this.str.length(); i++) {

            char charAtIndex = this.str.charAt(i);

            if (charAtIndex >= 48 && charAtIndex <= 57) {
                countDigits++;
            }
        }
        return countDigits;
    }

    public void printEvenLengthWords() {

        // split the words by spaces
        String[] words = this.str.split(" ");

        System.out.println("Even words");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.print(word + " ");
            }
        }
    }

    public String appendStringToAnotherString(String originalString, String stringToAppend, int index) {

        for (int i = 0; i < this.str.length(); i++) {
            if (i == index) {
                originalString += stringToAppend;
            }
        }
        return originalString;
    }

    public boolean isPalindrome(String palindrome) {

        if (palindrome == null || palindrome.isEmpty())
            return false;

        int left = 0;
        int right = palindrome.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(palindrome.charAt(left)) != Character.toLowerCase(palindrome.charAt(right)))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public boolean isAnagram(String string1, String string2) {

        // guard check
        if (string1 == null || string2 == null || string1.length() != string2.length()) {
            return false; // Strings must be of the same length
        }

        // Convert strings to lowercase to make it case-insensitive
        char[] charArray1 = string1.toLowerCase().toCharArray();
        char[] charArray2 = string2.toLowerCase().toCharArray();

        // sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public String removeLeadingZeros(String strWithLeadingZeros) {

        if (strWithLeadingZeros == null || strWithLeadingZeros.isEmpty())
            return "Error";

        int i = 0;
        while (i < strWithLeadingZeros.length() && strWithLeadingZeros.charAt(i) == '0')
            i++;

        StringBuilder sb = new StringBuilder(strWithLeadingZeros);

        sb.replace(0, i, "");

        return sb.toString();
    }

    public String sortString(String string1) {

        char[] charArray = string1.toLowerCase().toCharArray();

        Arrays.sort(charArray);

        return String.valueOf(charArray);
    }

    public String sortDigits(Integer integer) {

        char[] charArray = integer.toString().toCharArray();

        Arrays.sort(charArray);

        return String.valueOf(charArray);
    }
}
