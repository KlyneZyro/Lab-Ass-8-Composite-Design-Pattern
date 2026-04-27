package main;

import java.util.ArrayList;
import java.util.List;

public class Department implements EducationalUnit {
    private String name;
    // A department contains teachers and students
    private List<EducationalUnit> members = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addUnit(EducationalUnit unit) {
        members.add(unit);
    }

    @Override
    public int getStudentCount() {
        int total = 0;
        for (EducationalUnit unit : members) {
            total += unit.getStudentCount();
        }
        return total;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalUnit unit : members) {
            total += unit.getBudget();
        }
        return total;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "[Department] " + name);
        for (EducationalUnit unit : members) {
            unit.displayDetails(indent + "  ");
        }
    }
}