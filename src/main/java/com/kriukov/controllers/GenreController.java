package com.kriukov.controllers;

import com.kriukov.model.Genre;
import com.kriukov.services.GenreService;
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
@RequestMapping("/genres")
public class GenreController {

    @Autowired
    GenreService genreService;

    @PostMapping
    public void createGenre(@RequestBody Genre genre) {
        genreService.createGenre(genre);
    }

    @GetMapping
    public List<Genre> getGenres() {
        return genreService.getGenres();
    }

    @GetMapping("/{genreId}")
    public Genre getGenreById(@PathVariable Long genreId) {
        return genreService.getGenreById(genreId);
    }

    @PutMapping("/{genreId}")
    public void updateGenre(@PathVariable Long genreId, @RequestBody Genre genre) {
        genreService.updateGenre(genreId, genre);
    }

    @DeleteMapping
    public void deleteGenres() {
        genreService.deleteGenres();
    }

    @DeleteMapping("/{genreId}")
    public void deleteGenre(@PathVariable Long genreId) {
        genreService.deleteGenre(genreId);
    }
}
