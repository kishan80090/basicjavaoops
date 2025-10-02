/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojects;

/**
 *
 * @author HP
 */
public class Validations {

    public static void isMobileNumberValid(String mobile) throws
            InvalidMobileNumberException {
        mobile = (mobile + "").trim();
        if (mobile.length() != 10) {
            throw new InvalidMobileNumberException("Invalid Mobile Number");
        }
        if (mobile.startsWith("0")) {
            throw new InvalidMobileNumberException("Invalid Mobile Number");
        }
        char[] chars = mobile.toCharArray();
        for (char ch : chars) {
            if (!Character.isDigit(ch)) {
                throw new InvalidMobileNumberException("Invalid Mobile Number");
            }
        }
    }

    public static void isInvalidAmount(int n) throws NegativeNumberException {
        if (n <= 0) {
            throw new NegativeNumberException("Negative numbers not allowed");
        }
    }

    public static void isInvalidAge(int n) throws InvalidAgeException {
        if (n < 18) {
            throw new InvalidAgeException("Age is Invalid");
        }
    }
}
