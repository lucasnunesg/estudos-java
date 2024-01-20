package inheritance.schoolMgmt;

import java.util.ArrayList;

public class Department {
    String name;
    ArrayList<Student> students;

    Department (String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Department name : " + name + '\'';
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
