package sidahmed.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;
import sidahmed.springframework.spring6webapp.domain.Author;
import sidahmed.springframework.spring6webapp.repositories.AuthorRepository;

@Service
public class AuthorServieImpl implements AuthorService{

    private final AuthorRepository authorRepository;

    public AuthorServieImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
