package in.pankaj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.pankaj.entity.Book;
import jakarta.transaction.Transactional;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{
	
	@Modifying
	@Transactional
	@Query(value = "ALTER TABLE book AUTO_INCREMENT = 1", nativeQuery = true)
	void resetAutoIncrement();

}
