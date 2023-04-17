package lista03;

public class DecimoSetimo {
	public static String inverterString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "hello";
        String resultado = inverterString(str);
        System.out.println(resultado);
    }
}
