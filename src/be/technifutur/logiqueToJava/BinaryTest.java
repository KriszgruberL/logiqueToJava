package be.technifutur.logiqueToJava;

public class BinaryTest implements Runnable {
    @Override
    public void run() {
        int ensembleDesPossibilites = init();
//        System.out.println(Integer.toBinaryString(ensembleDesPossibilites));//111111111
//
        boolean present = estPossible(ensembleDesPossibilites,5); // true
//        System.out.println(Integer.toBinaryString(ensembleDesPossibilites));
//
        ensembleDesPossibilites = deletePossibility(ensembleDesPossibilites,5);
//        System.out.println(Integer.toBinaryString(ensembleDesPossibilites));
//
        present = estPossible(ensembleDesPossibilites,5); // false
//        System.out.println(Integer.toBinaryString(ensembleDesPossibilites));

//        System.out.println(Integer.toBinaryString(mask&ensembleDesPossibilites));
    }
    private int combine (int ensembleDesPossibilites1, int ensembleDesPossibilites2 ){
        return ensembleDesPossibilites1 & ensembleDesPossibilites2;
    }
    private int addPossibility (int ensembleDesPossibilites, int val ){
        int mask = 1 << (val -1);
        int result = ensembleDesPossibilites | mask;

        return result;
    }

    private int deletePossibility(int ensembleDesPossibilites, int val) {
        int mask = ~( 1 << (val -1));

        int result = ensembleDesPossibilites & mask;
        return result;
    }

    private boolean estPossible(int ensembleDesPossibilites, int val) {
        boolean possible = true;
        int mask = 1 << (val -1);
        int result = ensembleDesPossibilites & mask;
        return result == mask;
    }

    private int init() {
//        int ini = 1;
//        ini = (ini << 9 )-1;
//        return ini;
        return (1<<9)-1;
    }
}
