package com.zuehlke.webapp.Repositories;

import com.zuehlke.webapp.Model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
