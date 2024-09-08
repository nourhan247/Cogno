/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.library_cogno;

/**
 *
 * @author nourh
 */
public class Library_Cogno {

    public static void main(String[] args) {
                   Library_Catalog catalog = new Library_Catalog();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        catalog.AddBook(book1);
        catalog.AddBook(book2);
        catalog.AddBook(book3);
        catalog.displayBooks();
        
        catalog.SearchBookByTitle("noura");
        catalog.SearchBookByAuthor("Harper Lee");
     catalog.CheckOut("1984");
     catalog.displayBooks();

    }
}
