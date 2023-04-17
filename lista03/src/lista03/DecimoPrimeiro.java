package lista03;

public class DecimoPrimeiro {

	public static double potencia(double base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else if (expoente < 0) {
            return 1 / potencia(base, -expoente);
        } else if (expoente % 2 == 0) {
            double metade = potencia(base, expoente / 2);
            return metade * metade;
        } else {
            return base * potencia(base, expoente - 1);
        }
    }

    public static void main(String[] args) {
        double base = 2;
        int expoente = 10;
        double resultado = potencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
    }

}
