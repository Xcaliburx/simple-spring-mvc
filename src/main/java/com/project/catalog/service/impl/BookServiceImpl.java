package com.project.catalog.service.impl;

import com.project.catalog.form.BookForm;
import com.project.catalog.model.Book;
import com.project.catalog.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BookServiceImpl implements BookService {

    List<Book> books = new ArrayList<>();

    public BookServiceImpl() {
        Book book1 = new Book();
        book1.setId("1");
        book1.setTitle("Sherlock Holmes");
        book1.setAuthor("Sir Arthur");
        book1.setDescription("This is a book");

        Book book2 = new Book();
        book2.setId("2");
        book2.setTitle("Buku Kedua");
        book2.setAuthor("Author dari buku");
        book2.setDescription("This is a book 2");

        books.add(book1);
        books.add(book2);
    }

    @Override
    public List<Book> findBookAll() {
        return books;
    }

    @Override
    public void createNewBook(BookForm bookForm) {
        Book book = new Book();
        book.setTitle(bookForm.getTitle());
        book.setAuthor(bookForm.getAuthor());
        book.setDescription(bookForm.getDescription());
        book.setId(UUID.randomUUID().toString());
        books.add(book);
    }
}
