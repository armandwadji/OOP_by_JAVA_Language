package fr.eql.ai11.Java.Init.demo.inheritance;

import fr.eql.ai11.Java.Init.demo.enums.CatBreed;
import fr.eql.ai11.Java.Init.demo.enums.DogBreed;
import fr.eql.ai11.Java.Init.demo.oop.Toy;

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
    }
}
