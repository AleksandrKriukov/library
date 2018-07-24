package com.kriukov.controllers;

import com.kriukov.model.Book;
import com.kriukov.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping("/book")
    public void createBook(@RequestBody Book book) {
        bookService.createBook(book);
    }
}
