package lista03;

public class PrimeiroItem {

    public static int somaElementos(int[] vetor) {
        int soma = 0;
        for (int i = 2; i < vetor.length - 2; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int resultado = somaElementos(vetor);
        System.out.println("A soma dos elementos do vetor, excluindo as primeiras duas e as últimas duas posições, é: " + resultado);
    }
}