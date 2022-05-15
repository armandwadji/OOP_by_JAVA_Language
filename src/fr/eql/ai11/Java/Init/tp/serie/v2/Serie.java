package fr.eql.ai11.Java.Init.tp.serie.v2;

import javax.swing.JOptionPane;

public abstract class Serie {

    protected String title;
    protected int releaseYear;
    protected String synopsis;

    public Serie(String title, int release, String synopsis) {
        this.title = title;
        this.releaseYear = release;
        this.synopsis = synopsis;
    }

    public void displayAllInfo(){
        //Renvoi:  le nom, release, synopsis.
        JOptionPane.showMessageDialog(null,
                "Détail de la série : \n" +
                        "Title : " + title +
                        "\nAnnée : " + releaseYear +
                        "\nSynopsis : " + synopsis);
    }

    public abstract void displayByWriter(String writer);

    public abstract void displayInfoCategory(String category);
}
