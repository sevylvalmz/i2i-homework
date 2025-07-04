package com.deneme.service;

import com.deneme.model.Book;
import com.deneme.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    List<Book> findAll(){
        return null;
    }

}
