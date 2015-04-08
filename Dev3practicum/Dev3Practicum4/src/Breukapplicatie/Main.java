package Breukapplicatie;

/**
 * Created by Mohammed on 7-4-2015.
 */
public class Main {

    public static void main(String[] args) {
        //Breuk a = new Breuk(20,55,154,0,0,0);
        // Legenda voor gebruik breuk(Heel,teller,noemer > keer/delen/optellen > Heel1,Teller1,Noemer1)
        Breuk x = new Breuk(0,3,4,0,8,9);
        Breuk y = x;
        Breuk a = new Breuk(0,3,4,0,8,9);
        Breuk b = a;

        a.optellen();
        b.vereenvoudigen();
        a.vermenigvuldigen();
        b.vereenvoudigen();
        x.aftrekken();
        y.vereenvoudigen();


    }

}
