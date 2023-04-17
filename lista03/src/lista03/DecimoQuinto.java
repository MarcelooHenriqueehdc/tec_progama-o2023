package lista03;

public class DecimoQuinto {
	public static boolean ehPalindromo(String str) {
        String reverso = new StringBuilder(str).reverse().toString();
        return str.equals(reverso);
    }

    public static void main(String[] args) {
        String str = "ana";
        boolean resultado = ehPalindromo(str);
        System.out.println(resultado);
    }
}
