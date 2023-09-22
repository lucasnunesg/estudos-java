package org.schoolMgmt;

import java.util.ArrayList;

public class Department {
    String name;
    ArrayList<Student> students;

    /* Entender o motivo do array list estar contaminado, para funcionar precisamos inicializar o arraylist na função main*/
    Department (String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }


    void AddStudent(Student student) {
        students.add(student);
    }
    void departmentDetails() {
        System.out.println(name);
        System.out.println("Students within the " + name + " department: ");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
