package lista03;

public interface DecimoOitavo {
	  public static double calcularJurosCompostos(double valorInicial, double taxaJuros, int numPeriodos) {
	        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, numPeriodos);
	        return valorFinal;
	    }

	    public static void main(String[] args) {
	        double valorInicial = 1000;
	        double taxaJuros = 0.05;
	        int numPeriodos = 3;
	        double valorFinal = calcularJurosCompostos(valorInicial, taxaJuros, numPeriodos);
	        System.out.println(valorFinal);
	    }
}
