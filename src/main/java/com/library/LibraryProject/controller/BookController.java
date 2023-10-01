package com.library.LibraryProject.controller;
import com.library.LibraryProject.dto.BookDto;
import com.library.LibraryProject.service.BookInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {
    private final BookInterface bookService;

    @GetMapping("/findAll")
    public ResponseEntity<List<BookDto>> findAllBooks() {
        List<BookDto> list = bookService.findAllBooks();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveBook(@RequestBody BookDto bookDto) {
        String message = bookService.saveBook(bookDto);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @GetMapping("/find/{title}")
    public ResponseEntity<BookDto> findBook(@PathVariable String title) {
        BookDto bookDto = bookService.findBook(title);
        if (bookDto != null) {
            return new ResponseEntity<>(bookDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateBook(@PathVariable Long id, @RequestBody BookDto bookDto) {
        String message = bookService.updateBook(id, bookDto);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        String message = bookService.deleteBook(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
