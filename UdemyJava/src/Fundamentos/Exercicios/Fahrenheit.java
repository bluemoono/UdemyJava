package Fundamentos.Exercicios;

import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor em �C:");
		double c = entrada.nextDouble();
		final double D = 1.8;
		final double AJUSTE = 32;
		
		double resultado = c * D + AJUSTE;
		
		System.out.println("Sua convers�o deu: "+ resultado + "�F.");
		
		entrada.close();
	}
}
