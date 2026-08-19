package in.pankaj.controller;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.pankaj.entity.Book;
import in.pankaj.service.BookService;

@Controller
//@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bs;

	@GetMapping("/showBooks")
	public ModelAndView getBooks() {

		List<Book> data = bs.getData();

		ModelAndView mav = new ModelAndView();
		mav.addObject("books", data);
		mav.setViewName("index");

		return mav;
	}
	
	@GetMapping("/add")
	public ModelAndView addBookView() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("book", new Book());
		
		mav.setViewName("addBook");
		
		return mav;
	}
	
	@GetMapping("/update")
	public ModelAndView updateBook(@RequestParam Integer id) {
		
		ModelAndView mav = new ModelAndView();
		
		System.out.println(id);
		
		Book book = bs.getBook(id);
		
		mav.addObject("book", book);
		
		mav.setViewName("updateView");
		
		return mav;
	}
	
	@GetMapping("/delete")
	public ModelAndView deleteBook(@RequestParam Integer id) {

	    ModelAndView mav = new ModelAndView();

	    bs.deleteBook(id);

	    List<Book> data = bs.getData();

	    if (data.isEmpty()) {
	        bs.resetAutoIncrement();
	    }

	    mav.addObject("deleteMsgSucc", "Deleted Successfully");
	    mav.addObject("books", data);
	    mav.setViewName("index");

	    return mav;
	}
	
	@PostMapping("/update")
	public ModelAndView updateBook(Book book) {
		
		ModelAndView mav = new ModelAndView();

	
		boolean up = bs.updateBook(book);
		
		if(up) {
			mav.addObject("updateMsgSucc", "Updated Successfully");
		}else {
			mav.addObject("updateMsgErr", "Update failed");
		}
		
		mav.setViewName("updateView");
		
		return mav;
	}

	

	@PostMapping("/add")
	public ModelAndView addBook(Book book) {

		ModelAndView mav = new ModelAndView();
		
		System.out.println(book);
		boolean status = bs.saveBook(book);
		
		if(status) {
			mav.addObject("AddBookMsgSucc","Book Inserted successfully");
		}else {
			mav.addObject("AddBookMsgErr","Book Insertion failed");
		}
		mav.setViewName("addBook");

		return mav;
	}
}