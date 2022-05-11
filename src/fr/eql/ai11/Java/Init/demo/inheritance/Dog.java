package fr.eql.ai11.Java.Init.demo.inheritance;

import fr.eql.ai11.Java.Init.demo.enums.DogBreed;
import fr.eql.ai11.Java.Init.demo.oop.Toy;

public class Dog extends Animal {

    private DogBreed breed;

    public Dog() {
        //Cette instruction appel le constructeur VIDE du parent,
        // elle est implicite, et n'a donc pas besoin d'être notée.
        //Elle est forcément en première position.
        super();
    }
    /*
        Ce constructeur à 7 arguments appel avec super(...) le constructeur
        de la superclasse (classe mère ici "Animal") qui prend 6 arguments :
        - Les 6 premiers arguments donnent des valeurs aux attributs de la classe mère.
        - Le dernier argument sert à donner une valeur à l'attribut de la classe ici présente.
    */
    public Dog(String name,
               int age,
               float size,
               float weight,
               Toy toy,
               int registrationNumber,
               DogBreed breed) {
        super(name, age, size, weight, toy, registrationNumber);
        this.breed = breed;
    }

    /*
        Ce constructeur à 5 arguments appèle avec this() l'autre constructeur de la
        classe contenant 7 arguments en lui fournissant des valeurs prédéfinies pour les
        deux derniers arguments.
     */

    public Dog(String name, int age, float size, float weight, Toy toy){
        this(name, age, size, weight, toy, 1234, DogBreed.BERGER);
    }

    //La signature de la méthode abstraite du parent à une vibilité
    //protected.
    //Je peux changer cette visibilité vers un niveau moins restrictif
    //Exemple : on met fetchBall en public pour qu'il soit accessible par ses
    // enfants du même package ou pas.
    @Override
    public void fetchBall(int time) {
        System.out.println("Je vais cherché avec enthousiasme la baballe "
        + time + " fois.");
    }

    //Une méthode spécifique au Dog, non présente dans son parent.
    public void bark(){
        System.out.println("Ouafff ! Ouaffff !");
    }

    public DogBreed getBreed() {
        return breed;
    }
}
