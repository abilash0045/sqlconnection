package com.sql.mysql.connection;

import javax.persistence.*;

@Entity
@Table(name="Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int pages;
    @ManyToOne
    @JoinColumn
    Author author;

    public Book() {
    }

    public Book(int id, String name, int pages) {
        this.id = id;
        this.name = name;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
