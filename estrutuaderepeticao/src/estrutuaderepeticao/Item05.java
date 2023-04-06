package estrutuaderepeticao;

import java.util.Scanner;

public class Item05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o limite superior dos pares: ");
        int limite = input.nextInt();

        System.out.println("Sequência:");

        for (int i = 0; i <= limite; i++) {
            for (int j = 0; j <= limite; j++) {
                System.out.print(i + "-" + j + " ");
            }
        }

        input.close();
    }
}