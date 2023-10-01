package listExercise;

import java.util.*;

public class Main {

    public static boolean hasId(int id, ArrayList<Employee> list) {
        List<Integer> idList = new ArrayList<>();
        for (Employee emp : list) {
            idList.add(emp.getId());
        }
        return idList.contains(id);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
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
        /*
            - Validar se o ID existe;
            - Acessar a lista com base no ID;
            - Utilizar o método raise para aumentar o salário do funcionário com o ID fornecido.
         */
        Employee emp = employeeList.stream().filter(x -> x.getId() == idRaise).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("Please check employee ID");
        } else {
            System.out.print("Enter raise percentage: ");
            double percentage = sc.nextDouble();
            emp.raise(percentage);
        }
        System.out.println("List of employees:");
        for (Employee emp: employeeList) {
            System.out.println(emp);
        }
        sc.close();
    }
}
