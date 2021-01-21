package Fundamentos.Exercicios;

import java.util.Scanner;

public class Celsius {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor em ºF:");
		double f = entrada.nextDouble();
		final double AJUSTE = 32;
		final double DIVISAO = 5.0/9;
		
		double resultado = (f - AJUSTE) * DIVISAO;
		
		System.out.println("Sua conversão deu: "+ resultado +"ºF.");
		
		entrada.close();
	}
}
