package Controle.Exercicios;

import java.util.Scanner;

public class Positivos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		int soma = 0;
		
		while(numero >= 0) {
			System.out.println("Digite o número:");
			numero = entrada.nextInt();
			
			if(numero >= 0) {
				soma += numero;
				System.out.printf("\nSoma:\n %d \n", soma);
			}
		}

		entrada.close();
	}
}
