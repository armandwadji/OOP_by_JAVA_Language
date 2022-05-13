package fr.eql.ai11.Java.Init.tp.serie.v2;

import fr.eql.ai11.Java.Init.tp.serie.v1.Episode;
import fr.eql.ai11.Java.Init.tp.serie.v1.Season;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class MovieTv extends Serie{

   private List<Episode> saga = new ArrayList<>();

    public MovieTv(String title, int release, String synopsis) {
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
            default:
                System.out.println("Aucun item ne correspond à ce label");
        }
    }

    @Override
    public void displayByWriter(String writer) {
        System.out.println("Film écrits par : " + writer);
        for (Episode movie : saga) {
            if(movie.getWriter().equals(writer)){

                System.out.println("-title : " + movie.getTitle());
            }

        }
    }

    public List<Episode> getSaga() {
        return saga;
    }
}
