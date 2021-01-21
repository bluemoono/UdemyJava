package Fundamentos.Exercicios;

import java.util.Scanner;

public class SegundoGrau {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do X: ");
		String e = entrada.next();
		final double A = 1;  
		final double B = 12;  
		final double C = -13;
		
		double x = Double.parseDouble(e);
		
//		double calculo = A*(x*x) + B*x + C = 0;
		double bask = -B +- Math.sqrt(Math.pow(B, 2)-4*A*C) /2*A;
		
		System.out.println(x);
		System.out.println(bask);
		entrada.close();
	}
}
