package com.library.LibraryProject.service;

import com.library.LibraryProject.dto.BookDto;
import com.library.LibraryProject.mapper.BookMapper;
import com.library.LibraryProject.model.Book;
import com.library.LibraryProject.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class BookImplementation implements BookInterface{

    private final BookRepository bookRepository;

    @Override
    public List<BookDto> findAllBooks() {
        return bookRepository.findAll().stream()
                .map(BookMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public String saveBook(BookDto bookDto) {
        Book bookEntity = BookMapper.toEntity(bookDto);
        bookRepository.save(bookEntity);
        return "Book saved successfully.";
    }

    @Override
    public BookDto findBook(String title) {
        Book bookEntity = bookRepository.findByTitle(title);
        return BookMapper.toDto(bookEntity);
    }

    @Override
    public String updateBook(Long id, BookDto bookDto) {

        Book book = bookRepository.findById(id).orElseThrow();

        book.setTitle(bookDto.getTitle());
        book.setGenre(bookDto.getGenre());
        book.setPublishDate(bookDto.getPublishDate());
        book.setAuthors(bookDto.getAuthors());

        bookRepository.save(book);

        return "Book" + book.getTitle() + "updated successfully";
    }

    @Override
    public String deleteBook(Long id) {
        bookRepository.deleteById(id);

        return "Book" + id + "updated successfully";
    }
}
