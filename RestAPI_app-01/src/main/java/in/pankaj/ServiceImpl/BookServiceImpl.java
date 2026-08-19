package in.pankaj.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pankaj.entity.BookEntity;
import in.pankaj.repo.BookRepo;
import in.pankaj.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepo br;
	
	@Override
	public void addBook(BookEntity book) {
		
		br.save(book);
		
		System.out.println("Book added successfully");
		
	}

	@Override
	public BookEntity getBook(Integer id) {
		System.out.println("Book get successfully");
		
		Optional<BookEntity> byId = br.findById(id);
		
		if(byId.isPresent()){
			return byId.get();
		}
		return null;
	}

	@Override
	public List<BookEntity> getAllBooks() {
		System.out.println("Books gets successfully");
		
		List<BookEntity> all = br.findAll();
		return all;
	}

	@Override
	public void updateBook(BookEntity book) {
		
		br.save(book);
		System.out.println("Book updated successfully");
		
	}

	@Override
	public void deleteBook(Integer id) {
		
		br.deleteById(id);
		System.out.println("Book deleted successfully");
		
	}
	
	
}
