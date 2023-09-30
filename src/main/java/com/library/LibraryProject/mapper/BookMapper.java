package com.library.LibraryProject.mapper;

import com.library.LibraryProject.dto.BookDto;
import com.library.LibraryProject.model.Book;


public class BookMapper {
    public static BookDto toDto(Book book){
        BookDto bookDto = new BookDto();

        bookDto.setTitle(book.getTitle());
        bookDto.setPublishDate(book.getPublishDate());
        bookDto.setGenre(book.getGenre());
        bookDto.setAuthors(book.getAuthors());

        return bookDto;
    }

    public static Book toEntity(BookDto bookDto){
        Book book = new Book();

        book.setTitle(bookDto.getTitle());
        book.setPublishDate((book.getPublishDate()));
        book.setGenre(bookDto.getGenre());
        book.setAuthors(bookDto.getAuthors());

        return book;
    }
}
