package com.example.oop;

public class MotorBike {

    // state
    private int speed;

    public void setSpeed(int speed) {
        if (speed > 0)
            this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    // behavior
    void start() {
        System.out.println("Bike started.");
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }
}
