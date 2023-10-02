package com.library.LibraryProject.dto;

import com.library.LibraryProject.model.Book;
import lombok.*;

import java.util.Set;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AuthorDto {
    private String name;
    private String surname;
    private Set<Book> books;
}

