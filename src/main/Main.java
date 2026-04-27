package main;

public class Main {
    public static void main(String[] args) {
        // 1. Create Leaves (Students and Teachers)
        Student s1 = new Student("Alice", "2024-001", 15000);
        Student s2 = new Student("Bob", "2024-002", 15000);
        Teacher t1 = new Teacher("Prof. Smith", "Java Programming", 45000);
        Teacher t2 = new Teacher("Dean Mike", "Management", 80000);

        // 2. Create a Department and add leaves
        Department csDept = new Department("Department of Computer Science");
        csDept.addUnit(s1);
        csDept.addUnit(s2);
        csDept.addUnit(t1);

        // 3. Create a College and add the department + a standalone teacher
        College engineeringCollege = new College("College of Informatics and Computing Studies");
        engineeringCollege.addUnit(csDept);
        engineeringCollege.addUnit(t2);

        // 4. Create the main University (which is just a massive College)
        College neu = new College("New Era University Main System");
        neu.addUnit(engineeringCollege);

        // --- DEMONSTRATION ---
        System.out.println("=== UNIVERSITY STRUCTURE ===");
        neu.displayDetails("");

        System.out.println("\n=== CALCULATIONS ===");
        System.out.println("Total Students in NEU: " + neu.getStudentCount());
        
        // Calculation check:
        // Prof. Smith (45k) + Dean Mike (80k) - Alice (15k) - Bob (15k) = 95,000
        System.out.println("Total Budget for NEU: PHP " + neu.getBudget());
    }
}