package com.library.LibraryProject.controller;

import com.library.LibraryProject.dto.AuthorDto;
import com.library.LibraryProject.service.AuthorInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorInterface authorService;

    @GetMapping("/findAll")
    public ResponseEntity<List<AuthorDto>> findAllAuthors() {
        List<AuthorDto> list = authorService.findAllAuthors();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveAuthor(@RequestBody AuthorDto authorDto) {
        String message = authorService.saveAuthor(authorDto);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<AuthorDto> findAuthor(@PathVariable Long id) {
        AuthorDto authorDto = authorService.findAuthor(id);
        return new ResponseEntity<>(authorDto, HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateAuthor(@PathVariable Long id, @RequestBody AuthorDto authorDto) {
        String message = authorService.updateAuthor(id, authorDto);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAuthor(@PathVariable Long id) {
        String message = authorService.deleteAuthor(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
