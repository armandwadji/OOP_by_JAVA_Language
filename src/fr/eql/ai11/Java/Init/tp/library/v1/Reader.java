package fr.eql.ai11.Java.Init.tp.library.v1;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    String name;
    String surName;
    String address;
    List<BOOK> books = new ArrayList<>();

    public Reader() {
    }

    public Reader(String name, String surName, String address, List<BOOK> books) {
        this.name = name;
        this.surName = surName;
        this.address = address;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<BOOK> getBooks() {
        return books;
    }

    public void setBooks(List<BOOK> books) {
        this.books = books;
    }
}
