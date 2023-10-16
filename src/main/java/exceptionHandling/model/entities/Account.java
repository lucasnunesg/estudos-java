package exceptionHandling.model.entities;


import exceptionHandling.model.exceptions.WithdrawErrorException;

public class Account {

    private int number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){

    };

    public Account(int number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit (Double amount){
        balance += amount;
    }

    public void withdraw (Double amount) {


        if (amount > this.getWithdrawLimit()) {
            throw new WithdrawErrorException("The amount exceeds withdraw limit.");
        } else if (amount > this.getBalance()) {
            throw new WithdrawErrorException("Not enough balance.");
        }
        balance -= amount;
    }
}
