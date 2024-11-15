package Esercizi;

public class Esercizio3 {
    public static void main(String[] args) {
        //3)Scrivi un programma che conti quante volte
        // una specifica stringa appare in un array di stringhe.

        String [] stringhe = {"Uno","Due","Tre","Quattro","Due"};
        int index = 0;

        for (String parola : stringhe ){
            String stringa = stringhe[1];
            if (parola.equals(stringa)){
                index++;
            }
        }
        System.out.println(index);
    }
}
