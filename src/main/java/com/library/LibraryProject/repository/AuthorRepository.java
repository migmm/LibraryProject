package com.library.LibraryProject.repository;

import com.library.LibraryProject.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
