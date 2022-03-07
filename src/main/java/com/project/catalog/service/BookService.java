package com.project.catalog.service;

import com.project.catalog.form.BookForm;
import com.project.catalog.model.Book;

import java.util.List;


public interface BookService {

    public List<Book> findBookAll();

    public void createNewBook(BookForm bookForm);
}
