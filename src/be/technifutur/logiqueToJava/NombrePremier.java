package be.technifutur.logiqueToJava;

public class NombrePremier implements Runnable {
    public void run() {
        System.out.println("NombrePremier");

        int cpt = 3;
        int nbTeste = 3;
        int nbOccur = 1;

        System.out.print(2 + " ");

        while (nbOccur < 100) {
            boolean estPremier = true;
            if (nbTeste % 2 != 0) {
                cpt = 3;
                while (cpt * cpt <= nbTeste) {
                    if (nbTeste % cpt == 0) {
                        estPremier = false;
                        break;
                    }
                    cpt = cpt + 2;
                }
                if (estPremier) {
                    System.out.print(nbTeste + " ");
                    nbOccur = nbOccur + 1;
                }
            }
            nbTeste = nbTeste + 2;
        }
    }
}