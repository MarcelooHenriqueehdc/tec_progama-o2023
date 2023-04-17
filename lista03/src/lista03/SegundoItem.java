package lista03;

public class SegundoItem {

    public static double mediaVetores(int[] vetor1, int[] vetor2) {
        int soma = 0;
        int totalElementos = vetor1.length + vetor2.length;
        for (int i = 0; i < vetor1.length; i++) {
            soma += vetor1[i];
        }
        for (int i = 0; i < vetor2.length; i++) {
            soma += vetor2[i];
        }
        double media = (double) soma / totalElementos;
        return media;
    }

    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3};
        int[] vetor2 = {4, 5, 6};
        double resultado = mediaVetores(vetor1, vetor2);
        System.out.println("A média dos valores presentes nos vetores é: " + resultado);
    }
}


