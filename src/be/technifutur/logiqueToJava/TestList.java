package be.technifutur.logiqueToJava;

public class TestList implements Runnable {
    @Override
    public void run(){
        int newValeur = 5;
        MyList laList = null;
        int taille = longueur(laList);
        System.out.println(taille);
        laList = ajoutDebut(laList, 15);
        laList = ajoutDebut(laList, 125);
        laList = ajoutDebut(laList, -615);
        laList = ajoutDebut(laList, 1);
        laList = ajoutDebut(laList, 18);
        laList = ajoutFin(laList, newValeur);
        taille = longueur(laList);
        System.out.println(taille);
        System.out.println(toString(laList));
        System.out.println(sousListe(laList, 4).valeur);

    }

    private String toString(MyList list) {
        String result="";
        while( list != null){
            result += " "+list.valeur;
            list = list.suivant;
        }
        return result;
    }

    private MyList sousListe (MyList list, int position) {
        MyList result = list;

        for (int cpt = 0; cpt < position ; cpt++) {
            result = result.suivant;
        }
        return result;
    }

    private int longueur(MyList list) {
        int taille = 0;

        while (list != null){
            list = list.suivant;
            taille ++;
        }
        return taille;
    }

    private MyList ajoutDebut(MyList laList, int newValeur) {
        MyList result = new MyList() ;
        result.valeur = newValeur;
        result.suivant = laList;
        return result;
    }

    private MyList ajoutFin(MyList laList, int newValeur) {
        MyList result = laList;

        if (laList == null) {
            result = ajoutDebut(laList, newValeur);
        } else {
            while (laList.suivant != null){
                laList = laList.suivant;
            }
            laList.suivant = new MyList();
            laList.suivant.valeur = newValeur;
        }
    return result;
    }
}
