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

    public void createBook(Book book) {
        if (book.getId() == null) {
            bookDAO.save(book);
        } else {
            throw new IllegalArgumentException("Book ID is not allowed in creation operation");
        }
    }

    public void updateBook(Long bookId, Book book) {
        book.setId(bookId);
        bookDAO.save(book);
    }
}
