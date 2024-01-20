package inheritance.schoolMgmt;

public class Student{
    String name;
    int age;
    Student(){}
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    void show() {
        System.out.println("Oi, eu sou " + name + ", tenho " + age + " anos de idade.");
    }
}