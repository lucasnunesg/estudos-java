package polymorphism.taxes;

import polymorphism.taxes.entities.Company;
import polymorphism.taxes.entities.Individual;
import polymorphism.taxes.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        TaxPayer taxPayer;
        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){

            System.out.println("Tax Payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char taxPayerType = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual Income: ");
            Double annualIncome = sc.nextDouble();

            if (taxPayerType == 'i'){
                System.out.print("Health Expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                taxPayer = new Individual(name, annualIncome, healthExpenditures);
            } else{
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                taxPayer = new Company(name, annualIncome, numberOfEmployees);
            }
            taxPayerList.add(taxPayer);
        }
        sc.close();

        System.out.println();
        Double totalTaxes = 0.00;
        System.out.println("TAXES PAID");
        for (TaxPayer t : taxPayerList){
            System.out.printf("%s: $ %.2f", t.getName(), t.calculateTax());
            totalTaxes += t.calculateTax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);

    }
}
