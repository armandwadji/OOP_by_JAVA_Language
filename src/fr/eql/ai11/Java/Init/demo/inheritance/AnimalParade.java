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
        }
        System.out.println("\r\n\t*** Fin de la parade ***");
    }
}
