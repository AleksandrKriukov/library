package com.kriukov.services;

import com.kriukov.dao.GenreDAO;
import com.kriukov.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {

    @Autowired
    GenreDAO genreDAO;

    public void createGenre(Genre genre) {
        if (genre.getId() == null) { //TODO: may be not the best solution. DTO can solve this
            genreDAO.save(genre);
        } else {
            throw new IllegalArgumentException("Genre ID is not allowed in creation operation");
        }
    }

    public List<Genre> getGenres() {
        return genreDAO.findAll();
    }

    public Genre getGenreById(Long genreId) {
        return genreDAO.getOne(genreId);
    }

    public void updateGenre(Long genreId, Genre genre) {
        genre.setId(genreId);
        genreDAO.save(genre);
    }

    public void deleteGenres() {
        genreDAO.deleteAll();
    }

    public void deleteGenre(Long genreId) {
        genreDAO.deleteById(genreId);
    }
}
