package main;

import java.util.List;
import java.util.ArrayList;

// The Component
public interface EducationalUnit {
    int getStudentCount();
    double getBudget();
    void displayDetails(String indent);
}