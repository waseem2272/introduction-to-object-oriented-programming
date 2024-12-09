package com.example.oop.level2;

public class Customer {
    private String name;
    private Address homeAddress;
    private Address workAddress;

    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getHomeAddress() {
        return this.homeAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public Address getWorkAddress() {
        return this.workAddress;
    }

    public String toString() {
        return String.format("Name: %s, Home address: %s, Work address: %s",
                this.name, getHomeAddress(), getWorkAddress());
    }
}
