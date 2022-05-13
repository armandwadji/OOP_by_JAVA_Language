package fr.eql.ai11.Java.Init.tp.serie.v2;

import fr.eql.ai11.Java.Init.tp.serie.v1.Episode;
import fr.eql.ai11.Java.Init.tp.serie.v1.Season;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class SerieTV extends Serie{

    private List<Season> seasons = new ArrayList<>();


    public SerieTV(String title, int release, String synopsis) {
        super(title, release, synopsis);
    }

    @Override
    public void displayInfoCategory(String category) {
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


    @Override
    public void displayByWriter(String writer) {

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
