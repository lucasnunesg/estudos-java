package interfaces2.application;

import interfaces2.model.entities.Contract;
import interfaces2.model.entities.Installment;
import interfaces2.model.services.ContractService;
import interfaces2.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Input Contract Data:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Contract Value: ");
        double value = sc.nextDouble();
        System.out.print("Amount of installments: ");
        int installmentAmount = sc.nextInt();

        Contract contract = new Contract(number, date, value);
        ContractService service = new ContractService();
        PaypalService payPalService = new PaypalService();

        service.processContract(contract, installmentAmount, payPalService);

        System.out.println("Installments");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment.getLocalDate() + " - " + String.format("%.2f", installment.getAmount()));
        }
        sc.close();
    }
}
