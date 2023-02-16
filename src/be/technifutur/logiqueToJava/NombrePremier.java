package be.technifutur.logiqueToJava;

public class NombrePremier implements Runnable {
    public void run() {
        System.out.println("NombrePremier");

        int cpt = 3;
        int nbTeste = 3;
        int nbOccur = 2;

        System.out.print(2 + " ");
        System.out.print(3 + " ");

        while (nbOccur < 100) {
            while (cpt * cpt <= nbTeste) {
                if (nbTeste % 2 != 0) {
                    if (nbTeste % (nbTeste / 2) != 0) {
                        System.out.print(nbTeste + " ");
                    }
                    nbOccur = nbOccur + 1;
                }
                cpt = cpt + 1;
            }
            nbTeste = nbTeste + 1;
        }

        // while (nbOccur < 100) {
        // racineCarree = nbTest / (Math.sqrt(nbTest));
        // while (test < racineCarree) {
        // if (test / racineCarree) {
        // System.out.println(test + " est premier");
        // nbOccur = nbOccur + 1;
        // test = test + 1;
        // } else {
        // System.out.println(test + "n'est pas premier");
        // }
        // nbTest = nbTest + 2;
        // }
        // }
    }

    private void and(boolean b) {
    }
}

// utiliser un tableau ou on stocke les nombres premiers -> optimisation
