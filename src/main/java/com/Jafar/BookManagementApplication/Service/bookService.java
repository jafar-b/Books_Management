package com.Jafar.BookManagementApplication.Service;

import com.Jafar.BookManagementApplication.Entity.BookEntity;
import com.Jafar.BookManagementApplication.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookService {
    @Autowired
    private BookRepo book;

    public void saveBook(BookEntity b) {
        book.save(b);
    }


    public List<BookEntity> getAllBooks() {
        return book.findAll();
    }

    public void deleteAllBooks() {
        book.deleteAll();
    }

    public BookEntity getById(Long id) {
        return book.findById(id).get();
    }

    public void deleteById(Long id) {
        book.deleteById(id);
    }


}
