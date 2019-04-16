package com.example.demo.commandside.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Book;

public interface BookCommandRepository extends JpaRepository<Book, Integer>{

}
