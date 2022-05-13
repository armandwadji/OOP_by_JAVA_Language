package fr.eql.ai11.Java.Init.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 10, 20, 30, 30, 40, 50);

        //On ne retire pas des éléments d'une liste lorsque l'on itère dessus.
        //La bonne facon est de stocker la valeur non voulue dans une autre liste.
//        for (int i = 0; i < integers.size(); i++) {
//            if(integers.get(i) == 30){
//                integers.remove(i);
//                i--;
//            }
//        }

        //L'objet iterator permet de faire des opérations sur une liste
        //au cours de son itération.
        //La méthode Iterator() de List permet d'utiliser l'Iterator sur
        // la liste qui est ainsi modifiée, car ils pointent vers le même
        // emplacement mémoire.
        Iterator<Integer> integerIterator = integers.iterator();
        while (integerIterator.hasNext() ){
            if(integerIterator.next() == 30){
                integerIterator.remove();
            }
        }

        System.out.println(integers);
    }
}
