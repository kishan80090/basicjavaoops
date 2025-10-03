package javaprojects;

import java.io.Serializable;
import java.util.Scanner;

public class BankAccounts implements Serializable {

    public static final long serialVersionUID = 1;
    private Person customer;
    private int balance;
    private String account;

    public BankAccounts() throws InvalidAgeException, InvalidMobileNumberException, NegativeNumberException,
            NumberFormatException {
        Scanner s = new Scanner(System.in);
        this.customer = new Person();
        System.out.print("Enter the account number : ");
        this.account = s.nextLine();
        System.out.print("Enter the balance : ");
        int balance = Integer.parseInt(s.nextLine());
        Validations.isInvalidAmount(balance);
        this.balance = balance;
    }

    public void deposit() throws NegativeNumberException, NumberFormatException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount to deposit : ");
        int amount = Integer.parseInt(s.nextLine());
        Validations.isInvalidAmount(amount);
        this.balance += amount;
    }

    public void withdraw() throws NegativeNumberException, NumberFormatException, InsufficientAmountException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw : ");
        int amount = Integer.parseInt(s.nextLine());
        Validations.isInvalidAmount(amount);
        if (amount > balance) {
            throw new InsufficientAmountException();
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "customer=" + customer + ", balance=" + balance + ", accountno=" + account + '}';
    }

    public Person getCustomer() {
        return customer;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountno() {
        return account;
    }
}
