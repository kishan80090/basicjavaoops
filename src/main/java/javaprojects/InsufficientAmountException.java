/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojects;

/**
 *
 * @author HP
 */
public class InsufficientAmountException extends Exception {
    public InsufficientAmountException(){
        
    }
    public InsufficientAmountException(String message){
        super(message);
    }
}
