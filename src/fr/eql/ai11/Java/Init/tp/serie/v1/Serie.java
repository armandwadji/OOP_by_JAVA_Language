package fr.eql.ai11.Java.Init.tp.serie.v1;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Serie {

    private String title;
    private  int releaseYear;
    private String synopsis;
    private List<Season> seasons = new ArrayList<>();

    public Serie(String title, int releaseYear, String synopsis) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.synopsis = synopsis;
    }

    public void displayInfoCategory(String category){
        switch (category){
            case "title":
                JOptionPane.showMessageDialog(null,
                        "Title : " + title );
                break;
            case "year":
                JOptionPane.showMessageDialog(null,
                        "Année de sortie : " + releaseYear );
                break;
            case "synopsis" :
                JOptionPane.showMessageDialog(null,
                        "Année de sortie : " + synopsis );
                break;
            case "seasons":
                String seasonsInfo = "la série " + title + " possède " + seasons.size() + " saison.";

                for (Season season : seasons) {
                    seasonsInfo += "\nla saison " + season.getSeasonNumber() +
                            " possède " + season.getEpisodes().size() + " épisodes : ";
                }
                JOptionPane.showMessageDialog(null,
                        "Info saisons : " + seasonsInfo );
                break;
            default:
                System.out.println("Aucun item ne correspond à ce label");
        }

    }

    public void displayAllInfo(){
        //Renvoi:  le nom, release, synopsis.
        JOptionPane.showMessageDialog(null,
                "Détail de la série : \n" +
                "Title : " + title +
                "\nAnnée : " + releaseYear +
                "\nSynopsis : " + synopsis);
    }



    public void displayByWriter(String writer){
        System.out.println("Episode écrits par : " + writer);
        for (Season season : seasons) {
            System.out.println("\t* saison " + season.getSeasonNumber());
            List<Episode> episodes = season.getEpisodes();

            for (Episode episode : episodes) {
                if(episode.getWriter().equals(writer)){
                    System.out.println("\t\t- title : " + episode.getTitle());
                }
            }
        }

    }

    public List<Season> getSeasons() {
        return seasons;
    }
}
