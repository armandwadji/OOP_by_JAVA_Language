package fr.eql.ai11.Java.Init.demo.collection;

import fr.eql.ai11.Java.Init.demo.oop.Toy;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

    public static void main(String[] args) {

        /*  Une liste contient une collection d'éléments ordonnés
             et permet l'ajout de doublon
        */

        //initialisation d'une liste qui est une interface.
        List<Toy> toys = new ArrayList<>(); //Les chevrons <> ne sont pas nécessaires2

        //Ajouter des éléments (instances) à ma liste
        Toy toy1 = new Toy("Balle");
        Toy toy2 = new Toy("Souris en plastique");
        toys.add(toy1);
        toys.add(toy2);
        System.out.println("On ajoute deux instances toy dans la liste : \r\n" + toys + "\n");

        //Il est possible d'insérer un objet(instance) à un index précis
        Toy toy3 = new Toy("Branche");
        toys.add(1, toy3);
        System.out.println("On ajoute une instance dans une position choisit : \r\n" +toys + "\n");

        //Une liste permet de rajouter un doublon (une instance deja présente dans la liste)
        toys.add(toy3);
        System.out.println("On ajoute une instance en fin de liste : \r\n" +toys + "\n");   //Chaque éléments de la
        // liste liste toys pointe vers l'emplacement
                                    //de chaque instance
        System.out.println("On peut mettre des doublons dans la liste : \r\n" +toys + "\n");

        System.out.println("--- obtenir la taille de la liste ***");
        System.out.println("la liste contient : " + toys.size() + " jouets. \n");

        System.out.println("*** Liste des noms des jouets ***");
            //For Each : pour itérer sur chaque élément de la liste
            for (Toy t : toys) {
                System.out.println("    le jouet numéro " + toys.indexOf(t) + " est : "
                        + t.getToyName());
            }

        System.out.println("\n*** récupérer un élément à partir de son index ***");
            Toy thirdToy = toys.get(2);
            System.out.println("le 3 ième jouet de la liste (index 2) : " + thirdToy.getToyName());

        System.out.println("\n*** récupérer l'index à partir de la référence de l'instance ***");
            int toy2Index = toys.indexOf(toy2);
            System.out.println("index de la souris en plastique : " + toy2Index);

        System.out.println("\n*** Sppréssion d'éléments dans la liste par référence " +
                "ou par index ***");
            toys.remove(toy1);
            toys.remove(0);
            System.out.println("La liste ne contient plus que " + toys.size() + " éléments.");
            //For Each : pour itérer sur chaque élément de la liste
            for (Toy t : toys) {
                System.out.println("    le jouet numéro " + toys.indexOf(t) + " est : "
                        + t.getToyName());
            }

        System.out.println("\n*** Vider la liste ***");
            toys.removeAll(toys); //Il supprime tous les éléments de la liste
            //toys2.removeAll(toys1); //Permet de supprimé les éléments de toys1 qui se trouvent dans toy2.
            //toys = new ArrayList<>(); //Ou tous simplement on peut créer une liste vide

            if(toys.isEmpty()){
                System.out.println("la liste de jouets est vide.");
            }
    }
}
