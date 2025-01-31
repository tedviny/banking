package org.example;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Le solde initial ne peut pas etre etre négatif");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Le montant du dépot ne peut pas etre négatif");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Le montant du retrait ne peut pas etre négatif");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Le montant du retrait ne peut pas etre supérieur au solde");
        }
        balance -= amount;
    }

    public void transfer(double amount, BankAccount otherBankAccount) {
        withdraw(amount);
        otherBankAccount.deposit(amount);
    }

}
