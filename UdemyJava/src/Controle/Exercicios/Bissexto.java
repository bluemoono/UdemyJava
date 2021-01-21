package Controle.Exercicios;

import java.util.Scanner;

public class Bissexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano atual: ");
		int ano = entrada.nextInt();
		int bissexto = ano % 4;
		
		if(bissexto == 0) {
			System.out.println("O ano é bissexto: "+ ano);
		} else {
			System.out.println("O ano não é bissexto: "+ano);
		}

		entrada.close();
	}
}
