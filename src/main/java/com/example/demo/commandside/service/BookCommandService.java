package com.example.demo.commandside.service;

import com.example.demo.entity.Book;

public interface BookCommandService {
  Book createBook(Book book);
  Book updateBook(Book book);
  Book deleteBook(int uid);
}
