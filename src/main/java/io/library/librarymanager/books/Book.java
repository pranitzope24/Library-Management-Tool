package io.library.librarymanager.books;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.validation.annotation.Validated;

@Entity
public class Book {

    @Id
    private String b_id;
    private String book_name;
    private String author;

    public Book(){}

    public Book(String b_id, String book_name, String author) {
        this.b_id = b_id;
        this.book_name = book_name;
        this.author = author;
    }

    public String getB_id() {
        return b_id;
    }

    public void setB_id(String b_id) {
        this.b_id = b_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

