package Fundamentos.Exercicios;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
		String p = entrada.next();
		System.out.println("Digite sua altura:");
		String a = entrada.next();
		
		double peso = Double.parseDouble(p);
		double altura = Double.parseDouble(a);
		double imc = peso/Math.pow(altura, 2);
		
		System.out.println("IMC: "+imc);
		
		entrada.close();
	}
}
