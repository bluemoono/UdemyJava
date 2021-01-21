package Fundamentos.Desafio;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		String n1 = entrada.next();
		System.out.println("Digite o segundo número:");
		String n2 = entrada.next();
		System.out.println("Digite a operação:");
		String op = entrada.next();
		
		double v1 = Double.parseDouble(n1);
		double v2 = Double.parseDouble(n2);
		
		double r = "+".equals(op) ? v1 + v2 : 0;
		r = "-".equals(op) ? v1 - v2 : r;
		r = "/".equals(op) ? v1 / v2 : r;
		r = "*".equals(op) ? v1 * v2 : r;
		r = "%".equals(op) ? v1 % v2 : r;
		
		System.out.printf("%.2f %s %.2f = %.2f", v1, op, v2, r);
		
		entrada.close();
	}
}
