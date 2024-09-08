/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_cogno;

/**
 *
 * @author nourh
 */
public class Book {
   String title , author;
   boolean isAvailable;
   public Book(){
   }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(!title.isEmpty())
        this.title = title;
        else
             System.out.println("Invalid input!");

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(!author.isEmpty())
        this.author = author;
        else
             System.out.println("Invalid input!");

    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    

}
