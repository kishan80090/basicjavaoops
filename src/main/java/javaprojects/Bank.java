/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojects;
public class Bank {
    public static void main(String[] args) {
        BankAccount account;
        try {
            account = new BankAccount();
            System.out.println(account);
            System.out.println("Success");
        } catch (InvalidAgeException | InvalidMobileNumberException | NegativeNumberException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Thanks You");
        }
    }
}
