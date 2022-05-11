package fr.eql.ai11.Java.Init.demo.collection;

import fr.eql.ai11.Java.Init.demo.oop.Toy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoHashSet {
    public static void main(String[] args) {
        /*
            Un Set contient une collection d'éléments non ordonnés
            et garantissant l'unicité des éléments contenus.
         */

        //Initialisation d'un Set
        Set<Toy> toys = new HashSet<>();

        //Ajouter des items au Set.
        Toy toy1 = new Toy("Balle");
        Toy toy2 = new Toy("Souris en plastique");
        Toy toy3 = new Toy("Branche");

        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);

        System.out.println("*** Obtenir la taille et les éléments du Set ***");
            System.out.println("Taille : " + toys.size());
        System.out.println("--- Tentative d'ajout d'une instance déja présente dans le Set ---");
            toys.add(toy3);
        System.out.println("Même taille après ajout: " + toys.size());

        /*
            Si les méthodes equals() et hashCode() ont été redéfinies dans la classe Toy,
            une égalité sur certains attributs constituera un doublon et ne sera donc pas
            implémenter.
         */

        Toy toy4 = new Toy("Branche");
        /*
            Si on redéfinit les méthodes equals() et hashCode() de Toy de telle sorte
            que la comparaison entre objets porte sur la valeur de l'attribut toyName,
            alors une égalité entre deux instances de Toy sera établie lorsque la
            valeur de cet attribut est la même dans les deux instances.
            Cette égalité sera établie par hashSet pour éviter d'insérer un doublon.
         */
        System.out.println("** Si equals() et hashCode() de Toy redéfinis");
            System.out.println("*** Obtenir la taille et les éléments du Set ***");
            System.out.println("Taille : " + toys.size());
            System.out.println("--- Tentative d'ajout d'une instance dont l'attribut " +
                    " \n toyName est égal à celui d'une instance déjà présente ---");
            toys.add(toy4);
            System.out.println("Même taille après ajout: " + toys.size());


        System.out.println("\r\n*** Affichage des éléments ***");
            //La liste afficher ne sera pas dans un ordre précis(par exemple
            // l'ordre d'ajout)
            for (Toy t : toys) {
                //On peut avoir l'index, car il n'y a pas d'ordre dans un Set
                System.out.println("Toy " + t.getToyName());
            }

        System.out.println("\r\n*** Supprimer des éléments du Set par référence***");
            toys.remove(toy1);
            System.out.println("Le Set ne contient plus que " +
                    toys.size() + " éléments.");
            System.out.println("\r\n*** Vider le Set ***");
            //toys.removeAll(toys);
            toys = new HashSet<>();

            if(toys.isEmpty()) System.out.println("Le Set toys est vide");

            //On peut convertir un Set en Liste
            //List<Toy> toysList =  new ArrayList<>(toys);


    }
}
