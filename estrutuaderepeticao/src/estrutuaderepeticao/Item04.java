package estrutuaderepeticao;

import java.util.Scanner;

public class Item04
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para a tabela de multiplicação: ");
        int numero = input.nextInt();
        int multiplicador = 1;

        System.out.println("Tabela de multiplicação de " + numero + ":");

        while (multiplicador <= 10) {
            int resultado = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }

        input.close();
    }
}
