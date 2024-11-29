package com.example.loops;

public class WhileNumberPlayerRunner {
    public static void main(String[] args) {

        WhileNumberPlayer whileNumberPlayer = new WhileNumberPlayer(30);
        whileNumberPlayer.printSquaresUpToLimit();
        System.out.println();
        whileNumberPlayer.printCubesUpToLimit();
    }
}
