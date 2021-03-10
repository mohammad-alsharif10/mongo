package spring.data.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import spring.data.mongo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
