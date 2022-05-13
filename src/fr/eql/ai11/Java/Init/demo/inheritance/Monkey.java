package fr.eql.ai11.Java.Init.demo.inheritance;

import fr.eql.ai11.Java.Init.demo.oop.Toy;

public class Monkey extends Animal implements IntelligentAnimal, StandingAnimal2{
    @Override
    protected void fetchBall(int time) {
        System.out.println("je jongle avec " + time + " balles.");
    }

//    @Override
//    public void hideItem(String item) {
//        System.out.println("Je cache le " + item + " dans un trou" +
//                "creusé au préalable.");
//    }

    @Override
    public void standup() {
        System.out.println("je me lève sur mes pattes arrières pour " +
                "attraper une banane.");
    }

    public Monkey(String name, int age, float size, float weight, Toy toy, int registrationNumber) {
        super(name, age, size, weight, toy, registrationNumber);
    }

    @Override
    public void hideItem() {
        System.out.println("Je cache le " + getToy().getToyName() + " dans un trou" +
                " creusé au préalable.");
    }


}
