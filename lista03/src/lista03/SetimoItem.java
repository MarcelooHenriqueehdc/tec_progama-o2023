package lista03;

public class SetimoItem {
	public static boolean verificarOrdenacao(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {5, 4, 3, 2, 1};

        if (verificarOrdenacao(vetor1)) {
            System.out.println("O vetor1 está ordenado em ordem crescente.");
        } else {
            System.out.println("O vetor1 não está ordenado em ordem crescente.");
        }

        if (verificarOrdenacao(vetor2)) {
            System.out.println("O vetor2 está ordenado em ordem crescente.");
        } else {
            System.out.println("O vetor2 não está ordenado em ordem crescente.");
        }
    }
}
