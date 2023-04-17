package lista03;

public class DecimoQuarto {
	public static int[] removerElemento(int[] vetor, int elemento) {
        int count = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                count++;
            }
        }

        int[] novoVetor = new int[vetor.length - count];
        int j = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != elemento) {
                novoVetor[j] = vetor[i];
                j++;
            }
        }

        return novoVetor;
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 2, 4};
        int elemento = 2;

        int[] novoVetor = removerElemento(vetor, elemento);

        System.out.print("Vetor original: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();

        System.out.print("Novo vetor: ");
        for (int i = 0; i < novoVetor.length; i++) {
            System.out.print(novoVetor[i] + " ");
        }

        System.out.println();
    }
}
