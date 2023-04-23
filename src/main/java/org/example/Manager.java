package org.example;

public class Manager extends Employee {
    Employee[] team;
    final String lastName;

    public Manager(String lastName, String name) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String GetPosition() {
        return "Manager";
    }

    @Override
    public String GetSeniority() {
        return "Senior";
    }

    public void Getinfo() {
        System.out.println("Info");
    }

    public String GetLastName() {
        return lastName;
    }

    public String getInfo() {
        String members = "";
        for (int i = 0; i < team.length; i++) {
            members = members + team[i].GetName();
            if (i == team.length - 1)
                break;
            ;
            members = members + ", ";
        }
        return (super.GetName() + " is a " + GetSeniority() + "  " + GetPosition() + " and has a team of 4 members: [" + members + "]");
    }

    public void setTeamMembers(Employee... members) {
        team = new Employee[members.length];
        for (int i = 0; i < members.length; i++) {
            team[i] = members[i];
        }
    }
}
