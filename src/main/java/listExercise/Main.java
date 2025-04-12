package listExercise;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Employee #%d:%n", i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employeeList.add(new Employee(id, name, salary));
        }
        System.out.print("Enter employee ID that will have salary increase: ");
        int idRaise = sc.nextInt();

        Employee emp = employeeList.stream().filter(x -> x.getId() == idRaise).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("Please check employee ID");
        } else {
            System.out.print("Enter raise percentage: ");
            double percentage = sc.nextDouble();
            emp.raise(percentage);
        }
        System.out.println("List of employees:");
        for (Employee x : employeeList) {
            System.out.println(x);
        }
        sc.close();
    }
}
