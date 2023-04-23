package org.example;

public abstract class Employee {
    final private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }

    public String GetLastName() {
        return "";
    }

    public abstract String GetPosition();

    public abstract String GetSeniority();

    public String getInfo() {
        return "";
    }

    ;
}
