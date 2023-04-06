
package estrutuaderepeticao;
import java.util.Scanner;
public class Item02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner (System.in);
     int numero = 0;
     int soma = 0;
     
     System.out.println("digite a sequência de numero");
     while (numero >= 0) {
         numero = input.nextInt();
         if (numero >= 0) {
             soma += numero;
         }
     }
     System.out.println("A soma dos números digitados é: " + soma);
     
     input.close();
	}

}
