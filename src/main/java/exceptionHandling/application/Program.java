package exceptionHandling.application;

import exceptionHandling.model.entities.Account;
import exceptionHandling.model.exceptions.WithdrawErrorException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data:");
        System.out.print("Number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(accountNumber, holder, initialBalance, withdrawLimit);


        System.out.print("Enter amount for withdraw: ");
        double withdrawAmount = sc.nextDouble();

        try {
            account.withdraw(withdrawAmount);
        }
        catch (WithdrawErrorException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
