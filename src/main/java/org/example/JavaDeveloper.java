package org.example;

public class JavaDeveloper extends Employee {
    public JavaDeveloper(String name) {
        super(name);
    }

    @Override
    public String GetPosition() {
        return "Java Developer ";
    }

    @Override
    public String GetSeniority() {
        return "Senior";
    }

    public String getInfo() {
        return (super.GetName() + " is a " + GetSeniority() + "  " + GetPosition());
    }

    ;
}
