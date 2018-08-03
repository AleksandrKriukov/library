package com.kriukov.controllers;

import com.kriukov.model.Book;
import com.kriukov.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping
    public void createBook(@RequestBody Book book) {
        bookService.createBook(book);
    }

    @PutMapping("/{bookId}")
    public void updateBook(@PathVariable Long bookId, @RequestBody Book book) {
        bookService.updateBook(bookId, book);
    }
}
