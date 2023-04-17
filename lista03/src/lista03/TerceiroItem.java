package lista03;

public class TerceiroItem {

	public static double mediaPonderada(int[] notas, int[] pesos) {
        int somaNotas = 0;
        int somaPesos = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        double media = (double) somaNotas / somaPesos;
        return media;
    }

    public static void main(String[] args) {
        int[] notas = {4, 8, 6};
        int[] pesos = {2, 3, 1};
        double resultado = mediaPonderada(notas, pesos);
        System.out.println("A média ponderada das notas é: " + resultado);
    }
}
