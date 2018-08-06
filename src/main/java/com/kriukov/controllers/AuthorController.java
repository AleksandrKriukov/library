package com.kriukov.controllers;

import com.kriukov.model.Author;
import com.kriukov.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping
    public void createAuthor(@RequestBody Author author) {
        authorService.createAuthor(author);
    }

    @GetMapping
    public List<Author> getAuthors() {
        return authorService.getAuthors();
    }

    @GetMapping("/{authorId}")
    public Author getAuthorById(@PathVariable Long authorId) {
        return authorService.getAuthorById(authorId);
    }

    @PutMapping("/{authorId}")
    public void updateAuthor(@PathVariable Long authorId, @RequestBody Author author) {
        authorService.updateAuthor(authorId, author);
    }

    @DeleteMapping
    public void deleteAuthors() {
        authorService.deleteAuthors();
    }

    @DeleteMapping("/{authorId}")
    public void deleteAuthor(@PathVariable Long authorId) {
        authorService.deleteAuthor(authorId);
    }
}
