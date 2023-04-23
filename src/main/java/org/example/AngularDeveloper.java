package org.example;

public class AngularDeveloper extends Employee {

    public AngularDeveloper(String name) {
        super(name);
    }

    @Override
    public String GetPosition() {
        return "Angular Developer ";
    }

    @Override
    public String GetSeniority() {
        return "Midle";
    }

    public String getInfo() {
        return (super.GetName() + " is a " + GetSeniority() + "  " + GetPosition());
    }

    ;
}
