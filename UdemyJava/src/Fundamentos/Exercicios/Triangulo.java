package Fundamentos.Exercicios;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Base:");
		String b = entrada.next();
		System.out.println("Altura:");
		String a = entrada.next();
		
		double base = Double.parseDouble(b);
		double altura = Double.parseDouble(a);
		double area = base*altura/2;
		
		System.out.println("A área do tringulo é: "+area);
		
		entrada.close();
	}
}
