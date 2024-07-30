package com.choongang.Book.repositories;

import com.choongang.Book.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface AuthorRepository extends JpaRepository<Author, String>, QuerydslPredicateExecutor<Author> {
}
