package com.SpringBootFirstPro.springboot;

import java.util.List;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")	
		public List<Book> getAllBooks()
	{
		Book book1 = new Book(1l,"Harry Potter","J.K Rowling");
		Book book2 = new Book(2l,"Why We Sleep","Alan Walker");
		Book book3 = new Book(3l,"Moby Dick","Hmmm");
			return Arrays.asList(book1, book2, book3);
	}
}
	