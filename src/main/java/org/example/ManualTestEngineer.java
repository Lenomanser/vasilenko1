package org.example;

public class ManualTestEngineer extends Employee {
    final String lastName;

    public ManualTestEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String GetPosition() {
        return "Manual Test Engineer ";
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
