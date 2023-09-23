package org.schoolMgmt;

public class Inheritance {
    public static void main(String[] args) {

        class Employee {
            private int age;
            private String name;
            // Overload: two constructors based on the amount of arguments given
            // (some consider this a polymorphism)
            public Employee () {}
            public Employee (int age, String name) {
                this.age = age;
                this.name = name;
            }

            public void show() {
                System.out.println(name + " is " + age + " years old");
            }
        }
        // Creating a Worker class that has Person as its superclass
        class Manager extends Employee {
            private String occupation;
            public Manager () {}
            public Manager (int age, String name, String occupation) {
                super(age, name);
                this.occupation = occupation;
            }
            // Overriding method from Person class
            @Override
            public void show() {
                super.show();
                System.out.println("Occupation: " + occupation);
            }
        }
        Manager m1 = new Manager (40, "Michael Scott", "Manager");
        Employee e1 = new Employee (28, "Jim Halpert");

        e1.show();
        m1.show();

    }
}
