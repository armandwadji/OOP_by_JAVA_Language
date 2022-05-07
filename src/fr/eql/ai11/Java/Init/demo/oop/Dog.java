package fr.eql.ai11.Java.Init.demo.oop;

public class Dog {

    /*
        Rappel des types de variables:
        BOOLEENS: booleen ; true / false
        Entiers: byte / short / int / long

        ENCAPSULATION: Faire en sorte que les attibuts d'une méthode ne soit pas changeable de l'extérieur.
                       Chaque objet est responsable de sa méthode.

        STATIC:  Static nous permet d'appeler une méthode d'une classe sans avoir besoin de l'instancier
                dans un variable initialement.
                Exemple: Class.Methode();

        SANS STATIQUE: Sans statique il nous faudra instancier la classe dans une variable pour pouvoir
                       avoir à tous son contenue disponible et accéssibles, dont les Méthodes incluses.
                       Exemple: Class p = new Class();
                                p.Method();
    */

    //Attributs (Variables d'instance)
    private String name; // Par défaut on à null
    private  int age; // Par défaut on à 0
    private  float size; // Par défaut on à 0
    private float weight; // Par défaut on à 0
    private  Toy toy;

        /******* CONSTRUCTEUR *******/

    /*Constructeur Vide :
        En l'absence de déclaration d'un constructeur, il y aura par défaut
        un constructeur vide disponible. Par contre, si un constructeur
        surchargé est déclaré, il faudra dans ce cas déclarer un constructeur vide
    */
    public Dog(){
    }

    //Constructeur Plein
    public Dog(String name, int age, float size, float weight, Toy toy) {
        //Super veut dire que ce construteur va appeler le constructeur de son parent.
        super();
        this.name = name;
        this.age = age;
        this.size = size;
        this.weight = weight;
        this.toy = toy;

    }
     /************************************/
        public Dog(int age, float size){
            this.age = age;
            this.size = size;
        }
        //Impossible de faire un constructeur dont la déclaration des types ont le même ordre.
        /*
            public Dog(int age, float weight){
                this.age = age;
                this.size = size;
            }
        */

    /***************************************/

    /********  METHODES ************/

    //VOID veut dire que la méthode ne retourne rien

    //PROTECTED: Permet de rendre une class visible par toutes les autres class du même package,
    //ainsi que les enfants de cette classe qui sont dans un autre package.
    protected void bark(){
        System.out.println("Ouaf Ouaf !");
    }

    public void fetchBall(int times){
        System.out.println(name + " rapporte  " + times + " fois la baballe .");
    }

    public float sizeWeightRatio(){
        return size / weight;
    }

    // Accesseurs et Mutateurs : Getters / Setters

    //Getter (Accesseurs) :
    // permet d'avoir accès à la variable de l'instance
    public String getName() {
        return name;
    }

    //Setter (Mutateurs):
    // permet de modifier ou affecter une valeur à l'attribut de l'instance
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

    //Il est conseillé de supprimer les toString a la fin du projet
    // pour pas crée des bugs sur les API rest par exemple.
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", weight=" + weight +
                ", toy=" + toy +
                '}';
    }

    public Toy getToy() {
        return toy;
    }
    public void setToy(Toy toy) {
        this.toy = toy;
    }
}
