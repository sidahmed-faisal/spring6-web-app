package sidahmed.springframework.spring6webapp.services;

import sidahmed.springframework.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
