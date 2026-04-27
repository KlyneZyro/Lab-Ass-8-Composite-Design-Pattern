package main;

import java.util.ArrayList;
import java.util.List;

public class College implements EducationalUnit {
    private String name;
    // A college can contain departments, teachers, students, and other colleges
    private List<EducationalUnit> units = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void addUnit(EducationalUnit unit) {
        units.add(unit);
    }

    @Override
    public int getStudentCount() {
        int total = 0;
        for (EducationalUnit unit : units) {
            total += unit.getStudentCount();
        }
        return total;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalUnit unit : units) {
            total += unit.getBudget();
        }
        return total;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "[[College]] " + name);
        for (EducationalUnit unit : units) {
            unit.displayDetails(indent + "  ");
        }
    }
}