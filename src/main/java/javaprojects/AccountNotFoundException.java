/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojects;

/**
 *
 * @author HP
 */
public class AccountNotFoundException extends Exception {
    public AccountNotFoundException(){
        
    }
    public AccountNotFoundException(String message){
        super(message);
    }
    
}
