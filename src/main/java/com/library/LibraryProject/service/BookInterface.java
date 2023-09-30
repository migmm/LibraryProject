package com.library.LibraryProject.service;

import com.library.LibraryProject.dto.BookDto;

import java.util.List;

public interface BookInterface {
    List<BookDto> findAllBooks();
    String saveBook(BookDto bookDto  );
    BookDto findBook(String title);
    String updateBook(Long id, BookDto bookDto);
    String deleteBook(Long id);
}
