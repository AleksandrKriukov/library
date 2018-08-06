package com.kriukov.services;

import com.kriukov.dao.AuthorDAO;
import com.kriukov.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorDAO authorDAO;

    public void createAuthor(Author author) {
        if (author.getId() == null) { //TODO: may be not the best solution. DTO can solve this
            authorDAO.save(author);
        } else {
            throw new IllegalArgumentException("Author ID is not allowed in creation operation");
        }
    }

    public List<Author> getAuthors() {
        return authorDAO.findAll();
    }

    public Author getAuthorById(Long authorId) {
        return authorDAO.getOne(authorId);
    }

    public void updateAuthor(Long authorId, Author author) {
        author.setId(authorId);
        authorDAO.save(author);
    }

    public void deleteAuthors() {
        authorDAO.deleteAll();
    }

    public void deleteAuthor(Long authorId) {
        authorDAO.deleteById(authorId);
    }
}
