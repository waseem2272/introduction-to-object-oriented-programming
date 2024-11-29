package com.example.strings;

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



        return false;
    }
}
