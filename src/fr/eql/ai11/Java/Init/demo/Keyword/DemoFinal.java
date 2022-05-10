package fr.eql.ai11.Java.Init.demo.Keyword;

import fr.eql.ai11.Java.Init.demo.enums.DogBreed;
import fr.eql.ai11.Java.Init.demo.oop.Dog;

public class DemoFinal {

    public static void main(String[] args) {
        /*
        Une Variable déclarer final, ne peut être assignée qu'une seule fois.
        Elle ne peut plus ensuite pointer vers un autre emplacement mémoire.
        L'assignation ne doit pas nécessairement se produire au moment de la
        déclaration.
         */

        final int number;
        number = 0;
        final Dog milou;
        milou = new Dog("Milou", 12, 100, 30, DogBreed.BERGER, null, 124);

        //On ne peut pas assigner une nouvelle valeur à une variable de type primitif
        //number  = 1; <- impossible

        //On peut changé l'état (valeur des attributs) d'une instance déclarer finale
        System.out.println("Référence mémoire de Milou :" + milou);
        System.out.println("age de Milou : " + milou.getAge());
        milou.setAge(6);
        System.out.println("Référence mémoire de Milou :" + milou);
        System.out.println("age de Milou : " + milou.getAge());
        //On ne peut pas assigner une nouvelle instance à une variable
        // finale déja initialisée.
        //milou = new Dog();
    }

}
