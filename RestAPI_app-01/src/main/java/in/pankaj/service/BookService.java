package in.pankaj.service;

import java.util.List;

import in.pankaj.entity.BookEntity;

public interface BookService {
	
	public void addBook(BookEntity book);
	
	public BookEntity getBook( Integer id);
	
	public List<BookEntity> getAllBooks();
	
	public void updateBook(BookEntity book);
	
	public void deleteBook(Integer id);

}
