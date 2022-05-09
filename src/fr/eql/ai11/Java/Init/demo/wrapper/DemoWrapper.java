package fr.eql.ai11.Java.Init.demo.wrapper;

public class DemoWrapper {
    public static void main(String[] args) {
        /*
            Les Wrapper ou Classes enveloppes permettent d'encapsuler des types
            primitifs.
            Chaque type primitif possède sa classe enveloppe, qui lui permet
            se comporter comme un objet ;
            - Byte
            - Short
            - Integer
            - Long
            - Float
            - Double
            - Boolean
            - Character
        */

        //Les Wrappers sont donc Nullable et ils sont instanciables
        // int myInt = null; // on peut pas le faire

        Integer myInteger = null; //En wrapper on peut déclarer null
        myInteger = new Integer(42); //Nous spécifie que c'est pas nécéssaire.

        /*  On peut affecter un primitif à un wrapper.
            Une conversion automatique vers son wrapper, appelée "autoboxing",
            aura lieu.
        */
        Float myFloat = 3.45f;

        /*
            Chaque wrapper (sauf Character) possède une méthode statique
            parsexxx(String str) qui permet de renvoyer un type primitif
            à partir d'une chaîne de caractères.
        */

        double myDouble = Double.parseDouble("42.222222");
        System.out.println("Convertir un caractère en type primitif " + myDouble);

        /*
            Chaque wrapper (sauf character) possède une méthode static
            valueof(String str) qui permet de renvoyer un type objet
            à partir d'une chaîne de caractère.
        */

        Boolean myBoolean = Boolean.valueOf("true");
        System.out.println("Convertir un caractère en type wrapper : "
                + myBoolean.booleanValue());    //Compare le charactère true en booleen
                                                //true
    }
}
