package org.schoolMgmt;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!"+"\n");
        // Press Ctrl+R or click the green arrow button in the gutter to run the code.

        Student a1 = new Student("Michael Scott", 40);
        a1.show();

        Student a2 = new Student("Jim Halpert", 28);
        a2.show();

        Department physicsDept = new Department("Physics");
        Department mathDept = new Department("Mathematics");

        physicsDept.AddStudent(a1);
        physicsDept.AddStudent(a2);

        mathDept.AddStudent(a1);

        physicsDept.departmentDetails();
        mathDept.departmentDetails();

        School s1 = new School("Scranton High", "Scranton-PA");

        s1.AddDept(physicsDept);
        s1.AddDept(mathDept);

        s1.ShowDept();


    }
}