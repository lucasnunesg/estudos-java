package inheritance.schoolMgmt;

import java.util.ArrayList;

public class School {
    String name;
    String address;
    ArrayList<Department> departments;

    School (String name, String address) {
        this.name = name;
        this.address = address;
        this.departments = new ArrayList<>();
    }
    void AddDept(Department dept) {
        departments.add(dept);
    }

    @Override
    public String toString() {
        return "School name : '" + name + '\'' +
                "Main address='" + address + '\'' +
                "Departments that belong to this school: " + departments + '\'' ;
    }

    void ShowDept() {
        System.out.println("Departments registered for " + this.name + ":" + '\'');
        for (Department department : departments) {
            System.out.println(department.toString());
        }
    }

}
