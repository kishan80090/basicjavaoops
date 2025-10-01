/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojects;

/**
 *
 * @author HP
 */
public class OuterClass {
    protected static class Staticlnner{
        @Override
        public String toString(){
            return "Staticlnner in Outer";
        }
    }
    public static void main(String[] args){
        OuterClass.Staticlnner si=new Staticlnner();
        new OuterClass();
        System.out.println(new Staticlnner());
        System.out.println(new javaprojects.Staticlnner());
        System.out.println(si);
    }
}
