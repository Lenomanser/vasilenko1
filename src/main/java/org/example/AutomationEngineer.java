package org.example;

public class AutomationEngineer extends Employee {
    final String lastName;

    public AutomationEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String GetLastName() {
        return lastName;
    }

    @Override
    public String GetPosition() {
        return "Automation Engineer ";
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
