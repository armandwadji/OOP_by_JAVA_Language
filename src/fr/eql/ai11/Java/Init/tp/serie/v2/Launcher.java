package fr.eql.ai11.Java.Init.tp.serie.v2;

import fr.eql.ai11.Java.Init.tp.serie.v1.Episode;
import fr.eql.ai11.Java.Init.tp.serie.v1.Season;
import fr.eql.ai11.Java.Init.tp.serie.v1.Serie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("*** Series de films ***");

            /*** ON CREER LA SAGA D'UN FILM ***/
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

        /*** ON CREER LES SAISONS D'UNE SERIE ***/

        //Création de 4 séries de deux écrivains :
        Episode episode1 = new Episode("Dragon","Robert Noname");
        Episode episode2 = new Episode("Ball","John Coolname");
        Episode episode3 = new Episode("Hello Sue-Hellen","Robert Noname");
        Episode episode4 = new Episode("All the money","Mister T");
        Episode episode5 = new Episode("Petrol","Robert Noname");
        Episode episode6 = new Episode("Houston isn't here","Mister T");

        List<Episode> episodesArmand = new ArrayList<>();

        Season season1 = new Season(1);
        Collections.addAll(season1.getEpisodes(), episode1,episode2,episode3);
        Season season2 = new Season(2);
        Collections.addAll(season2.getEpisodes(), episode4,episode5,episode6);

        fr.eql.ai11.Java.Init.tp.serie.v1.Serie dragonBall = new Serie(
                "Dragon ball",
                2000,
                "Série Animer mangas");
        Collections.addAll(dragonBall.getSeasons(), season1, season2);
        dragonBall.displayByWriter("Robert Noname");
    }
}
