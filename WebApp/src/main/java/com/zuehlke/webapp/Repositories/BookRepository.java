package com.zuehlke.webapp.Repositories;

import com.zuehlke.webapp.Model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
