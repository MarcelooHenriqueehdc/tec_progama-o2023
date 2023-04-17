package lista03;

public class QuartoItem {
	public static int contarElemento(int[] vetor1, int[] vetor2, int elemento) {
        int contagem = 0;
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] == elemento) {
                contagem++;
            }
        }
        for (int i = 0; i < vetor2.length; i++) {
            if (vetor2[i] == elemento) {
                contagem++;
            }
        }
        return contagem;
    }

    public static void main(String[] args) {
        int[] vetor1 = {1, 3, 3, 2, 5};
        int[] vetor2 = {1, 2, 3, 2, 4};
        int elemento = 2;
        int resultado = contarElemento(vetor1, vetor2, elemento);
        System.out.println("O elemento " + elemento + " aparece " + resultado + " vezes nos vetores.");
    }

}
