package fr.eql.ai11.Java.Init.demo.io;


import javax.swing.JOptionPane;

public class DemoDialogSwing {
    public static void main(String[] args) {

        /****************** La librairie Swing *********************************/

        String name = JOptionPane.showInputDialog("veuillez entrez votre nom.");
        int age = Integer.parseInt(JOptionPane.showInputDialog("veuillez entrez votre age."));
        JOptionPane.showMessageDialog(null, "Fiche utilsateur\r\n" +
                "Nom : " + name + " \r\n Age : " + age);
    }
}
