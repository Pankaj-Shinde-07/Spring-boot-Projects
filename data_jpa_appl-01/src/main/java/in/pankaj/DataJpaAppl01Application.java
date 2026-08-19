package in.pankaj;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.pankaj.entity.Book;
import in.pankaj.repo.BookRepo;

@SpringBootApplication
public class DataJpaAppl01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(DataJpaAppl01Application.class, args);
		
		BookRepo bookRepo = context.getBean(BookRepo.class);
//		BookRepo bookRepo = context.getBean(BookRepo.class);
		
		Book b1 = new Book();
		b1.setBookId(102);
		b1.setBookName("Solution");
		b1.setBookPrice(999.99);
		
		Book b2 = new Book();
		b2.setBookId(103);
		b2.setBookName("Love");
		b2.setBookPrice(559.99);
		
		List<Book> list = Arrays.asList(b1,b2);
		
		
		
//		bookRepo.save(b);// update + insert => upsert method
//		bookRepo.saveAll(list);
		
//		Optional<Book> record = bookRepo.findById(101);
//		
//		if(record.isPresent()) {
//			Book book = record.get();
//			System.out.println(book.getBookName());
//		}
		
		Iterable<Book> itr = bookRepo.findAllById(Arrays.asList(101,102));
		itr.forEach(System.out::println);
		
		Iterable<Book> all = bookRepo.findAll();
		
		all.forEach(System.out::println);
		
		bookRepo.deleteAll();
		
	}

}
