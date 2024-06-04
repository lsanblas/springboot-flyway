package dev.flyway.migration.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Book {
    @Id
    @SequenceGenerator(name="book_generator", sequenceName="book_sequence", allocationSize = 1)
    @GeneratedValue(generator = "book_generator")
    private Long id;
    private String isbn;
    private String name;
    private String genre;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book [" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ']';
    }
}
