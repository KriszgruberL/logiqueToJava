package be.technifutur.logiqueToJava;

import java.util.Scanner;

public class Split implements Runnable {
    public void run() {
        Scanner scan = new Scanner(System.in);
        String entree = "";
        String cadre = "+";
        String milieu = "|";
        int longueurMot = 0;

        System.out.println("Veuillez entrer une phrase");
        entree = scan.nextLine();
        String[] tab = entree.split(" ");

        for (int i = 0; i < tab.length; i++) {
            longueurMot = tab[i].length();
            for (int j = 0; j < longueurMot+2; j++) {
                cadre = cadre+"-";
            }
            longueurMot = 0;
            cadre = cadre+"+";
            milieu = milieu+" "+tab[i]+" |";
        }

        System.out.println(cadre);
        System.out.println(milieu);
        System.out.println(cadre);

    }
}


