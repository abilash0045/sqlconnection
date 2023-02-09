package com.sql.mysql.connection;

import javax.persistence.*;

@Entity
@Table(name="Authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int booksWritten;
    private int age;
    private String country;

    public Author() {
    }

    public Author(int id, String name, int booksWritten, int age, String country) {
        this.id = id;
        this.name = name;
        this.booksWritten = booksWritten;
        this.age = age;
        this.country = country;
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

    public int getBooksWritten() {
        return booksWritten;
    }

    public void setBooksWritten(int booksWritten) {
        this.booksWritten = booksWritten;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
