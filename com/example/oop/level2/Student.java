package com.example.oop.level2;

public class Student extends Person {

    private String collegeName;
    private int year;

    public Student(String name, String email, String phone, String collegeName, int year) {
        super(name, email, phone);
        this.collegeName = collegeName;
        this.year = year;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + super.getName() + '\'' +
                ", Email='" + super.getEmail() + '\'' +
                ", Phone='" + super.getPhone() + '\'' +
                ", College Name='" + this.getCollegeName() + '\'' +
                ", Year=" + this.getYear() +
                '}';
    }
}
