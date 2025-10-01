/*[
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojects;
import java.io.*;
public class Book implements Serializable {
    String bookname, subject;
    int price;

    public Book(String b, String s, int p) {
        bookname = b;
        subject = s;
        price = p;
    }
    public String toString() {
        return String.format("Book Name=%s, Subject=%s, Price=₹%s", bookname, subject, price);
    }
    public static void main(String[] args) {
        try {
            Book[] books = {
                new Book("The Recursion Sutras Kindle", "Recursion", 200),
                new Book("The Recursion Sutras", "Recursion", 598)
            };
//            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("books.txt"));
            ObjectOutputStream out = new ObjectOutputStream(System.out);
            out.writeObject(books);
            out.flush();
            out.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
