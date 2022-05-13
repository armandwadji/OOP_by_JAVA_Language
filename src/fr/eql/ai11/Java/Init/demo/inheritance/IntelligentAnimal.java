package fr.eql.ai11.Java.Init.demo.inheritance;

/*
       Une interface, est une sorte de classe au contenue entièrement abstrait.
       Tous les attributs s'il y en a, doivent être statique, mais il est
       recommandé de ne pas en mettre.
 */

public interface IntelligentAnimal {
    /*
        Toutes les méthodes d'une interface sont abstraites et publique.
        Il n'est donc pas nécessaire d'écrire ces deux mots clés.
     */
    void hideItem(String item);

}
