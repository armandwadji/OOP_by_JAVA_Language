package fr.eql.ai11.Java.Init.tp.serie.v1;

import java.util.ArrayList;
import java.util.List;

public class Season {
    private int seasonNumber;
    List<Episode> episodes = new ArrayList<>();

    public Season(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }


    public List<Episode> getEpisodes() {
        return episodes;
    }

}
