package ru.gb.homeworkapp.hw5;

import java.util.Arrays;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private int cellNumber;
    private int salary;
    private int age;


    public Employee(String firstName, String lastName, String position, String email, int cellNumber, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.cellNumber = cellNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }



    public void info() {
        System.out.println("lastName: " + lastName +" ;firstName: " + firstName + "; position: " + position + "; email: " + email + "; sellNumber " + cellNumber + "; salary: " + salary + "; age:  " + age);
    }







}




