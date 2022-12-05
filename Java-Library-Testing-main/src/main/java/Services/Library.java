package Services;

import book.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static ArrayList<Book> listOfBooks = new ArrayList<Book>();
    static{
        Book book1 = new Book("Harry Potter and the Sorcerer’s Stone","Fantasy", "J.K. Rowling","1997", "5", 199, true);
        Book book2 = new Book("The Brothers lionheart", "Kids", "Astrid Lindgren", "1973", "4", 159, false);
        Book book3 = new Book("Bambi", "Kids", "Walt Disney", "1942", "4", 79, true);
        Book book4 = new Book("Harry Potter and the Order of the Phoenix", "Fantasy","J.K. Rowling", "2003", "4.5", 249, true);
        Book book5 = new Book("Verity", "Thriller","Colleen Hoover","2020", "4", 349, false);
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        listOfBooks.add(book5);
    }
    public List<Book> getBooksFromLibrary(){
        return listOfBooks;
    }
}
