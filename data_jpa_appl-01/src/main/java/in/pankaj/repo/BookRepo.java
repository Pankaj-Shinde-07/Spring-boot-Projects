package in.pankaj.repo;

import org.springframework.data.repository.CrudRepository;

import in.pankaj.entity.Book;

public interface BookRepo extends CrudRepository<Book, Integer> {

}
