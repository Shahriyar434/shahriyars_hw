package com.library.dea.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    private double price;
    private int pages_count;
    private String language;
    private String genre;
    private String settings;
    private String characters;
    private int year_of_publication;

    // constructor
    public Book (Integer id, String title, String author, double price,
    int pages_count, String language, String genre, String settings, String characters, int year_of_publication){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages_count = pages_count;
        this.language = language;
        this.genre = genre;
        this.settings = settings;
        this.characters = characters;
        this.year_of_publication = year_of_publication;
    }

    public Book() {}

    // getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages_count() {
        return pages_count;
    }

    public void setPages_count(int pages_count) {
        this.pages_count = pages_count;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public int getYear_of_publication() {
        return year_of_publication;
    }

    public void setYear_of_publication(int year_of_publication) {
        this.year_of_publication = year_of_publication;
    }
}
