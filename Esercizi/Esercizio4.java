package Esercizi;

public class Esercizio4 {
    public static void main(String[] args) {
        /*4)Scrivi un programma che calcoli la media di un array
         di numeri interi usando un ciclo for-each.*/

        int[] numeri = {21,55,79,36,65};
        double tmp   = 0;

        for (double num : numeri){
            tmp += num;
        }
        double media = tmp/ numeri.length;
        System.out.println(media);
    }
}

