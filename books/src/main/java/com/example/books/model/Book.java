package com.example.books.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "books")
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private Integer yearPublish;

    public Book(String title, String author, Integer yearPublish) {
        this.title = title;
        this.author = author;
        this.yearPublish = yearPublish;
    }

    public Book() {

    }
}
