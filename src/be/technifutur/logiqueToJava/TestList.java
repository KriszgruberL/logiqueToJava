package be.technifutur.logiqueToJava;

public class TestList implements Runnable {
    @Override
    public void run() {
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
        System.out.println("----------1");
        System.out.println(toString(laList));

        System.out.println("----------2");
        System.out.println(sousListe(laList, 4).valeur);

        System.out.println("----------3");
        laList = inserer(laList, 45, 4);
        System.out.println(toString(laList));

        System.out.println("----------4");
        remplace(laList, 68, 2);
        System.out.println(toString(laList));

        System.out.println("----------5");
        laList = delete(laList, 6);
        System.out.println(toString(laList));
    }

    private String toString(MyList list) {
        String result = "";
        while (list != null) {
            result += " " + list.valeur;
            list = list.suivant;
        }
        return result;
    }

    private int longueur(MyList list) {
        int taille = 0;

        while (list != null) {
            list = list.suivant;
            taille++;
        }
        return taille;
    }

    private MyList sousListe(MyList list, int position) {
        MyList result = list;

        for (int cpt = 0; cpt < position; cpt++) {
            result = result.suivant;
        }
        return result;
    }

    private MyList ajoutDebut(MyList laList, int newValeur) {
        MyList result = new MyList();
        result.valeur = newValeur;
        result.suivant = laList;
        return result;
    }

    private MyList ajoutFin(MyList laList, int newValeur) {
        MyList result = laList;

        if (laList == null) {
            result = ajoutDebut(laList, newValeur);
        } else {
            while (laList.suivant != null) {
                laList = laList.suivant;
            }
            laList.suivant = new MyList();
            laList.suivant.valeur = newValeur;
        }
        return result;
    }

    private MyList inserer(MyList laList, int newValeur, int position) {
        MyList result = laList;
        MyList newElement;
        MyList precedent;

        if (position == 0) {
            result = ajoutDebut(laList, newValeur);
        } else {
            precedent = sousListe(laList, position - 1);
//            newElement = new MyList();
//            newElement.valeur = newValeur;
//            newElement.suivant = precedent.suivant;
            precedent.suivant = ajoutDebut(precedent.suivant, newValeur);
        }
        return result;
    }

    private MyList delete(MyList lalist, int position) {
        MyList result = lalist;
        MyList precedent;

        if (position == 0) {
            result = lalist.suivant;
        } else {
            precedent = sousListe(lalist, position - 1);
            precedent.suivant = precedent.suivant.suivant;
        }
        return result;
    }

    private void remplace(MyList laList, int newValeur, int position) {
        sousListe(laList, position).valeur = newValeur;
    }
}



