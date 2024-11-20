package com.example.oop;

public class MotorBikeRunner {
    public static void main(String[] args) {

        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(50);
        ducati.increaseSpeed(20);
        ducati.decreaseSpeed(130);
        System.out.println(ducati.getSpeed());

        honda.setSpeed(70);
        honda.increaseSpeed(30);
        honda.decreaseSpeed(120);
        System.out.println(honda.getSpeed());

    }
}
