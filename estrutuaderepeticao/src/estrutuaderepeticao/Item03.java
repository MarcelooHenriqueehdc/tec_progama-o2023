package estrutuaderepeticao;

import java.util.Random;
import java.util.Scanner;

public class Item03 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(100) + 1;
        int tentativas = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Adivinhe o número entre 1 e 100:");
        int numeroUsuario = input.nextInt();
        tentativas++;

        while (numeroUsuario != numeroAleatorio) {
            if (numeroUsuario < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }
            numeroUsuario = input.nextInt();
            tentativas++;
        }

        System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");

        input.close();
    }
}