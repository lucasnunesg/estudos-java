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

        //physicsDept.students.add(a1); DELETAR ESSA LINHA
        //mathDept.students.add(a2); //DELETAR ESSA LINHA
        //noinspection MismatchedQueryAndUpdateOfCollection
        /*ArrayList<Student> students = new ArrayList<>(); TIRAR COMENTÁRIO DESSAS LINHAS
        students.add(a1);
        students.add(a2);*/



        physicsDept.AddStudent(a1); //DELETAR ESSA LINHA
        physicsDept.AddStudent(a2); //DELETAR ESSA LINHA

        mathDept.AddStudent(a1);

        physicsDept.departmentDetails();
        mathDept.departmentDetails();


    }
}