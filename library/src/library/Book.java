
package library;
import java.util.*;

public class Book {
    private String title,author,isbn,genre, type, domain;

    public Book(String title, String author, String isbn, String genre) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
    }

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    
    public Book(String title, String author, String isbn, String genre, String type, String domain) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.type = type;
        this.domain = domain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    public Book()
    {
        
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}
