package com.example.bibliotecabackend.service;

import com.example.bibliotecabackend.enitity.Author;
import com.example.bibliotecabackend.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Optional<Author> getAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    public Author updateAuthor(Long id, Author updatedAuthor) {
        Optional<Author> existingAuthorOptional = authorRepository.findById(id);
        if (existingAuthorOptional.isPresent()) {
            Author existingAuthor = existingAuthorOptional.get();
            existingAuthor.setFirst_name(updatedAuthor.getFirst_name());
            existingAuthor.setFirst_name(updatedAuthor.getLast_name());
            return authorRepository.save(existingAuthor);
        } else {
            throw new RuntimeException("Author not found with id: " + id);
        }
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
