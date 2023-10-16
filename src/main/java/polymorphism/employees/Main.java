package polymorphism.employees;

import polymorphism.employees.entities.Employee;
import polymorphism.employees.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        ArrayList<Employee> employees = new ArrayList<>();
        Employee emp;

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced? (y/n): ");
            char outsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(outsourced == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
            } else {
                emp = new Employee(name, hours, valuePerHour);
            }

            employees.add(emp);

        }
        sc.close();

        System.out.println("PAYMENTS:");
        for (Employee e : employees){
            System.out.println(e.getName() + " - $ " + e.payment());
        }
    }
}
