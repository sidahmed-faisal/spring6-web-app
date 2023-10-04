package sidahmed.springframework.spring6webapp.services;

import sidahmed.springframework.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
