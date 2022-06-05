package com.ashishjava;
class Library{
    String [] books;
    int no_of_books =0;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBooks(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " book has been added succsesfully to library!");

    }
    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book:this.books) {
            if(book== null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String book){
        for(int i=0 ; i<this.books.length ; i++){
             if(this.books[i].equals(book)){
                 System.out.println("The Book has been Issued.");
                 this.books[i]= null;
                 return;
             }
        }
        System.out.println("This Book does not exists");
        }
        void returnBook(String book){
           addBooks(book);
        }
    }

public class Library_Exercise_cwh {
    public static void main(String[] args) {
     Library CentralLibrary = new Library();
        CentralLibrary.addBooks("Physics Dc pandey");
        CentralLibrary.addBooks("Das and pal maths");
        CentralLibrary.addBooks("Chemistry");
        CentralLibrary.showAvailableBooks();
        CentralLibrary.issueBook("Chemistry");
        CentralLibrary.showAvailableBooks();
        CentralLibrary.addBooks("Chemistry");
        CentralLibrary.showAvailableBooks();

    }
}
