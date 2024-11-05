package com.Jafar.BookManagementApplication.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookEntity {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String title;
private String Author;
private int price;
public BookEntity(){}

    public BookEntity(Long id, String title, String author, int price) {
        this.id = id;
        this.title = title;
        this.Author = author;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
