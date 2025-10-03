/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojects;

/**
 *
 * @author HP
 */
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class BankAccount implements Serializable {

    private Person customer;
    private int balance;
    private String accountno;

    public BankAccount() throws
        InvalidAgeException, InvalidMobileNumberException, NegativeNumberException {
        Scanner s = new Scanner(System.in);
        this.customer = new Person();
        int balance;
        System.out.println("Enter the balance : ");
        balance = Integer.parseInt(s.nextLine());
        Validations.isInvalidAmount(balance);
        this.balance=balance;
        System.out.println("Enter the Accountno : ");
        String accountno = s.nextLine();

        this.accountno = accountno;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "customer=" + customer + ", balance=" + balance + ", accountno=" + accountno + '}';
    }

    public Person getCustoner() {
        return customer;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountno() {
        return accountno;
    }
}
