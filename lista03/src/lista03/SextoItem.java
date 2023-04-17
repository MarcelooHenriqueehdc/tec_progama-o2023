package lista03;

import java.util.Arrays;

public class SextoItem {
	public static int[] ordenarCrescente(int[] vetor) {
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[i] > vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        return vetor;
    }

    public static void main(String[] args) {
        int[] vetorDesordenado = {5, 2, 9, 1, 7};
        int[] vetorOrdenado = ordenarCrescente(vetorDesordenado);
        System.out.println("Vetor desordenado: " + Arrays.toString(vetorDesordenado));
        System.out.println("Vetor ordenado: " + Arrays.toString(vetorOrdenado));
    }
}
