package fr.eql.ai11.Java.Init.demo.inheritance;

import fr.eql.ai11.Java.Init.demo.oop.Toy;

public class Racoon extends Animal{

    public Racoon(String name,
                  int age,
                  float size,
                  float weight,
                  Toy toy,
                  int registrationNumber) {
        super(name, age, size, weight, toy, registrationNumber);
    }

    @Override
    protected void fetchBall(int time) {
        System.out.println("Je nettoie " + time + " fois la baille.");
    }

    public void cleanFood(){
        System.out.println("Je nettoie ma nourriture avant de la mangé");
    }
}
