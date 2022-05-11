package fr.eql.ai11.Java.Init.demo.inheritance;

import fr.eql.ai11.Java.Init.demo.enums.CatBreed;
import fr.eql.ai11.Java.Init.demo.enums.DogBreed;
import fr.eql.ai11.Java.Init.demo.oop.Toy;

import java.util.HashSet;
import java.util.Set;

public class Launcher {
    public static void main(String[] args) {

        System.out.println("\t*** Dog : FIdo ***");
        Dog fido = new Dog("Fido",
                8,
                100,
                30,
                new Toy("Baballe"),
                45554,
                DogBreed.FOX_TERRIER);

        fido.fetchBall(5);
        System.out.println("L' IRM de " + fido.getBreed().name() + " est :"
                + fido.sizeWeightRatio());
        fido.bark();

        System.out.println(" ");

        System.out.println("\t*** Cat: Felix ***");
        Cat felix = new Cat("Felix",
                12,
                50,
                6,
                new Toy("Carton"),
                56156545,
                CatBreed.BENGAL);

        felix.fetchBall(10);
        System.out.println("L' IRM de " + felix.getBreed().name() + " est : "
        + felix.sizeWeightRatio());
        felix.meow();

        System.out.println("\t*** Animal : Spike ***");
        /*
            Je stocke la réference à une instance de type Dog dans une variable
            du type de sa superclasse(ici Animal).
            Je n'ai désormais plus accès qu'aux attributs et méthodes d'un Animal,
            bien que l'instance en mémoire soit de type Dog.
         */
        Animal spike = new Dog("Spike",
                11,
                120,
                35,
                new Toy("Nonosse"),
                4556,
                DogBreed.BERGER);
        spike.fetchBall(2);
        spike.sizeWeightRatio();
        // spike.bark();
        // spike.getBreed();

        /*** CASTE ***/
        /*
            Je copie la reference de l'instance spike (de type Animal) dans une variable de type Dog.
            Je retrouve ainsi la possibilité d'accéder aux méthodes et attributs spécifiques à un objet
            de type Dog.
         */
        Dog castedSpike = (Dog) spike;  //On demande au compilateur d'accepter que
                                        // la variable Animal est un Dog.
        castedSpike.bark();
        System.out.println("Spike de type Animal est un  : " + castedSpike.getBreed());

        System.out.println("\t*** Animal : Garfield ***");
            Animal garfield = new Cat("GArfield",
                    12,
                    50,
                    6,
                    null,
                    9515,
                    CatBreed.BENGAL);

             System.out.println("L'IRLM de " + garfield.getName() + garfield.sizeWeightRatio());
            garfield.fetchBall(6);
            //On stock garfield dans une variable type Cat pour accédé a sa méthode meow
            Cat castedGarfield = (Cat) garfield;
            castedGarfield.meow();

        System.out.println("\n*** Boucle sur les animaux ***");
            Set<Animal> animals = new HashSet<>();

            animals.add(fido);
            animals.add(felix);
            for (Animal animal : animals) {
                //On vérifie le type de l'instance sortie de la collection à chaque tour de boucle
                if(animal instanceof Dog) {
                    System.out.println(animal.getName() + " est un chien.");
                    Dog dog = (Dog) animal;
                    dog.bark();
                }

                if(animal instanceof Cat) {
                    System.out.println(animal.getName() + " est un chat.");
                    Cat cat = (Cat) animal;
                    cat.meow();
                }

            }
            Animal raccon = new Racoon("Rocky",
                    5,
                    50,
                    10,
                    null,
                    0);
            animals.add(raccon);

            AnimalParade parade = new AnimalParade();
            parade.parade(animals);

    }
}
