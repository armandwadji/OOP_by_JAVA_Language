package fr.eql.ai11.Java.Init.tp.library.v1;

import javax.swing.JOptionPane;

public class Launcher {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("veuillez entrez votre nom : ");
        String surName = JOptionPane.showInputDialog("veuillez entrez votre prénom : ");
        String address = JOptionPane.showInputDialog("veuillez entrez votre adress : ");
        System.out.println(name + " " + surName + " " + address);




    }
}
