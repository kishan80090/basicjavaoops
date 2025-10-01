/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojects;
public class Generics<T>{
    T t;
    public Generics(T t){
        this.t=t;
    }
    public void printClass(){
        System.err.println(t.getClass().getName());
    }
public static void main(String[] args){
    Generics<String> x=new Generics("hellow");
    x.printClass();
    Generics<Integer> i=new Generics<>(5);
    i.printClass();
}
}
