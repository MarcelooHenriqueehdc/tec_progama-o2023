package lista03;

public class DecimoSexto {
	public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int num = 7;
        boolean resultado = ehPrimo(num);
        System.out.println(resultado);
    }
}
