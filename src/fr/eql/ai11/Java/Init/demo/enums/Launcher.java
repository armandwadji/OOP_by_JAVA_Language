package fr.eql.ai11.Java.Init.demo.enums;

public class Launcher {
    public static void main(String[] args) {
        DogBreed breed;
        System.out.println("*** Affection d'une variable de type enum ***");
            breed = DogBreed.SPITZ; //On va chercher une valeur d'énumération
            System.out.println("Valeur de la variable : " + breed);

        System.out.println("\r\n*** Transformer une chaîne de caratères" +
                "en valeur d'énum ***");
            breed = DogBreed.valueOf("LEVRIER");
            System.out.println("Valeur de la variable : " + breed);

        System.out.println("\r\n*** Afficher toutes les valeurs d'une enum ***");
        DogBreed[] breeds = DogBreed.values();
        System.out.println(breeds);
        for (DogBreed db : breeds) {
            System.out.println(db);
        }
    }
}
