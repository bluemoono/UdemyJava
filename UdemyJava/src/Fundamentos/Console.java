package Fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia");
		
		System.out.println("Bom");
		System.out.println(" dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d", 23,53,75,86,99,12);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
			
		System.out.println("\n\nNome: "+nome+ " "+sobrenome);
		entrada.close();
	}
}
