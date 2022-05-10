package fr.eql.ai11.Java.Init.tp.library.v1;

import javax.swing.*;
import java.util.List;

public class Book {
    String title;
    String author;
    int isbn;
    String category;

    public Book() {
    }

    public Book(String title, String author, int isbn, String category) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
    }

    public void recordBooks(List<Book> books){
        //On récupère la valeur en entier du nombre de livres à ajouter saisi par l'utilisateur
        int booksNumber = Integer.parseInt(JOptionPane.showInputDialog("Combien de livres voulez enregistré."));

        //On crée un tableau de contenant toutes les catégories.
        Categories[] categories = Categories.values();


        //On boucle sur le nombre de livres à insérés choisit par l'utilisateur
        for (int i = 0; i < booksNumber; i++) {

            //On récupère les paramètres de chaque livre
            String title = JOptionPane.showInputDialog("Entrez le titre du livre : " + (i+1));
            setTitle(title);//On les implémente par le setter

            String author = JOptionPane.showInputDialog("Entrez l' auteur du livre : " + (i+1));
            setAuthor(author);

            int isbn = Integer.parseInt(JOptionPane.showInputDialog("Entrez l' isbn du livre" +
                    " : " + (i+1)));
            setIsbn(isbn);

            String showCategories = "";
            for (Categories category : categories) {
                showCategories += "- " + category.toString() + "\r\n";
            }
            String category = JOptionPane.showInputDialog("Entrez une catégorie parmi celles " +
                    "suivantes : \r\n" + showCategories);
            setCategory(category);

            //On crée une instance de livre grâce aux getters
            Book book = new Book(getTitle(), getAuthor(),getIsbn(), getCategory());

            //On ajoute à la liste des livres
            books.add(book);
        }

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

}
