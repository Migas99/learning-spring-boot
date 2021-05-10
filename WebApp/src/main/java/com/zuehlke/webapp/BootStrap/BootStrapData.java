package com.zuehlke.webapp.BootStrap;

import com.zuehlke.webapp.Model.Author;
import com.zuehlke.webapp.Model.Book;
import com.zuehlke.webapp.Repositories.AuthorRepository;
import com.zuehlke.webapp.Repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        this.authorRepository.save(eric);
        this.bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJ8 = new Book("J2EE Development without EJ8", "3939459459");
        rod.getBooks().add(noEJ8);
        noEJ8.getAuthors().add(rod);

        this.authorRepository.save(rod);
        this.bookRepository.save(noEJ8);

        System.out.println("Starting in Bootstrap");
        System.out.println("Number of books: " + this.bookRepository.count());

    }

}
