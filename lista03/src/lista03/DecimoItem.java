package lista03;

public class DecimoItem {

	public static boolean verificarIgualdade(int[] vetor1, int[] vetor2) {
        if (vetor1.length != vetor2.length) {
            return false;
        }

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] != vetor2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {1, 2, 3, 4, 5};
        int[] vetor3 = {5, 4, 3, 2, 1};

        if (verificarIgualdade(vetor1, vetor2)) {
            System.out.println("O vetor1 é igual ao vetor2.");
        } else {
            System.out.println("O vetor1 é diferente do vetor2.");
        }

        if (verificarIgualdade(vetor1, vetor3)) {
            System.out.println("O vetor1 é igual ao vetor3.");
        } else {
            System.out.println("O vetor1 é diferente do vetor3.");
        }
    }
}
