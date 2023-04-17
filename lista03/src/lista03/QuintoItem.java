package lista03;

import java.util.Arrays;

public class QuintoItem {

	 public static int[] copiarVetor(int[] vetor) {
	        int[] copia = new int[vetor.length];
	        for (int i = 0; i < vetor.length; i++) {
	            copia[i] = vetor[i];
	        }
	        return copia;
	    }

	    public static void main(String[] args) {
	        int[] vetorOriginal = {1, 2, 3, 4, 5};
	        int[] vetorCopia = copiarVetor(vetorOriginal);
	        System.out.println("Vetor original: " + Arrays.toString(vetorOriginal));
	        System.out.println("Vetor cópia: " + Arrays.toString(vetorCopia));
	    }
}
