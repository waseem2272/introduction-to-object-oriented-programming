package com.example.oop.level2;

public class CustomerRunner {
    public static void main(String[] args) {

        Address homeAddress = new Address("Line 1", "Karachi", 700005);
        Address workAddress = new Address("Zamzama", "Karachi", 700003);
        Customer customer = new Customer("Waseem", homeAddress);
        System.out.println(customer);
    }
}
