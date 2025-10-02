/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojects;
import java.io.Serializable;
import java.util.Scanner;
public class Person implements Serializable {
public static final long serialVersionUID=1;
private String name,address,mobile;
int age;
public Person() throws
        InvalidAgeException,InvalidMobileNumberException{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter name,address,mobile number and age : ");
    name=s.nextLine();
    address=s.nextLine();
    mobile=s.nextLine();
    Validations.isMobileNumberValid(mobile);
    age=Integer.parseInt(s.nextLine());
    Validations.isInvalidAge(age);
}
@Override
public String toString(){
return "Person{" +"name=" + name +", address=" + address +", mobile=" + mobile +", age=" + age +'}';
}
public static void main(String[] args)throws InvalidMobileNumberException,InvalidAgeException{
    Person p=new Person();
    System.out.println(p);
}
}
