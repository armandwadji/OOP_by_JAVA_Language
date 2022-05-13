package fr.eql.ai11.Java.Init.tp.serie.v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {

        /***** SERIE DRAGON BALL ****/
        //Crétion de 4 séries de deux écrivains :
        Episode episode1 = new Episode("Dragon","Robert Noname");
        Episode episode2 = new Episode("Ball","John Coolname");
        Episode episode3 = new Episode("Hello Sue-Hellen","Robert Noname");
        Episode episode4 = new Episode("All the money","Mister T");
        Episode episode5 = new Episode("Petrol","Robert Noname");
        Episode episode6 = new Episode("Houston isn't here","Mister T");

        //Création de la saison de deux écrivains
        List<Episode> episodesArmand = new ArrayList<>();

        //On crée une saison par auteur
        //La méthode statique addAll() de l'objet Collections permet d'ajouter un
        // ensemble d'éléments (dont le nombre peut varier) à une collection spécifiée
        //en premier argument

        Season season1 = new Season(1);
        Collections.addAll(season1.getEpisodes(), episode1,episode2,episode3);
        Season season2 = new Season(2);
        Collections.addAll(season2.getEpisodes(), episode4,episode5,episode6);

        //On crée une liste de 2 saisons par série
        /*
            List<Season> seasonsDragonBall = new ArrayList<>();
            seasonsDragonBall.add(seasonsArmand1);    //Plus besoin de créer la liste, on utilise le getter.
            seasonsDragonBall.add(seasonsArmand1);
        */
        //On crée la série Dragon Ball
        Serie dragonBall = new Serie(
                                    "Dragon ball",
                                    2000,
                                    "Série Animer mangas");
        Collections.addAll(dragonBall.getSeasons(), season1, season2);
        dragonBall.displayByWriter("Robert Noname");


//        /***** SERIE HARRY POTTER ****/
//        //Crétion de 4 séries de deux écrivains :
//
//
//        //On crée une liste d'épisodes
//        List<Episode> episodesElie = new ArrayList<>();
//
//
//        //On crée une saison par auteur
//        Season seasonsElie1 = new Season(1);
//        Season seasonsElie2 = new Season(2);
//
//        //On crée une liste de 2 saisons par série
//        //La méthode statique addAll() de l'objet Collections permet d'ajouter un
//        // ensemble d'éléments (dont le nombre peut varier) à une collection spécifiée
//        //en premier argument
//        Collections.addAll(seasonsElie1.getEpisodes(), episode4,episode5,episode6);
//
//        //On crée la série Harry Potter
//        Serie harryPotter = new Serie("Harry potter", 2010,
//                                    "Saga de l'histoire d'un sorcier");
//
//        Collections.addAll(harryPotter.getSeasons(), seasonsArmand1, seasonsArmand2);







    }
}
