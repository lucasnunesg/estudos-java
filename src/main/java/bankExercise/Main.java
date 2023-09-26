package bankExercise;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double initialDeposit = 0;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char depositCheck = sc.next().charAt(0);

        if (depositCheck == 'y'){
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
        }

        Account account = new Account(accountNumber,accountHolder,initialDeposit);
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double newDeposit = sc.nextDouble();
        account.deposit(newDeposit);
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println(account);
        sc.close();

    }
}
