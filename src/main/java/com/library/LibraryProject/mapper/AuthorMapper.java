package com.library.LibraryProject.mapper;

import com.library.LibraryProject.dto.AuthorDto;
import com.library.LibraryProject.model.Author;


public class AuthorMapper {
    public static AuthorDto toDto(Author author) {
        AuthorDto authorDto = new AuthorDto();

        authorDto.setName(author.getName());
        authorDto.setSurname(author.getSurname());
        authorDto.setBooks(author.getBooks());

        return authorDto;
    }

    public static Author toEntity(AuthorDto authorDto) {
        Author author = new Author();

        author.setName(authorDto.getName());
        author.setSurname(authorDto.getSurname());
        author.setBooks(authorDto.getBooks());

        return author;
    }
}
