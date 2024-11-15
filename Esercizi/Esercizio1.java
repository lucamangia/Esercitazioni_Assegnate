package Esercizi;

public class Esercizio1 {
    public static void main(String[] args) {

        String stringa = "Ciao!";
        char[] caratteri = stringa.toCharArray();

        for (char carattere : caratteri){
            System.out.print(carattere + " ");
        }
    }
}
