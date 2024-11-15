package Esercizi;

public class Esercizio2 {
    public static void main(String[] args) {
        /*2)Scrivi un programma che aggiunga 10 a tutti gli elementi
        di un array di interi e stampi il nuovo array.
        Nota: anche se non puoi modificare direttamente l'array con un for-each,
        puoi comunque creare un nuovo array modificato.*/

        int [] arr1 = {11,14,18,19,85,77};
        int [] arr2 = new int[arr1.length];
        int index = 0;

        for (int numero : arr1){
            arr2[index] = numero + 10;
            index++;
        }
        for (int numero : arr2){
            System.out.print(numero + " ");
        }
    }
}
