package com.zuehlke.webapp.BootStrap;

import com.zuehlke.webapp.Model.Author;
import com.zuehlke.webapp.Model.Book;
import com.zuehlke.webapp.Model.Publisher;
import com.zuehlke.webapp.Repositories.AuthorRepository;
import com.zuehlke.webapp.Repositories.BookRepository;
import com.zuehlke.webapp.Repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        Publisher editor = new Publisher("Editor", "Far far away");
        this.publisherRepository.save(editor);

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(editor);
        editor.getBooks().add(ddd);

        this.authorRepository.save(eric);
        this.bookRepository.save(ddd);
        this.publisherRepository.save(editor);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(editor);
        editor.getBooks().add(noEJB);

        this.authorRepository.save(rod);
        this.bookRepository.save(noEJB);
        this.publisherRepository.save(editor);

        System.out.println("Starting in Bootstrap");
        System.out.println("Number of books: " + this.bookRepository.count());
        System.out.println("Publisher: " + editor.getBooks().size());
    }

}
