package fr.eql.ai11.Java.Init.tp.library.v1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    String name;
    String surName;
    String address;
    List<Book> books = new ArrayList<>();

    public Reader() {
    }

    public Reader(String name, String surName, String address, List<Book> books) {
        this.name = name;
        this.surName = surName;
        this.address = address;
        this.books = books;
    }

    public void principalMenu(List<Book>books){
//        System.out.println(   getName() + " - "
//                            + getSurName() + " - "
//                            + getAddress() + " - "
//                            + getBooks().size());

        boolean inApplication;
        Book book = new Book();
//        List<Book> books = new ArrayList<>();

        do {
            inApplication = true;
            int optionNumber;
           

            System.out.println(/*** BIENVENUE DANS L'APPLICATION READERBOOKS ***/);

            if(getBooks().size() > 0){
                 optionNumber = Integer.parseInt(JOptionPane.showInputDialog(""
                        + "- Afficher votre profil Taper   1 : \n"
                        + "- Enregistrer des livres Taper  2 : \n"
                        + "- Quitter l'application Taper   3 : \n"
                        + "- Listé vos livres Taper        4 : \n" ));

            }else{
                 optionNumber = Integer.parseInt(JOptionPane.showInputDialog(""
                        + "- Afficher votre profil Taper 1 :  \n"
                        + "- Enregistrer des livres Taper 2 :  \n"
                        + "- Quitter l'application Taper  3 :  \n" ));
            }
           inApplication =  switchFunction(optionNumber, inApplication, book);

        }while (inApplication);

        JOptionPane.showMessageDialog(null,
                "Merci d'avoir utiliser l'application");


    }

        public  boolean switchFunction(int optionNumber, boolean inApplication, Book book){

            switch (optionNumber){
                case 1:
                    JOptionPane.showMessageDialog(null, "Profil utilisateur : "
                            + "\r\nNom : " + getName()
                            + "\r\nprenom : " + getSurName()
                            + "\r\nAddress : " + getAddress());
                    break;
                case 2:
                    book.recordBooks(books);
                    break;
                case 3:
                    inApplication = false;
                    break;
                case 4:
                    books = getBooks();
                    showBooks(books);
                    break;
                default:
            }
            return inApplication;
        }

    public void showBooks(List<Book> books){
        String show = "";
        for (Book book : books) {
            show += "Livre " + (books.indexOf(book) + 1) + " : "
                    + "[ title : " + book.getTitle()
                    + ", Author : " + book.getAuthor()
                    + ", isbn : " + book.getIsbn()
                    + ", Catégorie : " + book.getCategory()
                    + "]\r\n";


        }

        JOptionPane.showMessageDialog(null, show);
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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
