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
			return Arrays.asList(book1);
	}
}
	