package fr.eql.ai11.Java.Init.demo.inheritance;

import fr.eql.ai11.Java.Init.demo.enums.CatBreed;
import fr.eql.ai11.Java.Init.demo.oop.Toy;

public class Cat extends Animal{

    private CatBreed breed;

    public Cat(String name,
               int age,
               float size,
               float weight,
               Toy toy,
               int registrationNumber,
               CatBreed breed) {
        super(name, age, size, weight, toy, registrationNumber);
        this.breed = breed;
    }

    public void meow(){
        System.out.println("MIaaaaaaaaou...");
    }

    @Override
    protected void fetchBall(int time) {
        System.out.println("je regarde passer " + time +
                " fois l'inintéressante balle.");
    }

    public CatBreed getBreed() {
        return breed;
    }
}
