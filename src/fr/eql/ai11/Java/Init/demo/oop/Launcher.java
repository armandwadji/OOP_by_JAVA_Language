package fr.eql.ai11.Java.Init.demo.oop;

public class Launcher {
    public static void main(String[] args) {

        //Instanciation d'un objet avec son constructeur vide.
        Dog dog1 = new Dog();

        //Création d'une instance de Toy
        Toy dog2Toy = new Toy("Baballe");

        //Instanciation s'un objet avec le constructeur surchargé
        Dog dog2 = new Dog("Fido", 8, 100, 30, dog2Toy);

        //Affectation des attributs à dog1 grace a son setter
        dog1.setName("Laika");
        dog1.setAge(12);
        dog1.setSize(80);
        dog1.setWeight(20);

        //Affichage des attributs grâce à leur getter
        System.out.println("Ce chien s'appelle : " + dog1.getName() + "\r\n" +
                "Il à " + dog1.getAge() + " ans " + " et pèse "
                + dog1.getWeight() + " kg \r\n");

        System.out.println("Ce chien s'appelle : " + dog2.getName() + "\r\n" +
                "Il à " + dog2.getAge() + " ans " + " pèse "
                + dog2.getWeight() + " kg." + " son jouait est  " +
                  dog2.getToy().getToyName() + "\r\n");

        /******* DEUX EXEMPLES **********/

        String dog2ToyName;
        
        //Récupération du nom du jouet de dog2 (en 2 étapes)
        Toy dog2ToyInstance = dog2.getToy();
        dog2ToyName = dog2ToyInstance.getToyName();
        System.out.println("Nom du jouet initialement crée : " + dog2ToyName);


        //Récupération du nom du jouet de dog2 (en 1 étape)
        dog2.getToy().setToyName("Nonosse"); //on modifie d'abord le nom du jouet
        dog2ToyName = dog2.getToy().getToyName();
        System.out.println("Nom du jouet éditer en : " + dog2ToyName + "\n");
        
        //dog2.getToy().getToyName() cela nous permet d'aller dans l'objet 
        // toy et d'aller chercher le nom du jouet en question

        /************************************/
        
        /*  Si l'attribut (variable d'instance) "name" de l'objet Dog est public,
            Alors on peut directement y accéder et le changer sans passer par des
            Accesseurs (plus précisément un Setter). Ce qui n'est pas une bonne
            pratique.

            System.out.println(dog1.name);
            dog1.name = "toto";
            System.out.println(dog1.name);

         */

        //Appel des méthodes :
            //Méthodes sans attribut en entré
            dog1.bark();
            dog2.bark();
            System.out.println("\n");

            //Méthodes avec attribut en entré
            dog1.fetchBall(5, "Baballe");
            dog2.fetchBall(10, "Nonosse");
            System.out.println("\n");

            //Méthode qui nous renvoie quelque chose
            System.out.println("l'IRM de " + dog1.getName() +
                    " est " +dog1.sizeWeightRatio() + " kg.");
            System.out.println("l'IRM de " + dog2.getName() +
                    " est " +dog2.sizeWeightRatio() + " kg.");
            System.out.println("\n");

            //Les méthodes herités des parents
            System.out.println(dog1.toString());
            System.out.println(dog2.toString()); //Il nous donne le chemin
                                                // de l'emplacement mémoire


    }
}
