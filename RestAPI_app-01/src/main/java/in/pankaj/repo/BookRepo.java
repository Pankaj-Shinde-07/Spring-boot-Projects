package in.pankaj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import in.pankaj.entity.BookEntity;

public interface BookRepo extends JpaRepository<BookEntity, Integer>{

}
