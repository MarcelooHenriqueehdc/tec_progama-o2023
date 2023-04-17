package lista03;

import java.util.Arrays;

public class OitavoItem {

	 public static int kEsimoMaiorValor(int[] vetor, int k) {
	        int tamanho = vetor.length;
	        if (k < 1 || k > tamanho) {
	            throw new IllegalArgumentException("K inválido");
	        }

	        Arrays.sort(vetor);
	        return vetor[tamanho - k];
	    }

	    public static void main(String[] args) {
	        int[] vetor = {5, 2, 9, 1, 7};
	        int k = 3;
	        int kEsimoMaiorValor = kEsimoMaiorValor(vetor, k);
	        System.out.println("Vetor: " + Arrays.toString(vetor));
	        System.out.println(k + "º maior valor: " + kEsimoMaiorValor);
	    }

}
