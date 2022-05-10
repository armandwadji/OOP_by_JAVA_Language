package fr.eql.ai11.Java.Init.tp.library.v1;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Launcher {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("veuillez entrez votre nom : ");
        String surName = JOptionPane.showInputDialog("veuillez entrez votre prénom : ");
        String address = JOptionPane.showInputDialog("veuillez entrez votre address : ");
//        List<Book>books = new ArrayList<>();

//        Reader person = new Reader("WADJI","Armand","21 rue",books );
        Reader person = new Reader(name,surName,address );
        person.principalMenu();


    }
}
