package io.library.librarymanager.books;

import org.springframework.data.repository.CrudRepository;
import org.springframework.kafka.core.KafkaTemplate;

public interface BookRepository extends CrudRepository<Book, String> {}


//public interface BookRepo2 extends
