package listExercise;

public class Employee {
    private int id;
    private String name;
    private double salary;


    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void raise (double percentage) {
        this.salary = salary*(1+percentage/100);
    }

    @Override
    public String toString() {
        return String.format("%d: %s, %.2f", id, name, salary);
    }
}
