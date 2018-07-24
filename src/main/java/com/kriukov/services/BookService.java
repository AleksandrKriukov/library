package com.kriukov.services;

import com.kriukov.dao.BookDAO;
import com.kriukov.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public List<Book> getBooks() {
        return bookDAO.findAll();
    }

    //TODO: test it
    public void createBook(Book book) {
        bookDAO.save(book);
    }
}
