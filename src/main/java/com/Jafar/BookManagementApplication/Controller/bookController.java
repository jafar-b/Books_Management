package com.Jafar.BookManagementApplication.Controller;

import com.Jafar.BookManagementApplication.Entity.BookEntity;
import com.Jafar.BookManagementApplication.Repo.BookRepo;
import com.Jafar.BookManagementApplication.Service.bookService;
import jakarta.persistence.Id;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class bookController {

    @Autowired
    private bookService service;
    @Autowired
    private BookRepo book;
    @GetMapping("/")
    public String hello() {
        return "Hello world!!!";
    }

    @GetMapping("/get/{id}")
    public BookEntity getBook(@Validated  @NonNull @PathVariable("id") Long id){
return book.findById(id).get();
    }



    @PostMapping("/savebook")
    public BookEntity saveBook(@RequestBody BookEntity book) {
        try {
            service.saveBook(book);
            return book;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
