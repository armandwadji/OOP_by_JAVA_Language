package fr.eql.ai11.Java.Init.demo.oop;

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
        return "Toy{" +
                "ToyName='" + ToyName + '\'' +
                '}';
    }
}
