package com.antonchar.restgen.domain;

import java.util.Random;

public class Employee {

    private static final Random rand = new Random();

    private int id;
    private String name;
    private String surname;
    private int age;
    private int departmentNr;

    public Employee() {
    }

    public Employee(int id) {
        this.id = id;
        this.name = "Name-" + id;
        this.surname = "Surname-" + id;
        this.age = rand.nextInt(50) + 18;
        this.departmentNr = rand.nextInt(3) + 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDepartmentNr() {
        return departmentNr;
    }

    public void setDepartmentNr(int departmentNr) {
        this.departmentNr = departmentNr;
    }
}
