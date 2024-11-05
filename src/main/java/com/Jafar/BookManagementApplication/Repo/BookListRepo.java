package com.Jafar.BookManagementApplication.Repo;

import com.Jafar.BookManagementApplication.Entity.BookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookListRepo extends JpaRepository<BookList, Long> {
}
