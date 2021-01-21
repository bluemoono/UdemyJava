package Fundamentos.Exercicios;

import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor para quadrado:");
		String q = entrada.next();
		System.out.println("Digite o valor para cubo:");
		String c = entrada.next();
		
		double quadrado = Double.parseDouble(q);
		double cubo = Double.parseDouble(c);
		
		double qr = Math.pow(quadrado, 2);
		double cr = Math.pow(cubo, 3);
		
		System.out.println("Quadrado: "+ qr);
		System.out.println("Cubo: "+ cr);
		
		entrada.close();
	}
}
