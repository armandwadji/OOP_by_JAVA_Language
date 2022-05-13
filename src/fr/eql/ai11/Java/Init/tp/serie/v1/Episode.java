package fr.eql.ai11.Java.Init.tp.serie.v1;

public class Episode {
    private String title;
    private String writer;


    public Episode(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }
}
