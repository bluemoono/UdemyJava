package Controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Quer sair? Diga as palavra mágicas:");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Finalizado");
		
		entrada.close();
	}
}
