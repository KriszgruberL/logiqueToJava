package be.technifutur.logiqueToJava;

import java.util.Random;
import java.util.Arrays;

public class RechercheDichotomique implements Runnable {
    @Override
    public void run() {
        int[] tab = new int[1000000];
        Random rand = new Random();

        int valeur = 64;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(200);
        }
        Arrays.sort(tab);
        System.out.printf("La valeur se trouve à la position " + rechercheDichotomique(tab, valeur));

    }
    public  int rechercheDichotomique (int[] tab,int valeur){
        int pos = -1;
        int posD = 0;
        int posF = tab.length - 1;
        int posM = 0;

        while (posD < posF) {
            posM = (posD + posF) / 2;
            if (tab[posM] < valeur) {
                posD = posM + 1;
            } else {
                posF = posM;
            }

        if (tab[posD] == valeur) {
            pos = posD;
        }
        }
        return pos;
    }
}
