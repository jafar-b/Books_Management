package com.Jafar.BookManagementApplication.Repo;

import com.Jafar.BookManagementApplication.Entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<BookEntity,Long> {

}
