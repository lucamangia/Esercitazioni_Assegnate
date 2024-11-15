package Esercizi;

public class Esercizio1 {
    public static void main(String[] args) {
        //1)Scrivi un programma che utilizzi
        // un ciclo for-each per stampare tutti i caratteri di una stringa.

        String stringa = "Ciao!";
        char[] caratteri = stringa.toCharArray();

        for (char carattere : caratteri){
            System.out.print(carattere + " ");
        }
    }
}
