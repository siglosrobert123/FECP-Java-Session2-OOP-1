package org.example;

public class BankAccount {
    private int accountNumber;
    private String bankAccountHolderName;
    private double availableBalance;


    BankAccount(int accountNumber, String bankAccountHolderName, double initialDeposit){
        this.accountNumber = accountNumber;
        this.bankAccountHolderName = bankAccountHolderName;
        this.availableBalance = initialDeposit;
    }

    BankAccount(int accountNumber, String bankAccountHolderName){
        this.accountNumber = accountNumber;
        this.bankAccountHolderName = bankAccountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankAccountHolderName() {
        return bankAccountHolderName;
    }

    public void setBankAccountHolderName(String bankAccountHolderName) {
        this.bankAccountHolderName = bankAccountHolderName;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
}
