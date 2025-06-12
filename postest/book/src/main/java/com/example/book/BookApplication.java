package com.example.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@SpringBootApplication
@RestController
@RequestMapping("/api/books")
public class BookApplication {

	private Map<Integer, Book> bookRepo = new HashMap<>();
	private int idCounter = 1;

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

	@GetMapping
	public Book getBook(@RequestParam int id ) {
		return bookRepo.getOrDefault(id, new Book());
	}

	@PostMapping
	public String createBook(@RequestBody Book book) {
		book.setId(idCounter++);
		bookRepo.put(book.getId(), book);
		return "Book created: " + book.getTitle();
	}

	@PutMapping
	public String updateBook(@RequestBody Book book) {
		if (bookRepo.containsKey(book.getId())) {
			bookRepo.put(book.getId(), book);
			return "Book updated: " + book.getTitle();
		} else {
			return "Book not found.";
		}
	}

	@DeleteMapping
	public String deleteBook(@RequestParam int id) {
		if (bookRepo.remove(id) !=null) {
			return "Book deleted.";
		} else {
			return "Book not found.";
		}
	}
}
