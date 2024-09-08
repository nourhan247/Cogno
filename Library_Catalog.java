/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_cogno;
import java.util.ArrayList;
/**
 *
 * @author nourh
 */
public class Library_Catalog {
ArrayList<Book>books;

    public Library_Catalog() {
        books = new ArrayList<>();

    }
public void AddBook(Book book){
    if(book.isIsAvailable())
        books.add(book);
    else
        System.out.println("Book is already added");
                
}
public void SearchBookByTitle(String title){
    boolean flag=false;
    for(Book book:books){
        if(book.getTitle().equals(title)){
            flag =true;
            break;
        }
       } 
    if(flag)
        System.out.println("Book is found");
        else
            System.out.println("Book isn't found");
    
}
public void SearchBookByAuthor(String author){
    boolean flag=false;
    for(Book book:books){
        if(book.getAuthor().equals(author)){
            System.out.print("author's book is "+book.title); 
            flag =true;
            break;
        }
       } 
    if(!flag)
        System.out.println(" Book isn't found");
    
}

public void CheckOut(String title) {

    Book bookToRemove = null;

    for (Book book : books) {
        if (book.getTitle().equals(title)) {

            bookToRemove = book;
            break; 
        }
    }

    if (bookToRemove != null) {
        books.remove(bookToRemove);
        System.out.println("Book is checked out");
    } else {
        System.out.println("Book isn't here");
    }
}

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("title is "+book.title +" and "+"author is "+book.author);
        }
    }
}
