package zadania;
//zamiana liczb w tablicy, o jedno w lewo, przykładowe zadanko rekrutacyjne

import java.util.Arrays;

//zadania tablice

public class Tablice {

    public static void main(String[] args) {
        int tab[]= {20,30,40};
        int TablicaNowa[] = new int[3];

        for (int i=0; i<tab.length; i++){
            if( i==0) {
                TablicaNowa[TablicaNowa.length - 1] = tab[0];
            } else {
                TablicaNowa[i - 1] = tab[i];
            }
    }

        for( int i =0; i<TablicaNowa.length; i++){
            System.out.println(TablicaNowa[i]);
        }
        //System.out.println(TablicaNowa[0]);
}}
