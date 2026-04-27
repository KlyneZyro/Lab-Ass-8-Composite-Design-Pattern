# Lab-Ass-8-Composite-Design-Pattern

New Era University Organizational System
This repository contains an implementation of the Composite Design Pattern to model the hierarchical structure of New Era University.

Problem Description
New Era University is composed of various organizational units. These units can be either individual entities or compositions of other entities. The system represents the following:

Colleges: A high-level organizational unit (e.g., "College of Engineering", "College of Business"). A College can contain departments, teachers, and students. It can also contain other Colleges.

Departments: A subdivision within a College focusing on a specific subject (e.g., "Department of Computer Science"). A department can contain teachers and students.

Teachers: An individual entity responsible for instructing students. Each teacher has a name, a subject they teach, and a salary.

Students: An individual entity enrolled in a College or department. Each student has a name, a unique student ID, and pays a tuition fee.

Requirements
1. Model the Hierarchical Structure
The system must accurately represent the "part-whole" relationship between the different entities (e.g., a College "has-a" department, a department "has-a" teacher).

2. Calculate the Number of Students
The system should be able to calculate the total number of students within any given College, including students in its departments and any sub-Colleges.

3. Display Details
The system should be able to display the details of any educational unit (College, department, teacher, or student) in a clear and organized manner.

4. Calculate the Budget
The system should be able to calculate the total budget for a College:

College/Department Budget: The sum of the budgets of its internal units.

Teacher Budget: Their total salary.

Student Budget: The negative value of their tuition fee.

Tasks Implemented
[x] Design a UML Class Diagram: Illustrating the classes, interfaces, and relationships (Aggregation and Realization) involved in the system.

[x] Java Implementation: A complete implementation of the design adhering to the Composite Design Pattern.

[x] Client Program: A demonstration program that:

Creates instances of Colleges, departments, teachers, and students.

Organizes instances into a hierarchical structure.

Displays the details of a College.

Calculates and displays the total number of students.

Calculates and displays the total budget.

<img width="5421" height="2818" alt="Composite Design Pattern" src="https://github.com/user-attachments/assets/27e31bc5-5f5c-493b-861f-d305b3a40a7e" />
