package Controle.Exercicios;

import java.util.Scanner;

public class SwitchPrimos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o n�mero");
		int numero = entrada.nextInt();
		int contador = 0;
		
		for (int i = 0; i < numero; i++) {
			if(numero % 2 == 0) {
				contador++;
			}
		}
		
		switch (contador) {
		case 0:
			System.out.println("� primo");
			break;

		default:
			System.out.println("N�o � primo");
			break;
		}
		
		entrada.close();
	}
}
