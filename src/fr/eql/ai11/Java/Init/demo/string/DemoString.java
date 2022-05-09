package fr.eql.ai11.Java.Init.demo.string;

public class DemoString {
    public static void main(String[] args) {
        String sentence = "hello World !";
        String emptySentence = "";

        System.out.println("*** Les méthodes de String ***");

        System.out.println("\r\n--- obtenir la taille (nombre de " +
                "caractères) ---");
            System.out.println("sentence : " + sentence.length());
            System.out.println("emptySentence : " + emptySentence.length());

        System.out.println("\r\n--- Vérifier si la chaîne est vide ---");
            System.out.println("sentence : " + sentence.isEmpty());
            System.out.println("emptySentence : " + emptySentence.isEmpty());

        System.out.println("\r\n--- Obtenir une partie de la chaîne de " +
                "caractère ---");
            System.out.println("sentence à partir du caractère " +
                    "à l'index 4 inclus : " + sentence.substring(4));

            System.out.println("sentence à partir du caractère " +
                    "à l'index 4 inclus jusqu'au caractère " +
                    "à l'index 7 exclus : " + sentence.substring(4, 7));

        System.out.println("\r\n--- Retirer les espaces entourant la " +
                "chaîne de caractère ---");
            String sentenceWithSurroundingSpaces = "       Hello World !        ";
            System.out.println("longueur de " +
                    "sentenceWithSurroundingSpaces : " + sentenceWithSurroundingSpaces.length());

            String trimmedSentence = sentenceWithSurroundingSpaces.trim();
            System.out.println("longueur de trimmedSentence : " + trimmedSentence.length());

        System.out.println("\r\n--- Découper la chaîne en plusieurs partie " +
                "selon un séparateur ---");
            String[] sentenceParts = sentence.split(" ");
            for (int i = 0; i < sentenceParts.length ; i++) {
                System.out.print(sentenceParts[i]);
            }

        System.out.println("\r\n--- Remplacé une partie d'une chaîne par un autre ---");
            String replaceSentence = sentence.replace("world", "Toto");
            System.out.println("replaceSentence : " + replaceSentence);

        System.out.println("\r\n--- StringBuffer ---");
            String part1 = "Hello";
            String part2 = "World";
            String part3 = "!";
            String allparts = part1 + " " + part2 + " " + part3;
            System.out.println("Concaténation classique : " + allparts);

            /*
                Un StringBuffer (synchrone) ou StringBuilder ( asynchrone) : permet de
                concatener des chaînes de caractères de manière plus performante qu'une
                concaténation classique
            * */

            StringBuffer myBuffer = new StringBuffer();
            myBuffer
                    .append(part1) //Pour rajouter à la fin de la chaîne
                    .append(part2)
                    .append(part3)
                    .insert(part1.length() , " ")
                    .insert(part1.length() + part2.length() + 1, " "); //Pour insérer à une position donnée
//            allparts = myBuffer.toString();
            System.out.println("Concaténation par StringBuffer : " + myBuffer);



    }
}
