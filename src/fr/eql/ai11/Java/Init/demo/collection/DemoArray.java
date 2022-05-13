package fr.eql.ai11.Java.Init.demo.collection;

public class DemoArray {
    public static void main(String[] args) {

        //Initialisation et peuplement d'un tableau à une dimension
            //En convention le nom d'une collection doit toujours avoir un s à la fin
            String[] totos = new String[5];
            String[] seasons = {"printemps", "Eté", "Automne", "Hiver"};

        System.out.println("*** Lecture du troisième élément du tableau ***");
        System.out.println(seasons[2]);

        System.out.println("*** Lecture de tous les éléments du tableau ***");
            for(int i = 0 ; i < seasons.length; i++ ){
                System.out.print(seasons[i] + " - ");

                if(i == seasons.length - 1){
                    System.out.print(seasons[i] + ".");

                }
            }

    }
}
