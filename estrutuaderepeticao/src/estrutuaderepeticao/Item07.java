package estrutuaderepeticao;

import java.util.Scanner;

public class Item07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = input.nextInt();

        int maiorPrimo = 2;
        int menor = numero;

        while (numero >= 0) {
            boolean primo = true;

            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo && numero > maiorPrimo) {
                maiorPrimo = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            System.out.print("Digite outro número inteiro positivo ou digite um número negativo para sair: ");
            numero = input.nextInt();
        }

        if (maiorPrimo == 2) {
            System.out.println("Não foi encontrado nenhum número primo.");
        } else {
            System.out.println("O maior número primo digitado foi " + maiorPrimo + ".");
        }

        System.out.println("O menor número digitado foi " + menor + ".");

        input.close();
    }
}