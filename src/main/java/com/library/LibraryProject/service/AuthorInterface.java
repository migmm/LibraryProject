package com.library.LibraryProject.service;

import com.library.LibraryProject.dto.AuthorDto;

import java.util.List;

public interface AuthorInterface {
    List<AuthorDto> findAllAuthors();
    String saveAuthor(AuthorDto authorDto);
    AuthorDto findAuthor(Long id);
    String updateAuthor(Long id, AuthorDto authorDto);
    String deleteAuthor(Long id);
}
