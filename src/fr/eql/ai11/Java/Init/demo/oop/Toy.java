package fr.eql.ai11.Java.Init.demo.oop;

import java.util.Objects;

public class Toy {
    //On définit l'attribut
    private String ToyName;
    //**********************

    //on définit des constructeurs
    public Toy() {
    }

    public Toy(String toyName) {

        ToyName = toyName;
    }

    //**************************

    //On définit des getters et des setters

    public String getToyName() {

        return ToyName;
    }

    public void setToyName(String toyName) {

        ToyName = toyName;
    }
    //*************************

    //Il faut définir le toString de jouet pour pouvoir le voir dans Dog.
    @Override
    public String toString() {
        return
                "ToyName='" + ToyName + '\'' ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return Objects.equals(ToyName, toy.ToyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ToyName);
    }
}
