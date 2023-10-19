package com.example.books.services;

import com.example.books.model.Book;
import com.example.books.repositories.BookRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book saveBook(String title, String author, int year){
        Book newBook = new Book(title,author,year);
        bookRepository.save(newBook);
        return newBook;
    }
    public List<Book> getAllBooks(){
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }


}
