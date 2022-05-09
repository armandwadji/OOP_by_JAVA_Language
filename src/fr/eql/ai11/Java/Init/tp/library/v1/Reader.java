package fr.eql.ai11.Java.Init.tp.library.v1;

import javax.swing.*;
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

    public void principalMenu(){
//        System.out.println(   getName() + " - "
//                            + getSurName() + " - "
//                            + getAddress() + " - "
//                            + getBooks().size());

        boolean inApplication;
        ArrayList<BOOK> books = new ArrayList<>();
        do {
            inApplication = true;
            int optionNumber;
            System.out.println(/*** BIENVENUE DANS L'APPLICATION READERBOOKS ***/);

            if(getBooks().size() > 0){
                 optionNumber = Integer.parseInt(JOptionPane.showInputDialog(""
                        + "-Si vous voulez afficher votre profil : Taper 1 \n"
                        + "-Si vous voulez enregistrer des livres : Taper 2 \n"
                        + "-Si vous voulez quitter l'application  : Taper 3 \n"
                        + "-Si vous voulez listé vos livres       : Taper 4" ));

            }else{
                 optionNumber = Integer.parseInt(JOptionPane.showInputDialog(""
                        + "-Si vous avoulez afficher votre profil : Taper 1 \n"
                        + "-Si vous voulez enregistrer des livres : Taper 2 \n"
                        + "-Si vous voulez quitter l'application : Taper 3 " ));
            }

            switch (optionNumber){
                case 1:
                    JOptionPane.showMessageDialog(null, "Profil utilisateur : \r\n"
                            + "Nom : " + getName()
                            + "\r\nprenom : " + getSurName()
                            + "\r\nAddress : " + getAddress());
                    break;
                case 2:
//                    System.out.println("Enregistrer un livre");
                    BOOK book = new BOOK();
//                    book.recordBooks();
                    books.add(book.recordBooks());
                    break;
                case 3:
//                    System.out.println("Quitter l'application");
                    inApplication = false;
                    break;
                case 4:
                    System.out.println("Afficher les livres");
                    break;
                default:
            }

        }while (inApplication);

        JOptionPane.showMessageDialog(null, "Merci d'avoir utiliser l'application");


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
