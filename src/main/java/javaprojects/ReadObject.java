/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojects;
import java.io.*;
public class ReadObject {
    public static void main(String[] args) {
        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("books.txt"));
            Book[] books=(Book[])in.readObject();
            in.close();
            for(Book book : books)
                System.out.println(book);
        }
        catch(IOException ex){
            System.out.println(ex);
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex);
        }
    }  
}