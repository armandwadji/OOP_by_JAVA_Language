package fr.eql.ai11.Java.Init.tp.library.v1;

import fr.eql.ai11.Java.Init.demo.enums.DogBreed;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOOK {
    String title;
    String author;
    int isbn;
    String category;

    public BOOK() {
    }

    public BOOK(String title, String author, int isbn, String category) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
    }

    public BOOK recordBooks(){
        int booksNumber = Integer.parseInt(JOptionPane.showInputDialog("Combien de livres voulez enregistré."));
        Categories[] categories = Categories.values();
        List<BOOK> books = new ArrayList<>();
        for (int i = 0; i < booksNumber; i++) {
            String title = JOptionPane.showInputDialog("Entrez le titre du livre : ");
            String author = JOptionPane.showInputDialog("Entrez l' auteur du livre : ");
            int isbn = Integer.parseInt(JOptionPane.showInputDialog("Entrez l' isbn : "));
            String category = JOptionPane.showInputDialog("Entrez une catégorie parmis celles " +
                    "suivantes : " + Arrays.toString(categories));
            setTitle(title);
            setAuthor(author);
            setIsbn(isbn);
            setCategory(category);

            BOOK book = new BOOK(getTitle(), getAuthor(),getIsbn(), getCategory());
            books.add(book);
        }
        return ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "BOOK{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", category=" + category +
                '}';
    }
}
