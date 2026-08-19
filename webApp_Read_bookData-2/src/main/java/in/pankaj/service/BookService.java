package in.pankaj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pankaj.entity.Book;
import in.pankaj.repo.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo repo;
	
	public List<Book> getData(){
		List<Book> all = repo.findAll();
		return all;
	}
	
	
	public boolean saveBook(Book book) {
		Book save = repo.save(book);
		
		if(save.getBookId()!=null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean updateBook(Book book) {
		
		Book save = repo.save(book);
		if(save.getBookId()!=null) {
			return true;
		}
		return false;
	}
	
	public Book getBook(Integer id) {
		Optional<Book> byId = repo.findById(id);
		
		if(byId.isPresent()) {
			Book book = byId.get();
			return book;
		}else {
			return null;
		}
	}
	
	public void deleteBook(Integer id) {
		repo.deleteById(id);
	}
	
	public void resetAutoIncrement() {
		if (repo.count() == 0) {
			repo.resetAutoIncrement();
		}
	}

}
