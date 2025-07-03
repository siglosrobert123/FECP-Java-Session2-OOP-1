package org.example;

public class BankAccount {
    private String accountNumber;
    private String bankAccountHolderName;
    private double availableBalance;


    BankAccount(String accountNumber, String bankAccountHolderName, double initialDeposit){
        this.accountNumber = accountNumber;
        this.bankAccountHolderName = bankAccountHolderName;
        this.availableBalance = initialDeposit;
    }

    BankAccount(String accountNumber, String bankAccountHolderName){
        this.accountNumber = accountNumber;
        this.bankAccountHolderName = bankAccountHolderName;
    }

    public void deposit(double depositAmount){
        //Validate deposit amount must greater than 0
        if (depositAmount <= 0) {
            System.out.println("Deposit Amount must be greater than 0.");
            return;
        }
        else{
            this.availableBalance += depositAmount;
        }
    }

    public void withdraw(double withdrawAmount){
        //Validate withdraw amount must be less than or equal to available balance
        if (withdrawAmount > availableBalance){
            System.out.println("Withdraw Amount is greater than Available Balance.");
            return;
        }
        else{
            this.availableBalance -= withdrawAmount;
        }
    }

    public void displayInformation(){
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println("Bank Account Holder Name: " + this.getBankAccountHolderName());
        System.out.println("Available Balance: " + this.getAvailableBalance());
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
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
