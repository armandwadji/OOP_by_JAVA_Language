package fr.eql.ai11.Java.Init.demo.oop;

public class Dog {

    /*Les types de variables:
        BOOLEENS: booleen ; true / false
        Entiers: byte / short / int / long

        ENCAPSULATION: Faire en sorte que les attibuts d'une méthode ne soit pas changeable de l'extérieur.
                       Chaque objet est responsable de sa méthode.

        PROTECTED: Permet de rendre une class visible par toutes les autres class du même package,
                   ainsi
    * */

    //Attributs (Variables d'instance)
    private String name; // Par défaut on à null
    private  int age; // Par défaut on à 0
    private  float size; // Par défaut on à 0
    private float weight; // Par défaut on à 0

        /******* CONSTRUCTEUR *******/

    //Constructeur Vide
    public Dog(){
        super(); // Permet d'aller cherché le constructeur du parent
    }

    //Constructeur Plein
    public Dog(String name, int age, float size, float weight) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.weight = weight;
    }
     /************************************/
        public Dog(int age, float size){
            this.age = age;
            this.size = size;
        }
        //Impossible de faire un constructeur dont la déclaration des types ont le même ordre.
//        public Dog(int age, float weight){
//            this.age = age;
//            this.size = size;
//        }
    /***************************************/

    //Méthodes
    //void veut dire que la méthode ne retourne rien
    protected void bark(){
        System.out.println("Ouaf Ouaf !");
    }

    public void fetchBall(int times){
        System.out.println("Je rapporte " + times + " fois ma baballe .");
    }

    public float sizeWeightRatio(){
        return size / weight;
    }

    // Accesseurs : Getters / Setters

    //Getter permet d'avoir d'accè à la variable de l'instance
    public String getName() {
        return name;
    }

    //Setter permet de modifier l'attribut de l' instance
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
}
