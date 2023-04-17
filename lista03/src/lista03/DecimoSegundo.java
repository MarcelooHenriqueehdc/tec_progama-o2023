package lista03;

public class DecimoSegundo {
	 public static boolean verificarPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        int numero = 23;
	        boolean primo = verificarPrimo(numero);
	        if (primo) {
	            System.out.println(numero + " é primo.");
	        } else {
	            System.out.println(numero + " não é primo.");
	        }
	    }
}
