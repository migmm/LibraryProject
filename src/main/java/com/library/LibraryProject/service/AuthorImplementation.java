package com.library.LibraryProject.service;

import com.library.LibraryProject.dto.AuthorDto;
import com.library.LibraryProject.mapper.AuthorMapper;
import com.library.LibraryProject.model.Author;
import com.library.LibraryProject.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorImplementation implements AuthorInterface{
    private final AuthorRepository authorRepository;

    @Override
    public List<AuthorDto> findAllAuthors() {
        return authorRepository.findAll().stream()
                .map(AuthorMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public String saveAuthor(AuthorDto authorDto) {
        Author authorEntity = AuthorMapper.toEntity(authorDto);
        authorRepository.save(authorEntity);
        return "Author saved successfully.";
    }

    @Override
    public AuthorDto findAuthor(Long id) {
        Author authorEntity = authorRepository.findById(id).orElse(null);
        if (authorEntity != null) {
            return AuthorMapper.toDto(authorEntity);
        } else {
            return null;
        }
    }

    @Override
    public String updateAuthor(Long id, AuthorDto authorDto) {
        Author author = authorRepository.findById(id).orElse(null);
        if (author != null) {
            author.setName(authorDto.getName());
            // Agrega otros campos que desees actualizar
            authorRepository.save(author);
            return "Author updated successfully.";
        } else {
            return "Author not found.";
        }
    }

    @Override
    public String deleteAuthor(Long id) {
        authorRepository.deleteById(id);
        return "Author with ID " + id + " deleted successfully.";
    }
}
