package fr.eql.ai11.Java.Init.demo.inheritance;

import fr.eql.ai11.Java.Init.demo.oop.Toy;

    /*
        Abstract permet de spécifier que l'on ne peut pas créer une instance de cette classe
        Et pour accéder à son contenu il faut passer par l'instanciation d'un de ses enfants
        qui l'étend (S'ils ne sont pas eux même abstract).
    */
public abstract class Animal {
    private String name;
    private int age;
    private float size;
    private float weight;
    private Toy toy;
    private final int registrationNumber;

    public Animal() {
        registrationNumber = 1234;
    }

    public Animal(String name, int age, float size, float weight, Toy toy, int registrationNumber) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.weight = weight;
        this.toy = toy;
        this.registrationNumber = registrationNumber;
    }

    //Permet de créer une méthode abstraite qui n'est pas défini.
    //La définition se fera lors de l'instanciation d'un de ses enfants.

    //par contre, on ne peut pas le mettre en private car il doit être visible
    // par ses enfants lors de leur instanciation.

    //On peut le mettre en PROTECTED pour limiter sa visibilité a tous ses enfants
    //uniquement.
    protected abstract void fetchBall(int time);

    public float sizeWeightRatio(){
        return size / weight;
    }

    public String getName() {
        return name;
    }
}
