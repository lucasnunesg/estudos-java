package bankExercise;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Account data:\nAccount: %d, Holder: %s, Balance: $ %.2f", accountNumber, accountHolder, balance);
        /*
        return "Account data:"+ "\n" +
                "Account: " +
                accountNumber +
                ", Holder: " + accountHolder +
                ", Balance: $ " + balance;
        */
    }
}
