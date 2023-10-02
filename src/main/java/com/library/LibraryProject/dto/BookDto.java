package com.library.LibraryProject.dto;

import com.library.LibraryProject.model.Author;
import lombok.*;

import java.util.Date;
import java.util.Set;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookDto {
    private String title;
    private Date publishDate;
    private String genre;
    private Set<Author> authors;
}
