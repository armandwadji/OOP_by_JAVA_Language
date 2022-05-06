package fr.eql.ai11.Java.Init.demo.oop;

public class Launcher {
    public static void main(String[] args) {

        //Instanciation d'un objet avec son contructeur vide.
        Dog laika = new Dog();

        //Instanciation s'un objet avec le constructeur surchargé
        Dog fido = new Dog("Fido", 8, 100, 30);

        //Affectation des attributs à laika
        laika.setName("Laika");
        laika.setAge(12);
        laika.setSize(80);
        laika.setWeight(20);

        //Affichage des attributs
        System.out.println("ce chien s'appelle : " + laika.getName() + "\r\n" +
                "Il à " + laika.getAge() + " ans " + " et pèse "
                + laika.getWeight() + " kg \r\n");

        System.out.println("cette chienne s'appelle : " + fido.getName() + "\r\n" +
                "Il à " + fido.getAge() + " ans " + " et pèse "
                + fido.getWeight() + " kg ");

    }
}
