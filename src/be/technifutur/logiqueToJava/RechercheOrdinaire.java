//package be.technifutur.logiqueToJava;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class RechercheOrdinaire implements Runnable {
//    @Override
//    public void run() {
//        int[] tab = new int[1000000];
//        Random rand = new Random();
//
//        int valeur = 64;
//
//        for (int i = 0; i < tab.length; i++) {
//            tab[i] = rand.nextInt(200);
//        }
//        Arrays.sort(tab);
//        System.out.printf("La valeur se trouve à la position " + rechercheOrdinaire(tab, valeur));
//    }
//
//    public int rechercheOrdinaire (int [] tab, int valeur) {
//        int pos = -1;
//        int posD = 0;
//        int posF = tab.length - 1;
//        int posM = 0;
//        boolean recherche = false;
//
//        while (recherche) {
//            for (int i = 0; i < posF; i++) {
//                posF = tab.length - 1;
//                if (valeur == tab[i]) {
//                    recherche = true;
//                }
//            }
//
//        }
//    }
//    }
//}
