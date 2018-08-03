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

    public void createBook(Book book) {
        if (book.getId() == null) { //TODO: may be not the best solution. DTO can solve this
            bookDAO.save(book);
        } else {
            throw new IllegalArgumentException("Book ID is not allowed in creation operation");
        }
    }

    public List<Book> getBooks() {
        return bookDAO.findAll();
    }

    public Book getBookById(Long bookId) {
        return bookDAO.getOne(bookId);
    }

    public void updateBook(Long bookId, Book book) {
        book.setId(bookId);
        bookDAO.save(book);
    }

    public void deleteBooks() {
        bookDAO.deleteAll();
    }

    public void deleteBook(Long bookId) {
        bookDAO.deleteById(bookId);
    }
}
