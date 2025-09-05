package com.eduardafbz.moviesbooksrecommendations.controller;

import com.eduardafbz.moviesbooksrecommendations.model.Book;
import com.eduardafbz.moviesbooksrecommendations.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book newBook = bookService.addBook(book);
        return ResponseEntity.ok(newBook);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
            List<Book> books = bookService.getAllBooks();
            return ResponseEntity.ok(books);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        Book bookToUpdate = bookService.updateBook(id, book);
        return ResponseEntity.ok(bookToUpdate);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Book> deleteBookById(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return ResponseEntity.noContent().build();
    }
}
