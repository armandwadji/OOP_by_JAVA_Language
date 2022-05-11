package fr.eql.ai11.Java.Init.demo.inheritance;

import java.util.Set;

public class AnimalParade {

    public void parade(Set<Animal> animals){
        System.out.println("\n\t Voici la parade des animaux");
        int index = 0;
        for (Animal animal : animals) {
            index++;
            System.out.println("\r\n- Animal " + index + " -");
            float ratio = animal.sizeWeightRatio();
            System.out.println(animal.getName() +
                    " monte sur la balance après avoir été mésuré." +
                    "\r\nSon rapport taille/poids est le suivant : " + ratio);
            System.out.println(animal.getName() + " nous montre ses aptitudes physiques : ");
            animal.fetchBall(5);
            if(animal instanceof Dog){
                Dog dog = (Dog) animal;
                System.out.println(dog.getName() + " fait : ");
                dog.bark();
            }

            if(animal instanceof Cat){
                Cat cat = (Cat) animal;
                System.out.println(cat.getName() + " fait : ");
                cat.meow();
            }

            if(animal instanceof Racoon){
                Racoon racoon = (Racoon) animal;
                System.out.println(racoon.getName() + " fait : ");
                racoon.cleanFood();
            }
        }
        System.out.println("\r\n\t*** Fin de la parade ***");
    }
}
