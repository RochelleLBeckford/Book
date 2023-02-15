package com.rochelle.books.models;

// @Entity is an ORM [object relational mapper]-> will write the SQL for me
public class Book {
    // the books attributes -> title, author, pages, description 
    private String title;
    private String author;
    private Integer pages;
    private String description;

    // ~ inorder to be able to access these attributes and in order to make new books 
    // -> need constructor
    // -> generate an empty constructor
    public Book() {
    }

    // ~ generate a constructor w/ all of the fields
    public Book(String title, String author, Integer pages, String description) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.description = description;
    }

    
    /* 
    ~ since private need to access them -> getters and setters
    ~ POJO -> Plain old java object
        -> specific format for creating objects in java
        -> it has to have private attributes 
        -> it has to have a constructor that takes all the params
        -> it has to have getters and setters
        -> it has to have serialized
    -> spring will be able to use it w/o any other set up or config from us -> will be able to access our programs 
    ~ Now can go into controller
    */
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return this.pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

