package Breukapplicatie;

/**
 * Created by Mohammed on 7-4-2015.
 */
public class Breuk {

    private int teller;
    private int noemer;
    int heel;
    private int teller1;
    private int noemer1;
    int heel1;

    public Breuk(int a_heel, int a_teller, int a_noemer, int a_heel1, int a_teller1, int a_noemer1) {
        this.teller = a_teller;
        this.noemer = a_noemer;
        this.heel = a_heel;
        this.teller1 = a_teller1;
        this.noemer1 = a_noemer1;
        this.heel1 = a_heel1;
    }

    public int getTeller() {
        return teller;
    }
    public int getNoemer() {
        return noemer;
    }
    public long getHeel() {
        return heel;
    }
    public int getTeller1() {
        return teller1;
    }
    public int getNoemer1() {
        return noemer1;
    }
    public int getHeel1() {
        return heel1;
    }
    public void setHeel(int a_heel) {
        heel = a_heel;
    }
    public void setTeller(int teller) {
        this.teller = teller;
    }
    public void setNoemer(int noemer) {
        this.noemer = noemer;
    }
    public void optellen() {
        int plus_teller = getTeller();
        int plus_noemer = getNoemer();
        long plus_heel = getHeel();
        int plus1_teller = getTeller1();
        int plus1_noemer = getNoemer1();
        long plus_heel1 = getHeel1();
        int tellergelijknamig = plus_noemer * plus1_teller;
        int noemergelijknamig = plus_noemer * plus1_noemer;
        int tellergelijknamig1 = plus1_noemer * plus_teller;
        int noemergelijknamig1 = plus1_noemer * plus_noemer;
        int optellen = tellergelijknamig + tellergelijknamig1;
        long helen = plus_heel + plus_heel1;
        setTeller(optellen);
        setNoemer(noemergelijknamig1);
        System.out.println("optellen: " + helen + "  |" + optellen + " / " + noemergelijknamig1);
    }
    public void aftrekken() {
        int min_teller = getTeller();
        int min_noemer = getNoemer();
        long min_heel = getHeel();
        int min1_teller = getTeller1();
        int min1_noemer = getNoemer1();
        long min_heel1 = getHeel1();
        int tellergelijknamig = min_noemer * min1_teller;
        int noemergelijknamig = min_noemer * min1_noemer;
        int tellergelijknamig1 = min1_noemer * min_teller;
        int noemergelijknamig1 = min1_noemer * min_noemer;
        int aftrekken = tellergelijknamig - tellergelijknamig1;
        long helen = min_heel - min_heel1;
        setTeller(aftrekken);
        setNoemer(noemergelijknamig1);
        System.out.println("aftrekken: " + helen + "  |" + aftrekken + " / " + noemergelijknamig1);
    }
    public void delen() {
    }
    public void vermenigvuldigen() {
        int keer_teller = getTeller();
        int keer_noemer = getNoemer();
        long keer_heel = getHeel();
        int keer1_teller = getTeller1();
        int keer1_noemer = getNoemer1();
        long keer_heel1 = getHeel1();
        int tellerresultaat = keer_teller * keer1_teller;
        int noemerresultaat = keer_noemer * keer1_noemer;
        long heelresultaat = keer_heel * keer_heel1;
        System.out.println("vermenigvuldigen: " + heelresultaat + " |  " + tellerresultaat + " / " + noemerresultaat);
    }

    public static int gGd(int p, int q) {
        // Algorithm van Euclidean gemene verdeler vinden
        if (q == 0) {
            return p;
        }
        return gGd(q, p % q);
    }

    public void vereenvoudigen() {
        try {
            //haalt de variabelen van teller en noemer op. Bijv breuk 333/123
            int a_teller = getTeller();
            int b_noemer = getNoemer();
            //Zoeken van de gemene verdeler van teller en van noemer zoekt de gemene deler van
            //333/123 met algoritme van Euclidean
            int gemenedeler = gGd(a_teller, b_noemer);
            // de teller vervolgens delen door de gemene verdeler 333/gemenedeler
            int dividedteller = a_teller / gemenedeler;
            // de noemer delen door de gemene verder 123 /gemenedeler
            int dividednoemer = b_noemer / gemenedeler;
            // alle helen optellen
            if ((dividedteller <= 0) && (dividednoemer <= 0)) {
                System.out.println("Uitkomst is onder de nul");
            } else {
                int helen = dividedteller / dividednoemer;
                // alle halve optellen doormiddel van de remainder.
                // 333 % 123 overblijfsel (heel getal)
                int remainder = dividedteller % dividednoemer;
                // set de gevonden hele getal in breuk int heel.
                setHeel(helen);
                // Als het voorkomt dat er geen hele getallen zijn print hij deze niet uit
                if (helen == 0) {
                    System.out.println("vereenvoudiging: " + dividedteller + " /  " + dividednoemer);
                } else if (remainder == 0) {
                    //als er voorkomt dat er geen halve breuken zijn print hij alleen de hele uit.
                    System.out.println("vereenvoudiging: " + getHeel());
                } else {
                    // als er voorkomt dat er zowel halve als hele breuken zijn.
                    System.out.println("vereenvoudiging: " + getHeel() + " | " + remainder + "/" + dividednoemer);
                }
              }
           } catch (ArithmeticException e) {
        }
    }
}
