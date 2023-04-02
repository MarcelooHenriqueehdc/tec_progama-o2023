package Main;

import java.util.Scanner;

public class Lista01 {

	public static void main(String[] args) {
		 
		start();
	}
	
	public static void start() {
		
		Scanner sc = new Scanner(System.in);
		
		int item, aux;
		double A, B;
		
		System.out.println("*Escolha um item dentre os disponiveis:\n( 1) ( 2) ( 3) ( 4) ( 5) ( 6) ( 7) ( 8) "
				+ "( 9) (10) (11) (12) (13)");
		item = sc.nextInt();
		
		if(item != 1 && item != 2 && item != 3 && item != 4 && item != 5 && item != 6 && item != 7 && item != 8 
				&& item != 9 && item != 10 && item != 11 && item != 12 && item != 13) {
			System.out.println("Item invalido!\n");
			start();
		}
	
		System.out.println("Informe o valor de A:");
		A = sc.nextDouble();
		System.out.println("Informe o valor de B:");
		B = sc.nextDouble();
		
		if(item == 1) {
			item01(A,B);
		}else if(item == 2) {
			item02(A,B);
		}else if(item == 3) {
			item03(A,B);
		}else if(item == 4) {
			item04(A,B);
		}else if(item == 5) {
			item05(A,B);
		}else if(item == 6) {
			item06(A,B);
		}else if(item == 7) {
			item07(A,B);
		}else if(item == 8) {
			item08(A,B);
		}else if(item == 9) {
			item09(A,B);
		}else if(item == 10) {
			item10(A,B);
		}else if(item == 11) {
			item11(A,B);
		}else if(item == 12) {
			item12(A,B);
		}else if(item == 13) {
			item13(A,B);
		}
		
		System.out.println("\n*Deseja escolher outro item?\n Digite [1] para continuar:");
		aux = sc.nextInt();
		if(aux == 1) {
			start();
		}else {
			System.out.println(" Fim do programa!");
		}
		
		sc.close();
	}
	
	public static void item01(double A, double B) {
		
		if(A > 10) {
			System.out.println("A > 10");
		}if(A + B == 20) {
			System.out.println("A + B == 20");
		}else {
			System.out.println("Numero nao valido.");
		}
	}
	
	public static void item02(double A, double B) {
		
		if(A < 10) {
			System.out.println("A < 10");
		}if(A + B == 20) {
			System.out.println("A + B == 20");
		}else if(A >= 10 && A + B != 20) {
			System.out.println("Numero nao valido.");
		}
	}
	
	public static void item03(double A, double B) {
		
		if(A == 10) {
			System.out.println("A == 10");
		}if(A + B == 20) {
			System.out.println("A + B == 20");
		}if(B == 10) {
			System.out.println("B == 10");
		}
	}
	
	public static void item04(double A, double B) {
		
		if(A > 10 || A + B == 20) {
			System.out.println("Numero valido.");
		}else if(A == B ) {
			System.out.println("A e igual B; A e B sao diferentes de 10; A e menor que 10");
		}else { 
			System.out.println("Numero nao valido.");
		}
	}
	
	public static void item05(double A, double B) {
		
		if(A > 10 || A + B == 20) {
			System.out.println("Numero valido.");
		}else { 
			System.out.println("Numero nao valido.");
		}
	}

	public static void item06(double A, double B) {

		if(A > 10) {
			System.out.println("A > 10");
		}else {
			System.out.println("A <= 10");
		}if(A + B == 20) { 
			System.out.println("A + B == 20");
		}else {
			System.out.println("A + B != 20");
		}
	}

	public static void item07(double A, double B) {

		if(A > 10 && A + B == 20) {
			System.out.println("Numeros validos.");
		}if(A <= 10) {
			System.out.println("Numero nao valido");
		}
	}

	public static void item08(double A, double B) {

		if(A > 10) {
			System.out.println("A > 10");
		}if(A + B == 20) {
			System.out.println("A + B == 20");
		}else {
			System.out.println("Numero nao valido.");
		}
	}

	public static void item09(double A, double B) {

		if(A > 10 && A + B == 20) {
			System.out.println("A + B == 20");
		}else {
			System.out.println("Numero nao valido.");
		}
	}

	public static void item10(double A, double B) {
		
		if(A > 10) {
		}else if(A < 10) {
			System.out.println("Numero menor que 10");
		}if(A + B == 20) {
		}else {
			System.out.println("Numero diferente de 20.");
		}
	}

	public static void item11(double A, double B) {
		
		if(A > 10) {
		}else if(A + B == 20) {
				System.out.println("A + B == 20");
			}else {
			System.out.println("Numero nao valido.");
		}
	}

	public static void item12(double A, double B) {
		
		if(A > 10) {
			System.out.println("A > 10");
		}if(A + B == 20) {
			System.out.println("A + B == 20");
		}else if(A <= 10 && A + B != 20) {
			System.out.println("Numeros nao validos.");
		}
		System.out.println("Sejam bem-vindos a disciplina de Tecnicas de Programacao.");
	}

	public static void item13(double A, double B) {
		
		if(A > 10) {
			System.out.println("A > 10");
		}if(A + B == 20) {
			System.out.println("A + B == 20");
		}else if(A < 10 && A + B != 20){
			System.out.println("Numeros nao validos");
		}
	}
}