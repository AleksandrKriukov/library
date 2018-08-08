INSERT INTO genres (id, genre) VALUES (1, 'Education')
INSERT INTO genres (id, genre) VALUES (2, 'Science fiction')

INSERT INTO authors (id, name, birth_date) VALUES (1, 'Arthur', '2012-09-17')
INSERT INTO authors (id, name) VALUES (2, 'Johannes')
INSERT INTO authors (id, name) VALUES (3, 'Bjorn')

INSERT INTO books (id, name, genre_id, author_id) VALUES (1, 'Spring Boot', 1, 1)
INSERT INTO books (id, name, genre_id, author_id) VALUES (2, 'Big Data', 1, 2)
INSERT INTO books (id, name, genre_id, author_id) VALUES (3, 'Data Science', 2, 3)
INSERT INTO books (id, name, genre_id, author_id) VALUES (4, 'Java 8', 1, 2)
INSERT INTO books (id, name, genre_id, author_id) VALUES (5, 'Stream API', 2, 1)