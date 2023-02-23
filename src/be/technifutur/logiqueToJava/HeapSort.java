package be.technifutur.logiqueToJava;

import java.util.Arrays;

public class HeapSort implements Runnable {
    @Override
    public void run() {
        int[] tab = new int[]{10, 15, 36,16 , 29, 67, 78, 87,24, 35, 75, 16, 85, 43, 61, 57, 98, 76, 18};
        System.out.println("Tableau avant tri : " + Arrays.toString(tab));
        System.out.println("-------------");
        creerTas(tab);
        System.out.println("Tableau après tri : " + Arrays.toString(tab));

    }

    void print(int[] tab){
        int[][] tree =
    }

    private int grandFils(int[] tab, int tailleArbre, int posRacine) {
        int gf = posRacine;
        int[] fils = new int[2];

        fils[0] = posRacine * 2 +1;
        fils[1] = posRacine * 2 +2;

        for (int i = 0; i < fils.length; i++) {
            if (fils[i] < tailleArbre) {
                if (tab[gf] < tab[fils[i]]) {
                    gf = fils[i];
                }
            }

        }
        return gf;
    }

    //algorithme qui trie la tableau //
    private void trier(int[] tab) {

    }

    private void creerTas(int[] tab) {
        for (int i = tab.length / 2; i >= 0; i--) {
            equilibrerTas(tab, tab.length, i);
        }
    }

    private void equilibrerTas(int[] tab, int tailleArbre, int posRacine) {

        int posGF = grandFils(tab, tailleArbre, posRacine);
        int temp;
        while (posRacine != posGF) {
            temp = tab[posRacine];
            tab[posRacine] = tab[posGF];
            tab[posGF] = temp;
            posRacine = posGF;
            posGF = grandFils(tab, tailleArbre, posRacine);
        }
    }
}