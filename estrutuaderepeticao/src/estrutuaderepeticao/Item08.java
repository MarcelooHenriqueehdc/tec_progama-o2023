package estrutuaderepeticao;

import java.util.*;

public class Item08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma expressão matemática contendo parênteses e colchetes: ");
        String expressao = input.nextLine();

        Stack<Character> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(' || c == '[') {
                pilha.push(c);
            } else if (c == ')' || c == ']') {
                if (pilha.isEmpty()) {
                    System.out.println("A expressão não está bem formada.");
                    input.close();
                    return;
                }
                char ultimo = pilha.pop();
                if ((c == ')' && ultimo != '(') || (c == ']' && ultimo != '[')) {
                    System.out.println("A expressão não está bem formada.");
                    input.close();
                    return;
                }
            }
        }

        if (pilha.isEmpty()) {
            System.out.println("A expressão está bem formada.");
        } else {
            System.out.println("A expressão não está bem formada.");
        }

        input.close();
    }
}
