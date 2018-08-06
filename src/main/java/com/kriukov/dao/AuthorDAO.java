package com.kriukov.dao;

import com.kriukov.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDAO extends JpaRepository<Author, Long> {
}
