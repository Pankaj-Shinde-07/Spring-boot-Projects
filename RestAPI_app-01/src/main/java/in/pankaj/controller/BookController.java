package in.pankaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.pankaj.ServiceImpl.BookServiceImpl;
import in.pankaj.entity.BookEntity;

@RestController
public class BookController {
	
	@Autowired
	private BookServiceImpl bs;
	
	@PostMapping(value="/add" , produces = "text/plain",consumes = "application/json")
	public ResponseEntity<String> addBook (@RequestBody BookEntity book){
		bs.addBook(book);
		
		return new ResponseEntity<>("book Added", HttpStatus.CREATED);
	}
	@PutMapping(value="/update" , produces = "text/plain",consumes = "application/json")
	public ResponseEntity<String> updateBook (@RequestBody BookEntity book){
		bs.updateBook(book);
		
		return new ResponseEntity<>("book updated", HttpStatus.OK);
	}
	
	@DeleteMapping(value="/delete" , produces = "text/plain")
	public ResponseEntity<String> deleteBook (@RequestParam Integer id){
		bs.deleteBook(id);
		
		return new ResponseEntity<>("book deleted", HttpStatus.OK);
	}
	
	
	@GetMapping(value="/getBook" , produces = "application/json")
	public ResponseEntity<BookEntity> getBook(@RequestParam Integer id){
		BookEntity book = bs.getBook(id);
		
		return new ResponseEntity<>(book,HttpStatus.OK);
	}
	@GetMapping(value="/getBooks" , produces="application/json")
	public ResponseEntity<List<BookEntity>> getBooks(){
		List<BookEntity> allBooks = bs.getAllBooks();
		
		return new ResponseEntity<>(allBooks,HttpStatus.OK);
	}
	
	
	
	
	
	

}
