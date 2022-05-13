package fr.eql.ai11.Java.Init.tp.serie.v2;

import fr.eql.ai11.Java.Init.tp.serie.v1.Episode;

import java.util.Collections;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("*** Series de films ***");

        //On crée les différents films de la saga
        Episode movie1 = new Episode("Ecole des sorcier","George Lucas");
        Episode movie2 = new Episode("Chambre des secrets","Lawrence Kasdan");
        Episode movie3 = new Episode("prisonnier d'ascaban","Lawrence Kasdan");

        //On crée une liste de film
        MovieTv saga = new MovieTv(
                "Harry potter",
                2010,
                "Film de sorcèlerie");

        Collections.addAll(saga.getSaga(), movie1,movie2,movie3);
        saga.displayInfoCategory("title");
        saga.displayInfoCategory("year");
        saga.displayInfoCategory("synopsis");
        saga.displayByWriter("Robert Noname");
    }
}
