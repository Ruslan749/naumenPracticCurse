package com.example.books.controllers;

import com.example.books.model.Book;
import com.example.books.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    @ResponseBody
    public List<Book> getAll(){
        return bookService.getAllBooks();
    }

    @GetMapping("/save/{title}/{author}/{year}")
    @ResponseBody
    public Book save(
            @PathVariable String title,
            @PathVariable String author,
            @PathVariable Integer year
    ){
        return bookService.saveBook(title,author,year);
    }
}
